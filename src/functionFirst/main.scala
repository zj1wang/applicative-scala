package functionFirst

import com.sun.tools.internal.xjc.reader.Ring.add
import functionFirst.FunctionFirst.{fun1, fun2, fun3, list}

object main {
  def main(args: Array[String]): Unit = {
    println(fun1())
    println(fun2())
    fun3(fun1)

    println(list)
  }

}
