package pureFunction

import scala.collection.mutable.ListBuffer
import scala.util.Random

object Pure {
  def fun1() = {
    Random.nextInt(10)
  }

  def fun2(list: ListBuffer[Int]): Unit = {
    val returnList: ListBuffer[Int] = list.clone()
    returnList += 1
  }
}
