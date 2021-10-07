package pureFunction

import scala.collection.mutable.ListBuffer

object main {
  def main(args: Array[String]): Unit = {
    val intList = ListBuffer(1, 2)
    NotPure.fun2(intList)

    println(intList)//input改变,Date.now,Math.random等也是不纯的
    Pure.fun2(intList)
    println(intList)

    val random1 = NotPure.fun1()
    val random2 = NotPure.fun1()
    println(random1,random2)//输出不一致
  }
}
