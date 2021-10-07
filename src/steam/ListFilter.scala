package steam

class ListFilter[T](
                     var list: List[T],
                     filters: List[List[T] => List[T]] = null
                   ) {
  def filter(filter: T => Boolean) = {
     this.list =  list.filter(filter)
  }

  //  def setCarNumber(carNumber: String) = {
  //    this.carNumber = carNumber
  //    this
  //  }
  //
  //  def setUserName(userName: String) = {
  //    this.userName = userName
  //    this
  //  }
  //
  //  override def toString: String = {
  //    "VIN：" + this.vin + "\ncarNumber：" + this.carNumber + "\nuserName: " + this.userName
  //  }
}
