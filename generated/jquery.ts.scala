trait JQueryAjaxSettings {
  var accepts: Option[Any]
  var async: Option[Boolean]
  var cache: Option[Boolean]
  var contents: Option[Any]
  var contentType: Option[Any]
  var context: Option[Any]
  var converters: Option[Any]
  var crossDomain: Option[Boolean]
  var data: Option[Any]
  var dataType: Option[String]
  var global: Option[Boolean]
  var headers: Option[Any]
  var ifModified: Option[Boolean]
  var isLocal: Option[Boolean]
  var jsonp: Option[String]
  var jsonpCallback: Option[Any]
  var mimeType: Option[String]
  var password: Option[String]
  var processData: Option[Boolean]
  var scriptCharset: Option[String]
  var statusCode: Option[Any]
  var timeout: Option[Int]
  var traditional: Option[Boolean]
  var `type`: Option[String]
  var url: Option[String]
  var username: Option[String]
  var xhr: Option[Any]
  var xhrFields: Option[Any]
  def beforeSend(jqXHR: JQueryXHR, settings: JQueryAjaxSettings): Any
  def complete(jqXHR: JQueryXHR, textStatus: String): Any
  def dataFilter(data: Any, ty: Any): Any
  def error(jqXHR: JQueryXHR, textStatus: String, errorThrow: String): Any
  def success(data: Any, textStatus: String, jqXHR: JQueryXHR): Any
}
trait JQueryXHR {
  def overrideMimeType(mimeType: String): Any
  def abort(statusText: Option[String]): void
}
trait JQueryCallback {
  def add(callbacks: Any): Any
  def disable(): Any
  def empty(): Any
  def fire(arguments: Any): Any
  def fired(): Boolean
  def fireWith(context: Any, args: Any): Any
  def has(callback: Any): Boolean
  def lock(): Any
  def locked(): Boolean
  def remove(callbacks: Any): Any
}
trait JQueryGenericPromise {
  def then(onFulfill: Function, onReject: Option[Function]): JQueryGenericPromise[U]
  def then(onFulfill: Function, onReject: Option[Function]): JQueryGenericPromise[U]
  def then(onFulfill: Function, onReject: Option[Function]): JQueryGenericPromise[U]
  def then(onFulfill: Function, onReject: Option[Function]): JQueryGenericPromise[U]
}
trait JQueryPromise {
  def always(alwaysCallbacks: Any): JQueryPromise[T]
  def done(doneCallbacks: Any): JQueryPromise[T]
  def fail(failCallbacks: Any): JQueryPromise[T]
  def progress(progressCallbacks: Any): JQueryPromise[T]
  def pipe(doneFilter: Option[Function], failFilter: Option[Function], progressFilter: Option[Function]): JQueryPromise[Any]
  def then(onFulfill: Function, onReject: Option[Function], onProgress: Option[Function]): JQueryPromise[U]
  def then(onFulfill: Function, onReject: Option[Function], onProgress: Option[Function]): JQueryPromise[U]
  def then(onFulfill: Function, onReject: Option[Function], onProgress: Option[Function]): JQueryPromise[U]
  def then(onFulfill: Function, onReject: Option[Function], onProgress: Option[Function]): JQueryPromise[U]
  def then(onFulfill: Function, onReject: Option[Function], onProgress: Option[Function]): JQueryPromise[U]
  def then(onFulfill: Function, onReject: Option[Function], onProgress: Option[Function]): JQueryPromise[U]
  def then(onFulfill: Function, onReject: Option[Function], onProgress: Option[Function]): JQueryPromise[U]
  def then(onFulfill: Function, onReject: Option[Function], onProgress: Option[Function]): JQueryPromise[U]
}
trait JQueryDeferred {
  def always(alwaysCallbacks: Any): JQueryDeferred[T]
  def done(doneCallbacks: Any): JQueryDeferred[T]
  def fail(failCallbacks: Any): JQueryDeferred[T]
  def progress(progressCallbacks: Any): JQueryDeferred[T]
  def notify(args: Any): JQueryDeferred[T]
  def notifyWith(context: Any, args: Any): JQueryDeferred[T]
  def reject(args: Any): JQueryDeferred[T]
  def rejectWith(context: Any, args: Any): JQueryDeferred[T]
  def resolve(`val`: T): JQueryDeferred[T]
  def resolve(args: Any): JQueryDeferred[T]
  def resolveWith(context: Any, args: Any): JQueryDeferred[T]
  def state(): String
  def promise(target: Option[Any]): JQueryPromise[T]
}
trait BaseJQueryEventObject {
  var data: Any
  var delegateTarget: Element
  var namespace: String
  var relatedTarget: Element
  var result: Any
  var pageX: Int
  var pageY: Int
  var which: Int
  var metaKey: Any
  def isDefaultPrevented(): Boolean
  def isImmediatePropogationStopped(): Boolean
  def isPropagationStopped(): Boolean
  def preventDefault(): Any
  def stopImmediatePropagation(): void
  def stopPropagation(): void
}
trait JQueryInputEventObject {
  var altKey: Boolean
  var ctrlKey: Boolean
  var metaKey: Boolean
  var shiftKey: Boolean
}
trait JQueryMouseEventObject {
  var button: Int
  var clientX: Int
  var clientY: Int
  var offsetX: Int
  var offsetY: Int
  var pageX: Int
  var pageY: Int
  var screenX: Int
  var screenY: Int
}
trait JQueryKeyEventObject {
  var char: Any
  var charCode: Int
  var key: Any
  var keyCode: Int
}
trait JQueryPopStateEventObject {
  var originalEvent: PopStateEvent
}
trait JQueryEventObject {
}
trait JQuerySupport {
  var ajax: Option[Boolean]
  var boxModel: Option[Boolean]
  var changeBubbles: Option[Boolean]
  var checkClone: Option[Boolean]
  var checkOn: Option[Boolean]
  var cors: Option[Boolean]
  var cssFloat: Option[Boolean]
  var hrefNormalized: Option[Boolean]
  var htmlSerialize: Option[Boolean]
  var leadingWhitespace: Option[Boolean]
  var noCloneChecked: Option[Boolean]
  var noCloneEvent: Option[Boolean]
  var opacity: Option[Boolean]
  var optDisabled: Option[Boolean]
  var optSelected: Option[Boolean]
  var style: Option[Boolean]
  var submitBubbles: Option[Boolean]
  var tbody: Option[Boolean]
  def scriptEval(): Boolean
}
trait JQueryParam {
  def _call(obj: Any): String
  def _call(obj: Any, traditional: Boolean): String
}
trait JQueryStatic {
  var ajaxSettings: JQueryAjaxSettings
  var param: JQueryParam
  var cssHooks: Any
  var cssNumber: Any
  var fx: Any
  var Event: Any
  var expr: Any
  var fn: Any
  var isReady: Boolean
  var support: JQuerySupport
  def ajax(settings: JQueryAjaxSettings): JQueryXHR
  def ajax(url: String, settings: Option[JQueryAjaxSettings]): JQueryXHR
  def ajaxPrefilter(dataTypes: String, handler: Function): Any
  def ajaxPrefilter(handler: Function): Any
  def ajaxSetup(): void
  def ajaxSetup(options: JQueryAjaxSettings): void
  def get(url: String, data: Option[Any], success: Option[Any], dataType: Option[Any]): JQueryXHR
  def getJSON(url: String, data: Option[Any], success: Option[Any]): JQueryXHR
  def getScript(url: String, success: Option[Any]): JQueryXHR
  def post(url: String, data: Option[Any], success: Option[Any], dataType: Option[Any]): JQueryXHR
  def Callbacks(flags: Option[String]): JQueryCallback
  def holdReady(hold: Boolean): Any
  def _call(selector: String, context: Option[Any]): JQuery
  def _call(element: Element): JQuery
  def _call(`object`: Any): JQuery
  def _call(elementArray: Element): JQuery
  def _call(`object`: JQuery): JQuery
  def _call(func: Function): JQuery
  def _call(array: Any): JQuery
  def _call(): JQuery
  def noConflict(removeAll: Option[Boolean]): Object
  def when(deferreds: JQueryGenericPromise): JQueryPromise[T]
  def when(deferreds: T): JQueryPromise[T]
  def when(deferreds: Any): JQueryPromise[T]
  def css(e: Any, propertyName: String, value: Option[Any]): Any
  def css(e: Any, propertyName: Any, value: Option[Any]): Any
  def data(element: Element, key: String, value: Any): Any
  def data(element: Element, key: String): Any
  def data(element: Element): Any
  def dequeue(element: Element, queueName: Option[String]): Any
  def hasData(element: Element): Boolean
  def queue(element: Element, queueName: Option[String]): Any
  def queue(element: Element, queueName: String, newQueueOrCallback: Any): JQuery
  def removeData(element: Element, name: Option[String]): JQuery
  def Deferred(beforeStart: Option[Function]): JQueryDeferred[T]
  def proxy(fn: Function, context: Any, args: Any): Any
  def proxy(context: Any, name: String, args: Any): Any
  def error(message: Any): JQuery
  def contains(container: Element, contained: Element): Boolean
  def each(collection: Any, callback: Function): Any
  def each(collection: JQuery, callback: Function): Any
  def each(collection: T, callback: Function): Any
  def extend(target: Any, objs: Any): Any
  def extend(deep: Boolean, target: Any, objs: Any): Any
  def globalEval(code: String): Any
  def grep(array: T, func: Function, invert: Option[Boolean]): T
  def inArray(value: T, array: T, fromIndex: Option[Int]): Int
  def isArray(obj: Any): Boolean
  def isEmptyObject(obj: Any): Boolean
  def isFunction(obj: Any): Boolean
  def isNumeric(value: Any): Boolean
  def isPlainObject(obj: Any): Boolean
  def isWindow(obj: Any): Boolean
  def isXMLDoc(node: Node): Boolean
  def makeArray(obj: Any): Any
  def map(array: T, callback: Function): U
  def map(array: Any, callback: Function): Any
  def merge(first: T, second: T): T
  def merge(first: T, second: U): Any
  def noop(): Any
  def now(): Int
  def parseJSON(json: String): Any
  def parseXML(data: String): Any
  def queue(element: Element, queueName: String, newQueue: Any): JQuery
  def trim(str: String): String
  def `type`(obj: Any): String
  def unique(arr: Any): Any
  def parseHTML(data: String, context: Option[HTMLElement], keepScripts: Option[Boolean]): Any
  def Animation(elem: Any, properties: Any, options: Any): Any
}
trait JQuery {
  var context: Element
  var jquery: String
  var length: Int
  var selector: String
  def ajaxComplete(handler: Any): JQuery
  def ajaxError(handler: Function): JQuery
  def ajaxSend(handler: Function): JQuery
  def ajaxStart(handler: Function): JQuery
  def ajaxStop(handler: Function): JQuery
  def ajaxSuccess(handler: Function): JQuery
  def load(url: String, data: Option[Any], complete: Option[Any]): JQuery
  def serialize(): String
  def serializeArray(): Any
  def addClass(classNames: String): JQuery
  def addClass(func: Function): JQuery
  def addBack(selector: Option[String]): JQuery
  def attr(attributeName: String): String
  def attr(attributeName: String, value: Any): JQuery
  def attr(map: Any): JQuery
  def attr(attributeName: String, func: Function): JQuery
  def hasClass(className: String): Boolean
  def html(): String
  def html(htmlString: String): JQuery
  def html(htmlContent: Function): JQuery
  def html(obj: JQuery): JQuery
  def prop(propertyName: String): Any
  def prop(propertyName: String, value: Any): JQuery
  def prop(map: Any): JQuery
  def prop(propertyName: String, func: Function): JQuery
  def removeAttr(attributeName: Any): JQuery
  def removeClass(className: Option[Any]): JQuery
  def removeClass(func: Function): JQuery
  def removeProp(propertyName: Any): JQuery
  def toggleClass(className: Any, swtch: Option[Boolean]): JQuery
  def toggleClass(swtch: Option[Boolean]): JQuery
  def toggleClass(func: Function): JQuery
  def `val`(): Any
  def `val`(value: String): JQuery
  def `val`(value: String): JQuery
  def `val`(value: Int): JQuery
  def `val`(func: Function): JQuery
  def css(propertyName: String): String
  def css(propertyNames: String): String
  def css(properties: Any): JQuery
  def css(propertyName: String, value: Any): JQuery
  def css(propertyName: Any, value: Any): JQuery
  def height(): Int
  def height(value: Int): JQuery
  def height(value: String): JQuery
  def height(func: Function): JQuery
  def innerHeight(): Int
  def innerHeight(value: Int): JQuery
  def innerWidth(): Int
  def innerWidth(value: Int): JQuery
  def offset(): Any
  def offset(coordinates: Any): JQuery
  def offset(func: Function): JQuery
  def outerHeight(includeMargin: Option[Boolean]): Int
  def outerHeight(value: Int, includeMargin: Option[Boolean]): JQuery
  def outerWidth(includeMargin: Option[Boolean]): Int
  def outerWidth(value: Int, includeMargin: Option[Boolean]): JQuery
  def position(): Any
  def scrollLeft(): Int
  def scrollLeft(value: Int): JQuery
  def scrollTop(): Int
  def scrollTop(value: Int): JQuery
  def width(): Int
  def width(value: Int): JQuery
  def width(value: String): JQuery
  def width(func: Function): JQuery
  def clearQueue(queueName: Option[String]): JQuery
  def data(key: String, value: Any): JQuery
  def data(obj: Any): JQuery
  def data(key: Option[String]): Any
  def dequeue(queueName: Option[String]): JQuery
  def removeData(nameOrList: Option[Any]): JQuery
  def promise(`type`: Option[Any], target: Option[Any]): JQueryPromise[Any]
  def animate(properties: Any, duration: Option[Any], complete: Option[Function]): JQuery
  def animate(properties: Any, duration: Option[Any], easing: Option[String], complete: Option[Function]): JQuery
  def animate(properties: Any, options: Any): JQuery
  def delay(duration: Int, queueName: Option[String]): JQuery
  def fadeIn(duration: Option[Any], callback: Option[Any]): JQuery
  def fadeIn(duration: Option[Any], easing: Option[String], callback: Option[Any]): JQuery
  def fadeOut(duration: Option[Any], callback: Option[Any]): JQuery
  def fadeOut(duration: Option[Any], easing: Option[String], callback: Option[Any]): JQuery
  def fadeTo(duration: Any, opacity: Int, callback: Option[Any]): JQuery
  def fadeTo(duration: Any, opacity: Int, easing: Option[String], callback: Option[Any]): JQuery
  def fadeToggle(duration: Option[Any], callback: Option[Any]): JQuery
  def fadeToggle(duration: Option[Any], easing: Option[String], callback: Option[Any]): JQuery
  def finish(): JQuery
  def hide(duration: Option[Any], callback: Option[Any]): JQuery
  def hide(duration: Option[Any], easing: Option[String], callback: Option[Any]): JQuery
  def show(duration: Option[Any], callback: Option[Any]): JQuery
  def show(duration: Option[Any], easing: Option[String], callback: Option[Any]): JQuery
  def slideDown(duration: Option[Any], callback: Option[Any]): JQuery
  def slideDown(duration: Option[Any], easing: Option[String], callback: Option[Any]): JQuery
  def slideToggle(duration: Option[Any], callback: Option[Any]): JQuery
  def slideToggle(duration: Option[Any], easing: Option[String], callback: Option[Any]): JQuery
  def slideUp(duration: Option[Any], callback: Option[Any]): JQuery
  def slideUp(duration: Option[Any], easing: Option[String], callback: Option[Any]): JQuery
  def stop(clearQueue: Option[Boolean], jumpToEnd: Option[Boolean]): JQuery
  def stop(queue: Option[Any], clearQueue: Option[Boolean], jumpToEnd: Option[Boolean]): JQuery
  def toggle(duration: Option[Any], callback: Option[Any]): JQuery
  def toggle(duration: Option[Any], easing: Option[String], callback: Option[Any]): JQuery
  def toggle(showOrHide: Boolean): JQuery
  def bind(eventType: String, eventData: Option[Any], handler: Option[Function]): JQuery
  def bind(eventType: String, eventData: Any, preventBubble: Boolean): JQuery
  def bind(eventType: String, preventBubble: Boolean): JQuery
  def bind(events: Any): JQuery
  def blur(eventData: Option[Any], handler: Option[Function]): JQuery
  def blur(handler: Function): JQuery
  def change(eventData: Option[Any], handler: Option[Function]): JQuery
  def change(handler: Function): JQuery
  def click(eventData: Option[Any], handler: Option[Function]): JQuery
  def click(handler: Function): JQuery
  def dblclick(eventData: Option[Any], handler: Option[Function]): JQuery
  def dblclick(handler: Function): JQuery
  def delegate(selector: Any, eventType: String, handler: Function): JQuery
  def focus(eventData: Option[Any], handler: Option[Function]): JQuery
  def focus(handler: Function): JQuery
  def focusin(eventData: Any, handler: Function): JQuery
  def focusin(handler: Function): JQuery
  def focusout(eventData: Any, handler: Function): JQuery
  def focusout(handler: Function): JQuery
  def hover(handlerIn: Function, handlerOut: Function): JQuery
  def hover(handlerInOut: Function): JQuery
  def keydown(eventData: Option[Any], handler: Option[Function]): JQuery
  def keydown(handler: Function): JQuery
  def keypress(eventData: Option[Any], handler: Option[Function]): JQuery
  def keypress(handler: Function): JQuery
  def keyup(eventData: Option[Any], handler: Option[Function]): JQuery
  def keyup(handler: Function): JQuery
  def load(eventData: Option[Any], handler: Option[Function]): JQuery
  def load(handler: Function): JQuery
  def mousedown(): JQuery
  def mousedown(eventData: Any, handler: Function): JQuery
  def mousedown(handler: Function): JQuery
  def mouseevent(eventData: Any, handler: Function): JQuery
  def mouseevent(handler: Function): JQuery
  def mouseenter(): JQuery
  def mouseenter(eventData: Any, handler: Function): JQuery
  def mouseenter(handler: Function): JQuery
  def mouseleave(): JQuery
  def mouseleave(eventData: Any, handler: Function): JQuery
  def mouseleave(handler: Function): JQuery
  def mousemove(): JQuery
  def mousemove(eventData: Any, handler: Function): JQuery
  def mousemove(handler: Function): JQuery
  def mouseout(): JQuery
  def mouseout(eventData: Any, handler: Function): JQuery
  def mouseout(handler: Function): JQuery
  def mouseover(): JQuery
  def mouseover(eventData: Any, handler: Function): JQuery
  def mouseover(handler: Function): JQuery
  def mouseup(): JQuery
  def mouseup(eventData: Any, handler: Function): JQuery
  def mouseup(handler: Function): JQuery
  def off(events: Option[String], selector: Option[Any], handler: Option[Function]): JQuery
  def off(eventsMap: Any, selector: Option[Any]): JQuery
  def on(events: String, selector: Option[Any], data: Option[Any], handler: Option[Function]): JQuery
  def on(events: String, selector: Option[Any], handler: Option[Function]): JQuery
  def on(eventsMap: Any, selector: Option[Any], data: Option[Any]): JQuery
  def one(events: String, selector: Option[Any], data: Option[Any], handler: Option[Function]): JQuery
  def one(eventsMap: Any, selector: Option[Any], data: Option[Any]): JQuery
  def ready(handler: Any): JQuery
  def resize(eventData: Option[Any], handler: Option[Function]): JQuery
  def resize(handler: Function): JQuery
  def scroll(eventData: Option[Any], handler: Option[Function]): JQuery
  def scroll(handler: Function): JQuery
  def select(eventData: Option[Any], handler: Option[Function]): JQuery
  def select(handler: Function): JQuery
  def submit(eventData: Option[Any], handler: Option[Function]): JQuery
  def submit(handler: Function): JQuery
  def trigger(eventType: String, extraParameters: Any): JQuery
  def trigger(event: JQueryEventObject): JQuery
  def triggerHandler(eventType: String, extraParameters: Any): Object
  def unbind(eventType: Option[String], handler: Option[Function]): JQuery
  def unbind(eventType: String, fls: Boolean): JQuery
  def unbind(evt: Any): JQuery
  def undelegate(): JQuery
  def undelegate(selector: Any, eventType: String, handler: Option[Function]): JQuery
  def undelegate(selector: Any, events: Any): JQuery
  def undelegate(namespace: String): JQuery
  def unload(eventData: Option[Any], handler: Option[Function]): JQuery
  def unload(handler: Function): JQuery
  def error(handler: Function): JQuery
  def error(eventData: Any, handler: Function): JQuery
  def pushStack(elements: Any): JQuery
  def pushStack(elements: Any, name: Any, arguments: Any): JQuery
  def after(content: Any): JQuery
  def after(func: Function): JQuery
  def append(content: Any): JQuery
  def append(func: Function): JQuery
  def appendTo(target: Any): JQuery
  def before(content: Any): JQuery
  def before(func: Function): JQuery
  def clone(withDataAndEvents: Option[Boolean], deepWithDataAndEvents: Option[Boolean]): JQuery
  def detach(selector: Option[Any]): JQuery
  def empty(): JQuery
  def insertAfter(target: Any): JQuery
  def insertBefore(target: Any): JQuery
  def prepend(content: Any): JQuery
  def prepend(func: Function): JQuery
  def prependTo(target: Any): JQuery
  def remove(selector: Option[Any]): JQuery
  def replaceAll(target: Any): JQuery
  def replaceWith(func: Any): JQuery
  def text(): String
  def text(textString: Any): JQuery
  def text(textString: Function): JQuery
  def toArray(): Any
  def unwrap(): JQuery
  def wrap(wrappingElement: Any): JQuery
  def wrap(func: Function): JQuery
  def wrapAll(wrappingElement: Any): JQuery
  def wrapInner(wrappingElement: Any): JQuery
  def wrapInner(func: Function): JQuery
  def each(func: Function): JQuery
  def get(index: Option[Int]): Any
  def index(): Int
  def index(selector: String): Int
  def index(element: Any): Int
  def __item(x: String): Any
  def __item(x: Int): HTMLElement
  def add(selector: String, context: Option[Any]): JQuery
  def add(elements: Any): JQuery
  def add(html: String): JQuery
  def add(obj: JQuery): JQuery
  def children(selector: Option[Any]): JQuery
  def closest(selector: String): JQuery
  def closest(selector: String, context: Option[Element]): JQuery
  def closest(obj: JQuery): JQuery
  def closest(element: Any): JQuery
  def closest(selectors: Any, context: Option[Element]): Any
  def contents(): JQuery
  def end(): JQuery
  def eq(index: Int): JQuery
  def filter(selector: String): JQuery
  def filter(func: Function): JQuery
  def filter(element: Any): JQuery
  def filter(obj: JQuery): JQuery
  def find(selector: String): JQuery
  def find(element: Any): JQuery
  def find(obj: JQuery): JQuery
  def first(): JQuery
  def has(selector: String): JQuery
  def has(contained: Element): JQuery
  def is(selector: String): Boolean
  def is(func: Function): Boolean
  def is(element: Any): Boolean
  def is(obj: JQuery): Boolean
  def last(): JQuery
  def map(callback: Function): JQuery
  def next(selector: Option[String]): JQuery
  def nextAll(selector: Option[String]): JQuery
  def nextUntil(selector: Option[String], filter: Option[String]): JQuery
  def nextUntil(element: Option[Element], filter: Option[String]): JQuery
  def not(selector: String): JQuery
  def not(func: Function): JQuery
  def not(element: Any): JQuery
  def not(obj: JQuery): JQuery
  def offsetParent(): JQuery
  def parent(selector: Option[String]): JQuery
  def parents(selector: Option[String]): JQuery
  def parentsUntil(selector: Option[String], filter: Option[String]): JQuery
  def parentsUntil(element: Option[Element], filter: Option[String]): JQuery
  def parentsUntil(obj: Option[JQuery], filter: Option[String]): JQuery
  def prev(selector: Option[String]): JQuery
  def prevAll(selector: Option[String]): JQuery
  def prevUntil(selector: Option[String], filter: Option[String]): JQuery
  def prevUntil(element: Option[Element], filter: Option[String]): JQuery
  def siblings(selector: Option[String]): JQuery
  def slice(start: Int, end: Option[Int]): JQuery
  def queue(queueName: Option[String]): Any
  def queue(queueName: String, newQueueOrCallback: Any): JQuery
  def queue(newQueueOrCallback: Any): JQuery
}
