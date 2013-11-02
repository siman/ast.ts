var tsapi = require("typescript.api"),
	fs = require('fs'),
	dust = require('dustjs-linkedin'),
	dustHelp = require('dustjs-helpers');

// var sourceUnit = tsapi.create("temp.ts", "var value:number = 123;");
// var sourceUnit = "./jquery.d.ts";

// var tsFile = './jquery.ts';
var tsFile = './jquery.ts';

var template = fs.readFileSync("./templates/scala/source.dust", 'utf8');
console.log("template:\n" + template);

// To preserve spaces
// dust.optimizers.format = function(ctx, node) { return node };

var compiled = dust.compile(template, "source", false);
dust.loadSource(compiled);

tsapi.resolve([tsFile], function(resolved) {
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
					fs.writeFile(tsFile + ".scala", out, function(err) {
					    if (err) {
					    	console.log(err);
					    } else {
					    	console.log("Written to source file");
					    }
					});
				});
				// console.log("output:\n" + output);	 

				fs.writeFile(tsFile + ".ast" + n + '.json', JSON.stringify(res, null, 4), function(err) {
				    if (err) {
				    	console.log(err);
				    } else {
				    	console.log("AST exported to JSON file");
				    }
				}); 

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