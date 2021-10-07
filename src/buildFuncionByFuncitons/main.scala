package buildFuncionByFuncitons

import functionFirst.FunctionFirst.{fun1, fun2, fun3}
import higherorderfunction.FunctionInput
import higherorderfunction.FunctionInput._

import scala.collection.mutable.ListBuffer


object main {
  //手动curry化
  def listFilter[T](filter: T => Boolean) = {
    (list: List[T]) => {
      val listByFilter = ListBuffer[T]()
      list.foreach(item => {
        if (filter(item)) {
          listByFilter += item
        }
      }
      )
      listByFilter.toList
    }
  }

  def main(args: Array[String]): Unit = {

    //自动将函数curry化
    val addCurried = Function.curry2(Function.add)
    println(addCurried(1)(3))
    val filterCurry = Function.curry2[List[Int], Int => Boolean, List[Int]](filter)
    println(
      //柯里化调用
      filterCurry((x: Int) => x < 3)(List(1, 2, 3, 4)),
      listFilter((x: Int) => x < 3)(List(1, 2, 3, 4)),
      //一般调用
      filter(List(1, 2, 3, 4), (x: Int) => x < 3)
    )
    //如何实现两层过滤、多层,过滤条件自由组合？
    val lessThan10 = listFilter((x: Int) => x < 10) //柯里化设计有助于拆散函数，动作复用
    val greaterThan2 = listFilter((x: Int) => x > 2)
    val notEquals4 = listFilter((x: Int) => x != 2)
    println(
      composeFilter(lessThan10, greaterThan2, notEquals4)(List(1, 2, 3, 4, 15, 18, 30))
    )
  }
}
