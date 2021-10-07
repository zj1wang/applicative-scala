package steam

import buildFuncionByFuncitons.main.listFilter
import higherorderfunction.FunctionInput
import higherorderfunction.FunctionInput._

object Main {
  def main(args: Array[String]): Unit = {
    //方法链调用，传递this ，进行破坏性修改
    val car = new Car().setVin("12")
      .setUserName("wzh")
      //对原对象进行了修改
      .setCarNumber("A12343")
    println("传统链式调用", car)


    //函数式Api推行纯函数---管道，管道不会对数据进行破坏性修改-------数组过滤器
    val list = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val result: List[Int] = pipeLine(list,
      listFilter((x: Int) => x < 5),
      listFilter((x: Int) => x > 1),
    )
    println("源数组", list)
    println("过滤结果", result)
    println("过滤后原数组", list)
    //方法链过滤器
    list.filter((x: Int) => x < 5)
      .filter((x: Int) => x > 1)
  }

}
