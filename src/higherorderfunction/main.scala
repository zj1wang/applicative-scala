package higherorderfunction

import functionFirst.FunctionFirst.{fun1, fun2, fun3}
import bibao.BiBao.{makeAdder, makeInc}
import higherorderfunction.FunctionInput.repeat


object main {
  def main(args: Array[String]): Unit = {
    val add1 = makeAdder(1)
    val add2 = makeAdder(2)
    //    println(add1(2)) //1+2
    //    println(add2(2)) //2+2
    //    println(makeAdder(2)(3))
    /*1.累加器构建时，外部变量已经捕获
    * */
    val inc1 = makeInc()
    val inc2 = makeInc() //累加器构建时，外部变量已经捕获
    inc1(1)
    inc1(1)
    inc1(1)
    inc2(1)
    inc2(1)
    inc2(1)
    /*2.
        闭包允许构建函数进行配置
        比如传入一种行为规则*/
    val inc3 = makeInc("自定义累计器", 3)
    inc3(3)
    inc3(3)
    /*3.
    作为入参
    定义行为
    */
    val repeatList: List[Any] = repeat(3, () => util.Random.nextInt(10))
    val filterList = FunctionInput.filter(List("ss", "ss", "srs", "trrrt"), (n: String) => n.size < 3)
    val filterListNum = FunctionInput.filter(List(1, 2, 3, 4), (n: Int) => n < 3)
    println("repeatList:", filterListNum)
  }
}

