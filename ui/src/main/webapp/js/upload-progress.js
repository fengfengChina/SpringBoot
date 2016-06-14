jQuery.extend({
	createXHR: function() {
		if (typeof XMLHttpRequest != "undefined") {
			return new XMLHttpRequest();
		} else if (typeof ActiveXObject != "undefined") {
			if (typeof arguments.callee.activeXString != "string") {
				var versions = ["MSXML2.XMLHttp.6.0", "MSXML2.XMLHttp.3.0", "MSXML2.XMLHttp"],
				i,
				len;

				for (i = 0, len = versions.length; i < len; i++) {
					try {
						var xhr = new ActiveXObject(versions[i]);
						arguments.callee.activeXString = versions[i];
						return xhr;
					} catch(ex) {
						//skip
					}
				}
			}

			return new ActiveXObject(arguments.callee.activeXString);
		} else {
			throw new Error("No XHR object available.");
		}
	},

	ajaxFileUpload: function(s) {
		// TODO introduce global settings, allowing the client to modify them for all requests, not only timeout
		s = jQuery.extend({},
		jQuery.ajaxSettings, s);
		var id = new Date().getTime();

		var fd = new FormData();
		fd.append("fileToUpload", document.getElementById('fileToUpload').files[0]);
		
		if(s.data){
			for(i in data){
				fd.append(i,data[i]);
			}
		}
		
		
		// Watch for a new set of requests
		if (s.global && !jQuery.active++) {
			jQuery.event.trigger("ajaxStart");
		}
		var requestDone = false;
		// Create the request object
		var xhr = jQuery.createXHR();
		if (s.progress) {
			/*xhr.upload.addEventListener("progress", function (evt) {
			    // display uploading progress infomation...
				s.progress(evt);
			});*/
			xhr.upload.onprogress = function(evt) {
				s.progress(evt);
			};
		}
		var xml = [];
		if (s.global) jQuery.event.trigger("ajaxSend", [xml, s]);
		// Wait for a response to come back
		var uploadCallback = function(isTimeout) {
			xml = xhr;
			if (xml || isTimeout == "timeout") {
				requestDone = true;
				var status;
				try {
					status = isTimeout != "timeout" ? "success": "error";
					// Make sure that the request was successful or notmodified
					if (status != "error") {
						// process the data (runs the xml through httpData regardless of callback)
						var data = jQuery.uploadHttpData(xml, s.dataType);
						// If a local callback was specified, fire it and pass it the data
						if (s.success) s.success(data, status);

						// Fire the global callback
						if (s.global) jQuery.event.trigger("ajaxSuccess", [xml, s]);
					} else jQuery.handleError(s, xml, status);
				} catch(e) {
					status = "error";
					jQuery.handleError(s, xml, status, e);
				}

				// The request was completed
				if (s.global) jQuery.event.trigger("ajaxComplete", [xml, s]);

				// Handle the global AJAX counter
				if (s.global && !--jQuery.active) jQuery.event.trigger("ajaxStop");

				// Process result
				if (s.complete) s.complete(xml, status);

				xml = null;

			}
		};
		// Timeout checker
		if (s.timeout > 0) {
			setTimeout(function() {
				// Check to see if the request is still happening
				if (!requestDone) uploadCallback("timeout");
			},
			s.timeout);
		}
		try {
			var method = s.method ? s.method: 'POST';
			xhr.open(method, s.url);
			xhr.send(fd);

		} catch(e) {
			jQuery.handleError(s, xml, null, e);
		}

		xhr.onreadystatechange = function(e) {
			if (xhr.readyState == 4) uploadCallback();
		};
		return {
			abort: function() {}
		};

	},

	uploadHttpData: function(r, type) {
		var data = !type;
		data = type == "xml" || data ? r.responseXML: r.responseText;
		// If the type is "script", eval it in global context
		if (type == "script") jQuery.globaleval_r(data);
		// Get the JavaScript object, if JSON is used.
		if (type == "json") eval_r("data = " + data);
		// evaluate scripts within html
		if (type == "html") jQuery("<div>").html(data).evalScripts();

		return data;
	},
	handleError: function(s, xhr, status, e) {
		// If a local callback was specified, fire it
		if (s.error) {
			s.error.call(s.context || s, xhr, status, e);
		}

		// Fire the global callback
		if (s.global) { (s.context ? jQuery(s.context) : jQuery.event).trigger("ajaxError", [xhr, s, e]);
		}
	}
})