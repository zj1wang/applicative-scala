package pureFunction

import scala.collection.mutable.ListBuffer
import scala.util.Random

object NotPure {
  //输入一定，输出随机
  def fun1() = {
    Random.nextInt(10)
  }
//改变外部环境 list
  def fun2(list: ListBuffer[Int]): Unit = {
   list+= 1
  }
}
