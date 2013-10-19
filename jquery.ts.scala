trait JQueryAjaxSettings {
  def beforeSend(jqXHR: JQueryXHR, settings: JQueryAjaxSettings, ): any
  def complete(jqXHR: JQueryXHR, textStatus: string, ): any
  def dataFilter(data: any, ty: any, ): any
  def error(jqXHR: JQueryXHR, textStatus: string, errorThrow: string, ): any
  def success(data: any, textStatus: string, jqXHR: JQueryXHR, ): any
}
trait JQueryXHR {
  def overrideMimeType(mimeType: string, ): any
  def abort(statusText: Option[string], ): void
}
trait JQueryCallback {
  def add(callbacks: any, ): any
  def disable(): any
  def empty(): any
  def fire(arguments: any, ): any
  def fired(): boolean
  def fireWith(context: any, args: any, ): any
  def has(callback: any, ): boolean
  def lock(): any
  def locked(): boolean
  def remove(callbacks: any, ): any
}
trait JQueryGenericPromise {
  def then(onFulfill: Function, onReject: Option[Function], ): JQueryGenericPromise[U]
  def then(onFulfill: Function, onReject: Option[Function], ): JQueryGenericPromise[U]
  def then(onFulfill: Function, onReject: Option[Function], ): JQueryGenericPromise[U]
  def then(onFulfill: Function, onReject: Option[Function], ): JQueryGenericPromise[U]
}
trait JQueryPromise {
  def always(alwaysCallbacks: any, ): JQueryPromise[T]
  def done(doneCallbacks: any, ): JQueryPromise[T]
  def fail(failCallbacks: any, ): JQueryPromise[T]
  def progress(progressCallbacks: any, ): JQueryPromise[T]
  def pipe(doneFilter: Option[Function], failFilter: Option[Function], progressFilter: Option[Function], ): JQueryPromise[any]
  def then(onFulfill: Function, onReject: Option[Function], onProgress: Option[Function], ): JQueryPromise[U]
  def then(onFulfill: Function, onReject: Option[Function], onProgress: Option[Function], ): JQueryPromise[U]
  def then(onFulfill: Function, onReject: Option[Function], onProgress: Option[Function], ): JQueryPromise[U]
  def then(onFulfill: Function, onReject: Option[Function], onProgress: Option[Function], ): JQueryPromise[U]
  def then(onFulfill: Function, onReject: Option[Function], onProgress: Option[Function], ): JQueryPromise[U]
  def then(onFulfill: Function, onReject: Option[Function], onProgress: Option[Function], ): JQueryPromise[U]
  def then(onFulfill: Function, onReject: Option[Function], onProgress: Option[Function], ): JQueryPromise[U]
  def then(onFulfill: Function, onReject: Option[Function], onProgress: Option[Function], ): JQueryPromise[U]
}
trait JQueryDeferred {
  def always(alwaysCallbacks: any, ): JQueryDeferred[T]
  def done(doneCallbacks: any, ): JQueryDeferred[T]
  def fail(failCallbacks: any, ): JQueryDeferred[T]
  def progress(progressCallbacks: any, ): JQueryDeferred[T]
  def notify(args: any, ): JQueryDeferred[T]
  def notifyWith(context: any, args: any, ): JQueryDeferred[T]
  def reject(args: any, ): JQueryDeferred[T]
  def rejectWith(context: any, args: any, ): JQueryDeferred[T]
  def resolve(val: T, ): JQueryDeferred[T]
  def resolve(args: any, ): JQueryDeferred[T]
  def resolveWith(context: any, args: any, ): JQueryDeferred[T]
  def state(): string
  def promise(target: Option[any], ): JQueryPromise[T]
}
trait BaseJQueryEventObject {
  def isDefaultPrevented(): boolean
  def isImmediatePropogationStopped(): boolean
  def isPropagationStopped(): boolean
  def preventDefault(): any
  def stopImmediatePropagation(): void
  def stopPropagation(): void
}
trait JQueryInputEventObject {
}
trait JQueryMouseEventObject {
}
trait JQueryKeyEventObject {
}
trait JQueryPopStateEventObject {
}
trait JQueryEventObject {
}
trait JQuerySupport {
  def scriptEval(): boolean
}
trait JQueryParam {
  def _call(obj: any, ): string
  def _call(obj: any, traditional: boolean, ): string
}
trait JQueryStatic {
  def ajax(settings: JQueryAjaxSettings, ): JQueryXHR
  def ajax(url: string, settings: Option[JQueryAjaxSettings], ): JQueryXHR
  def ajaxPrefilter(dataTypes: string, handler: Function, ): any
  def ajaxPrefilter(handler: Function, ): any
  def ajaxSetup(): void
  def ajaxSetup(options: JQueryAjaxSettings, ): void
  def get(url: string, data: Option[any], success: Option[any], dataType: Option[any], ): JQueryXHR
  def getJSON(url: string, data: Option[any], success: Option[any], ): JQueryXHR
  def getScript(url: string, success: Option[any], ): JQueryXHR
  def post(url: string, data: Option[any], success: Option[any], dataType: Option[any], ): JQueryXHR
  def Callbacks(flags: Option[string], ): JQueryCallback
  def holdReady(hold: boolean, ): any
  def _call(selector: string, context: Option[any], ): JQuery
  def _call(element: Element, ): JQuery
  def _call(object: any, ): JQuery
  def _call(elementArray: Element, ): JQuery
  def _call(object: JQuery, ): JQuery
  def _call(func: Function, ): JQuery
  def _call(array: any, ): JQuery
  def _call(): JQuery
  def noConflict(removeAll: Option[boolean], ): Object
  def when(deferreds: JQueryGenericPromise, ): JQueryPromise[T]
  def when(deferreds: T, ): JQueryPromise[T]
  def when(deferreds: any, ): JQueryPromise[T]
  def css(e: any, propertyName: string, value: Option[any], ): any
  def css(e: any, propertyName: any, value: Option[any], ): any
  def data(element: Element, key: string, value: any, ): any
  def data(element: Element, key: string, ): any
  def data(element: Element, ): any
  def dequeue(element: Element, queueName: Option[string], ): any
  def hasData(element: Element, ): boolean
  def queue(element: Element, queueName: Option[string], ): any
  def queue(element: Element, queueName: string, newQueueOrCallback: any, ): JQuery
  def removeData(element: Element, name: Option[string], ): JQuery
  def Deferred(beforeStart: Option[Function], ): JQueryDeferred[T]
  def proxy(fn: Function, context: any, args: any, ): any
  def proxy(context: any, name: string, args: any, ): any
  def error(message: any, ): JQuery
  def contains(container: Element, contained: Element, ): boolean
  def each(collection: any, callback: Function, ): any
  def each(collection: JQuery, callback: Function, ): any
  def each(collection: T, callback: Function, ): any
  def extend(target: any, objs: any, ): any
  def extend(deep: boolean, target: any, objs: any, ): any
  def globalEval(code: string, ): any
  def grep(array: T, func: Function, invert: Option[boolean], ): T
  def inArray(value: T, array: T, fromIndex: Option[number], ): number
  def isArray(obj: any, ): boolean
  def isEmptyObject(obj: any, ): boolean
  def isFunction(obj: any, ): boolean
  def isNumeric(value: any, ): boolean
  def isPlainObject(obj: any, ): boolean
  def isWindow(obj: any, ): boolean
  def isXMLDoc(node: Node, ): boolean
  def makeArray(obj: any, ): any
  def map(array: T, callback: Function, ): U
  def map(array: any, callback: Function, ): any
  def merge(first: T, second: T, ): T
  def merge(first: T, second: U, ): any
  def noop(): any
  def now(): number
  def parseJSON(json: string, ): any
  def parseXML(data: string, ): any
  def queue(element: Element, queueName: string, newQueue: any, ): JQuery
  def trim(str: string, ): string
  def type(obj: any, ): string
  def unique(arr: any, ): any
  def parseHTML(data: string, context: Option[HTMLElement], keepScripts: Option[boolean], ): any
  def Animation(elem: any, properties: any, options: any, ): any
}
trait JQuery {
  def ajaxComplete(handler: any, ): JQuery
  def ajaxError(handler: Function, ): JQuery
  def ajaxSend(handler: Function, ): JQuery
  def ajaxStart(handler: Function, ): JQuery
  def ajaxStop(handler: Function, ): JQuery
  def ajaxSuccess(handler: Function, ): JQuery
  def load(url: string, data: Option[any], complete: Option[any], ): JQuery
  def serialize(): string
  def serializeArray(): any
  def addClass(classNames: string, ): JQuery
  def addClass(func: Function, ): JQuery
  def addBack(selector: Option[string], ): JQuery
  def attr(attributeName: string, ): string
  def attr(attributeName: string, value: any, ): JQuery
  def attr(map: any, ): JQuery
  def attr(attributeName: string, func: Function, ): JQuery
  def hasClass(className: string, ): boolean
  def html(): string
  def html(htmlString: string, ): JQuery
  def html(htmlContent: Function, ): JQuery
  def html(obj: JQuery, ): JQuery
  def prop(propertyName: string, ): any
  def prop(propertyName: string, value: any, ): JQuery
  def prop(map: any, ): JQuery
  def prop(propertyName: string, func: Function, ): JQuery
  def removeAttr(attributeName: any, ): JQuery
  def removeClass(className: Option[any], ): JQuery
  def removeClass(func: Function, ): JQuery
  def removeProp(propertyName: any, ): JQuery
  def toggleClass(className: any, swtch: Option[boolean], ): JQuery
  def toggleClass(swtch: Option[boolean], ): JQuery
  def toggleClass(func: Function, ): JQuery
  def val(): any
  def val(value: string, ): JQuery
  def val(value: string, ): JQuery
  def val(value: number, ): JQuery
  def val(func: Function, ): JQuery
  def css(propertyName: string, ): string
  def css(propertyNames: string, ): string
  def css(properties: any, ): JQuery
  def css(propertyName: string, value: any, ): JQuery
  def css(propertyName: any, value: any, ): JQuery
  def height(): number
  def height(value: number, ): JQuery
  def height(value: string, ): JQuery
  def height(func: Function, ): JQuery
  def innerHeight(): number
  def innerHeight(value: number, ): JQuery
  def innerWidth(): number
  def innerWidth(value: number, ): JQuery
  def offset(): any
  def offset(coordinates: any, ): JQuery
  def offset(func: Function, ): JQuery
  def outerHeight(includeMargin: Option[boolean], ): number
  def outerHeight(value: number, includeMargin: Option[boolean], ): JQuery
  def outerWidth(includeMargin: Option[boolean], ): number
  def outerWidth(value: number, includeMargin: Option[boolean], ): JQuery
  def position(): any
  def scrollLeft(): number
  def scrollLeft(value: number, ): JQuery
  def scrollTop(): number
  def scrollTop(value: number, ): JQuery
  def width(): number
  def width(value: number, ): JQuery
  def width(value: string, ): JQuery
  def width(func: Function, ): JQuery
  def clearQueue(queueName: Option[string], ): JQuery
  def data(key: string, value: any, ): JQuery
  def data(obj: any, ): JQuery
  def data(key: Option[string], ): any
  def dequeue(queueName: Option[string], ): JQuery
  def removeData(nameOrList: Option[any], ): JQuery
  def promise(type: Option[any], target: Option[any], ): JQueryPromise[any]
  def animate(properties: any, duration: Option[any], complete: Option[Function], ): JQuery
  def animate(properties: any, duration: Option[any], easing: Option[string], complete: Option[Function], ): JQuery
  def animate(properties: any, options: any, ): JQuery
  def delay(duration: number, queueName: Option[string], ): JQuery
  def fadeIn(duration: Option[any], callback: Option[any], ): JQuery
  def fadeIn(duration: Option[any], easing: Option[string], callback: Option[any], ): JQuery
  def fadeOut(duration: Option[any], callback: Option[any], ): JQuery
  def fadeOut(duration: Option[any], easing: Option[string], callback: Option[any], ): JQuery
  def fadeTo(duration: any, opacity: number, callback: Option[any], ): JQuery
  def fadeTo(duration: any, opacity: number, easing: Option[string], callback: Option[any], ): JQuery
  def fadeToggle(duration: Option[any], callback: Option[any], ): JQuery
  def fadeToggle(duration: Option[any], easing: Option[string], callback: Option[any], ): JQuery
  def finish(): JQuery
  def hide(duration: Option[any], callback: Option[any], ): JQuery
  def hide(duration: Option[any], easing: Option[string], callback: Option[any], ): JQuery
  def show(duration: Option[any], callback: Option[any], ): JQuery
  def show(duration: Option[any], easing: Option[string], callback: Option[any], ): JQuery
  def slideDown(duration: Option[any], callback: Option[any], ): JQuery
  def slideDown(duration: Option[any], easing: Option[string], callback: Option[any], ): JQuery
  def slideToggle(duration: Option[any], callback: Option[any], ): JQuery
  def slideToggle(duration: Option[any], easing: Option[string], callback: Option[any], ): JQuery
  def slideUp(duration: Option[any], callback: Option[any], ): JQuery
  def slideUp(duration: Option[any], easing: Option[string], callback: Option[any], ): JQuery
  def stop(clearQueue: Option[boolean], jumpToEnd: Option[boolean], ): JQuery
  def stop(queue: Option[any], clearQueue: Option[boolean], jumpToEnd: Option[boolean], ): JQuery
  def toggle(duration: Option[any], callback: Option[any], ): JQuery
  def toggle(duration: Option[any], easing: Option[string], callback: Option[any], ): JQuery
  def toggle(showOrHide: boolean, ): JQuery
  def bind(eventType: string, eventData: Option[any], handler: Option[Function], ): JQuery
  def bind(eventType: string, eventData: any, preventBubble: boolean, ): JQuery
  def bind(eventType: string, preventBubble: boolean, ): JQuery
  def bind(events: any, ): JQuery
  def blur(eventData: Option[any], handler: Option[Function], ): JQuery
  def blur(handler: Function, ): JQuery
  def change(eventData: Option[any], handler: Option[Function], ): JQuery
  def change(handler: Function, ): JQuery
  def click(eventData: Option[any], handler: Option[Function], ): JQuery
  def click(handler: Function, ): JQuery
  def dblclick(eventData: Option[any], handler: Option[Function], ): JQuery
  def dblclick(handler: Function, ): JQuery
  def delegate(selector: any, eventType: string, handler: Function, ): JQuery
  def focus(eventData: Option[any], handler: Option[Function], ): JQuery
  def focus(handler: Function, ): JQuery
  def focusin(eventData: any, handler: Function, ): JQuery
  def focusin(handler: Function, ): JQuery
  def focusout(eventData: any, handler: Function, ): JQuery
  def focusout(handler: Function, ): JQuery
  def hover(handlerIn: Function, handlerOut: Function, ): JQuery
  def hover(handlerInOut: Function, ): JQuery
  def keydown(eventData: Option[any], handler: Option[Function], ): JQuery
  def keydown(handler: Function, ): JQuery
  def keypress(eventData: Option[any], handler: Option[Function], ): JQuery
  def keypress(handler: Function, ): JQuery
  def keyup(eventData: Option[any], handler: Option[Function], ): JQuery
  def keyup(handler: Function, ): JQuery
  def load(eventData: Option[any], handler: Option[Function], ): JQuery
  def load(handler: Function, ): JQuery
  def mousedown(): JQuery
  def mousedown(eventData: any, handler: Function, ): JQuery
  def mousedown(handler: Function, ): JQuery
  def mouseevent(eventData: any, handler: Function, ): JQuery
  def mouseevent(handler: Function, ): JQuery
  def mouseenter(): JQuery
  def mouseenter(eventData: any, handler: Function, ): JQuery
  def mouseenter(handler: Function, ): JQuery
  def mouseleave(): JQuery
  def mouseleave(eventData: any, handler: Function, ): JQuery
  def mouseleave(handler: Function, ): JQuery
  def mousemove(): JQuery
  def mousemove(eventData: any, handler: Function, ): JQuery
  def mousemove(handler: Function, ): JQuery
  def mouseout(): JQuery
  def mouseout(eventData: any, handler: Function, ): JQuery
  def mouseout(handler: Function, ): JQuery
  def mouseover(): JQuery
  def mouseover(eventData: any, handler: Function, ): JQuery
  def mouseover(handler: Function, ): JQuery
  def mouseup(): JQuery
  def mouseup(eventData: any, handler: Function, ): JQuery
  def mouseup(handler: Function, ): JQuery
  def off(events: Option[string], selector: Option[any], handler: Option[Function], ): JQuery
  def off(eventsMap: any, selector: Option[any], ): JQuery
  def on(events: string, selector: Option[any], data: Option[any], handler: Option[Function], ): JQuery
  def on(events: string, selector: Option[any], handler: Option[Function], ): JQuery
  def on(eventsMap: any, selector: Option[any], data: Option[any], ): JQuery
  def one(events: string, selector: Option[any], data: Option[any], handler: Option[Function], ): JQuery
  def one(eventsMap: any, selector: Option[any], data: Option[any], ): JQuery
  def ready(handler: any, ): JQuery
  def resize(eventData: Option[any], handler: Option[Function], ): JQuery
  def resize(handler: Function, ): JQuery
  def scroll(eventData: Option[any], handler: Option[Function], ): JQuery
  def scroll(handler: Function, ): JQuery
  def select(eventData: Option[any], handler: Option[Function], ): JQuery
  def select(handler: Function, ): JQuery
  def submit(eventData: Option[any], handler: Option[Function], ): JQuery
  def submit(handler: Function, ): JQuery
  def trigger(eventType: string, extraParameters: any, ): JQuery
  def trigger(event: JQueryEventObject, ): JQuery
  def triggerHandler(eventType: string, extraParameters: any, ): Object
  def unbind(eventType: Option[string], handler: Option[Function], ): JQuery
  def unbind(eventType: string, fls: boolean, ): JQuery
  def unbind(evt: any, ): JQuery
  def undelegate(): JQuery
  def undelegate(selector: any, eventType: string, handler: Option[Function], ): JQuery
  def undelegate(selector: any, events: any, ): JQuery
  def undelegate(namespace: string, ): JQuery
  def unload(eventData: Option[any], handler: Option[Function], ): JQuery
  def unload(handler: Function, ): JQuery
  def error(handler: Function, ): JQuery
  def error(eventData: any, handler: Function, ): JQuery
  def pushStack(elements: any, ): JQuery
  def pushStack(elements: any, name: any, arguments: any, ): JQuery
  def after(content: any, ): JQuery
  def after(func: Function, ): JQuery
  def append(content: any, ): JQuery
  def append(func: Function, ): JQuery
  def appendTo(target: any, ): JQuery
  def before(content: any, ): JQuery
  def before(func: Function, ): JQuery
  def clone(withDataAndEvents: Option[boolean], deepWithDataAndEvents: Option[boolean], ): JQuery
  def detach(selector: Option[any], ): JQuery
  def empty(): JQuery
  def insertAfter(target: any, ): JQuery
  def insertBefore(target: any, ): JQuery
  def prepend(content: any, ): JQuery
  def prepend(func: Function, ): JQuery
  def prependTo(target: any, ): JQuery
  def remove(selector: Option[any], ): JQuery
  def replaceAll(target: any, ): JQuery
  def replaceWith(func: any, ): JQuery
  def text(): string
  def text(textString: any, ): JQuery
  def text(textString: Function, ): JQuery
  def toArray(): any
  def unwrap(): JQuery
  def wrap(wrappingElement: any, ): JQuery
  def wrap(func: Function, ): JQuery
  def wrapAll(wrappingElement: any, ): JQuery
  def wrapInner(wrappingElement: any, ): JQuery
  def wrapInner(func: Function, ): JQuery
  def each(func: Function, ): JQuery
  def get(index: Option[number], ): any
  def index(): number
  def index(selector: string, ): number
  def index(element: any, ): number
  def __item(x: string, ): any
  def __item(x: number, ): HTMLElement
  def add(selector: string, context: Option[any], ): JQuery
  def add(elements: any, ): JQuery
  def add(html: string, ): JQuery
  def add(obj: JQuery, ): JQuery
  def children(selector: Option[any], ): JQuery
  def closest(selector: string, ): JQuery
  def closest(selector: string, context: Option[Element], ): JQuery
  def closest(obj: JQuery, ): JQuery
  def closest(element: any, ): JQuery
  def closest(selectors: any, context: Option[Element], ): any
  def contents(): JQuery
  def end(): JQuery
  def eq(index: number, ): JQuery
  def filter(selector: string, ): JQuery
  def filter(func: Function, ): JQuery
  def filter(element: any, ): JQuery
  def filter(obj: JQuery, ): JQuery
  def find(selector: string, ): JQuery
  def find(element: any, ): JQuery
  def find(obj: JQuery, ): JQuery
  def first(): JQuery
  def has(selector: string, ): JQuery
  def has(contained: Element, ): JQuery
  def is(selector: string, ): boolean
  def is(func: Function, ): boolean
  def is(element: any, ): boolean
  def is(obj: JQuery, ): boolean
  def last(): JQuery
  def map(callback: Function, ): JQuery
  def next(selector: Option[string], ): JQuery
  def nextAll(selector: Option[string], ): JQuery
  def nextUntil(selector: Option[string], filter: Option[string], ): JQuery
  def nextUntil(element: Option[Element], filter: Option[string], ): JQuery
  def not(selector: string, ): JQuery
  def not(func: Function, ): JQuery
  def not(element: any, ): JQuery
  def not(obj: JQuery, ): JQuery
  def offsetParent(): JQuery
  def parent(selector: Option[string], ): JQuery
  def parents(selector: Option[string], ): JQuery
  def parentsUntil(selector: Option[string], filter: Option[string], ): JQuery
  def parentsUntil(element: Option[Element], filter: Option[string], ): JQuery
  def parentsUntil(obj: Option[JQuery], filter: Option[string], ): JQuery
  def prev(selector: Option[string], ): JQuery
  def prevAll(selector: Option[string], ): JQuery
  def prevUntil(selector: Option[string], filter: Option[string], ): JQuery
  def prevUntil(element: Option[Element], filter: Option[string], ): JQuery
  def siblings(selector: Option[string], ): JQuery
  def slice(start: number, end: Option[number], ): JQuery
  def queue(queueName: Option[string], ): any
  def queue(queueName: string, newQueueOrCallback: any, ): JQuery
  def queue(newQueueOrCallback: any, ): JQuery
}
