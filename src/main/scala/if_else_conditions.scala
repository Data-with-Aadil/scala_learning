object if_else_conditions {
  def main(args: Array[String]): Unit = {
    val x: Int = 99
    val y: Int = 100
    var z: String = "" // Use 'var' if you intend to modify 'z'

    if (x > y) {
      z = "this is x"
    }
    else {
      z = "y is greater"
    }
    println(z)

    if (x == 99){
      z = "x is equals to 99"
    }
    println(z)

    if (x == 99 && y == 100){
      z = "conditions is TRUE"
    }
//    println(z)

    if (x == 99 || y == 100){
      z = "This condititons is also TRUE"
    }
//    println(z)

    else{
      z = "something else"
    }
    println(z)
  }
}


