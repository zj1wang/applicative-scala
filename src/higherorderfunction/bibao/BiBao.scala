package higherorderfunction.bibao

object BiBao {
  def makeAdder(addNum: Int) = {
    (addedNum: Int) => {
      addedNum + addNum
    }
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
