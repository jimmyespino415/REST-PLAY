
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Aplicacion REST, Ejercicio 5-a")/*3.40*/ {_display_(Seq[Any](format.raw/*3.42*/("""
  """),format.raw/*4.3*/("""<h1>Aplicacion REST usando Play Framework</h1>
  <h3>Para uso del GET con un lista: </h3> </br>
    <ul>
      <li><a href="http://localhost:9000/Map">http://localhost:9000/Map </a></li>
    </ul>
  <h3>Para traer un Objeto: </h3></br>
    <ol>
      <li>-Utilizar un API de desarrollo como Postman</li>
      <li>-Utilizar servicio de POST </li>
      <li>-En BODY elegir RAW e ingresarle un JSON</li>
      <li>-Ir a <a href="http://localhost:9000/catch">http://localhost:9000/catch </a> </li>
      <li>-Devolvera un Objeto con la informacion del JSON </li>
    </ol>
""")))}),format.raw/*17.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: 2019-07-11T22:34:19.684571700
                  SOURCE: C:/Users/PC/Documents/UCV/Semestre I-2019/Parcial/rest/app/views/index.scala.html
                  HASH: c2f0fbf0d0b0b374d360f804675356085cde6980
                  MATRIX: 941->1|1037->3|1067->8|1113->46|1152->48|1182->52|1797->637
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|49->17
                  -- GENERATED --
              */
          