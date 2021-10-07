package functionFirst

import scala.collection.immutable

object FunctionFirst {
  var fun1 = () => {
    42
  } //作为变量
  private val ints: immutable.Seq[() => Any] = List(fun1, fun2)

  //作为函数返回
  def fun2(): () => Int = {
    fun1
  }

  //作为入参
  def fun3(f1: Any): Unit = {
    fun1
  }

  val list: List[Any] = List(fun1, 2, "2")//放入容器
}
