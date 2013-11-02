/// <reference path="jquery.d.ts" />

interface JQueryXHR extends XMLHttpRequest, JQueryPromise<any> {
	
	username?: string;
	admin: boolean;

    overrideMimeType<R>(mimeType: string): JQueryPromise<R>;
    abort(statusText?: string): void;
}

function show_diagnostics (units) {
    for(var n in units) {
        for(var m in units[n].diagnostics) {
            //console.log( units[n].diagnostics[m].toString() );
        }
    }
}

