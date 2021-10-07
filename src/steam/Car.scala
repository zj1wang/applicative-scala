package steam

class Car(
           var vin: String = "",
           var carNumber: String = "",
           var userName: String = ""
         ) {
  def setVin(vin: String) = {
    this.vin = vin
    this
  }

  def setCarNumber(carNumber: String) = {
    this.carNumber = carNumber
    this
  }

  def setUserName(userName: String) = {
    this.userName = userName
    this
  }

  override def toString: String = {
    "VIN："+this.vin+"\ncarNumber："+this.carNumber+"\nuserName: "+this.userName
  }
}
