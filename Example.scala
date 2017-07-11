package demo

import scalajs.js
import scala.scalajs.js.annotation._

@JSExportTopLevel("Example")
@ScalaJSDefined
class Example extends js.Object {

  def receive(x: Any): Unit ={
    println(s"overload me please $x")
  }

}
