// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/PC/Documents/UCV/Semestre I-2019/Parcial/rest/conf/routes
// @DATE:Thu Jul 11 20:41:51 VET 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
