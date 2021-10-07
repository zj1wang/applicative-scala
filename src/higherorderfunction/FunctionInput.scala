package higherorderfunction

import java.util
import scala.collection.JavaConverters.asScalaBufferConverter
import scala.collection.mutable.ListBuffer


object FunctionInput {
  def pipeLine[T](inputList: List[T], pipes: (List[T] => List[T])*) = {
    val pipesList = pipes.toList
    var outputList = inputList
    pipesList.foreach(
      pipe => {
        outputList = pipe(outputList)
      }
    )
    outputList
  }


  def composeFilter[T](functions: (T => T)*) = {
    val functionList = functions.toList

    (input: T) => {
      var outPut = input
      functionList.foreach(fun => {
        outPut = fun(outPut)
      }
      )
      outPut
    }
  }

  def filter[T](list: List[T], filter: T => Boolean): List[T] = {
    val listByFilter = ListBuffer[T]()
    list.foreach(item => {
      if (filter(item)) {
        listByFilter += item
      }
    }
    )
    listByFilter.toList
  }

  def repeat(time: Int, function: () => Any): List[Any] = {
    val list = new util.ArrayList[Any](time)
    var i = 0
    for (i <- 1 to time) {
      list.add(function())
    }
    list.asScala.toList
  }


  def makeInc() = {
    var PRIVATE = 0
    (num: Int) => {
      PRIVATE = PRIVATE + num
      println("当前累计数字：", PRIVATE)
    }
  }

  def makeInc(incName: String, initNum: Int = 0) = {
    var PRIVATE = initNum
    (num: Int) => {
      PRIVATE = PRIVATE + num
      println(incName, "累计：", PRIVATE)
    }
  }

}
