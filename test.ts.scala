trait JQueryXHR {
  def overrideMimeType(mimeType: string, ): JQueryPromise[R]
  def abort(statusText: string, ): void
}
