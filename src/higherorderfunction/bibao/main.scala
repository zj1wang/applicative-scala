package higherorderfunction.bibao

import functionFirst.FunctionFirst.{fun1, fun2, fun3}
import higherorderfunction.bibao.BiBao.{makeAdder, makeInc}


object main {
  def main(args: Array[String]): Unit = {
    val add1 = makeAdder(1)
    val add2 = makeAdder(2)
    println(add1(2)) //1+2
    println(add2(2)) //2+2
    println(makeAdder(2)(3))
/*1.闭包构建时，外部变量已经捕获
* */
    val inc1 = makeInc()
    val inc2 = makeInc()//累加器构建时，外部变量已经捕获
    inc1(1)
    inc1(1)
    inc1(1)
    inc2(1)
    inc2(1)
    inc2(1)
/*2.
    闭包允许构建函数进行配置*/
    val inc3 = makeInc("自定义累计器",3)
    inc3(3)
    inc3(3)
  }
}

