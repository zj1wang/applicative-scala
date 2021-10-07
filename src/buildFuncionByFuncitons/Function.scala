package buildFuncionByFuncitons


object Function {

  //curry函数
  def curry2[T, P, R](function: (T, P) => R): P => T => R = {
    (secondArg: P) => {
      (firstArg: T) => {
        function(firstArg, secondArg)
      }
    }
  }

  def add(x: Int, y: Int) = {
    x + y
  }

}
