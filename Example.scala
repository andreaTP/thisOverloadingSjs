package demo

import scalajs.js
import scala.scalajs.js.annotation.{JSExportTopLevel, JSExportAll}

@JSExportTopLevel("Example")
@JSExportAll
class Example {

  def receive(x: Any): Unit ={
    println(s"overload me please $x")
  }

}
