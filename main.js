var tsapi = require("typescript.api"),
	_ = require('underscore'),
	fs = require('fs'),
	dust = require('dustjs-linkedin'),
	dustHelp = require('dustjs-helpers');


// SETTINGS
var typeMap = function() {
	var self = this;

	function readTypeMap() {
		var text = fs.readFileSync("./typemap.js", "utf8");
		var json = JSON.parse(text);
		return json;
	}

	this.json = readTypeMap();

	this.isKeyword = function(testKW) {
		return self.json.keywords.indexOf(testKW) > -1;
	};

	return this;
}();



// var tsFile = 'jquery.ts';
var tsFile = 'jquery.ts';

var template = fs.readFileSync("./templates/scala/source.dust", "utf8");
console.log("template:\n" + template);

// To preserve spaces
// dust.optimizers.format = function(ctx, node) { return node };

dust.filters.kw = function(ident) { 
	return typeMap.isKeyword(ident) ? "`" + ident + "`" : ident; 
};
dust.filters.mt = function(tsType) { 
	var scalaType = typeMap.json.typeMap[tsType];
	return (typeof scalaType === "undefined") ? tsType : scalaType; 
};

var compiled = dust.compile(template, "source", false);
dust.loadSource(compiled);

tsapi.resolve(["definitions/" + tsFile], function(resolved) {
    if (!tsapi.check(resolved)) {
        show_diagnostics(resolved);
    } else {
        tsapi.compile(resolved, function(compiled) {
		    for (var n in compiled) {
		        //console.log(compiled[n].content);
		        //console.log(compiled[n]);

		        //var ast = compiled[n].ast;
		        var res = compiled[n];

		        //console.log("Mustache: " + Mustache);

				dust.render("source", res.script, function(err, out) {
					console.log(out);
					fs.writeFile("generated/" + tsFile + ".scala", out, function(err) {
					    if (err) {
					    	console.log(err);
					    } else {
					    	console.log("Written to source file");
					    }
					});
				});
				// console.log("output:\n" + output);	 

				fs.writeFile("generated/" + tsFile + ".ast.json", JSON.stringify(res, null, 4), function(err) {
				    if (err) {
				    	console.log(err);
				    } else {
				    	console.log("AST exported to JSON file");
				    }
				}); 

				console.log("typemap: " + JSON.stringify(typeMap.json, null, 4));
				console.log("case: " + typeMap.isKeyword("case"));
				console.log("casa: " + typeMap.isKeyword("casa"));

		        //console.log(JSON.stringify(compiled[n].ast));
		    }
		});
    }
});

// show diagnostic errors.
function show_diagnostics (units) {
    for (var n in units) {
        for (var m in units[n].diagnostics) {
            console.log( units[n].diagnostics[m].toString());
        }
    }
}