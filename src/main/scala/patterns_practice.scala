object patterns_practice {
  def main(args: Array[String]): Unit = {

    // when pattern is reoccuring

//    var num = 1

    for (i <- 1 to 4) {
      for (j <- 1 to i) {
        print(j + " ")
//        num = num + 1
      }
      println()
    }

    // when numbers are increasing

    var num1 = 1

    for (i <- 1 to 4) {
      for (j <- 1 to i) {
        print(num1 + " ")
        num1 = num1 + 1
      }
      println()
    }

//    when numbers are decreasing
    
    var num2 = 21

    for (i <- 6 to 1 by -1){
      for (j <- i to 1 by -1){
        print(num2 + " ")
        num2 = num2 -1

    }
      println()
    }

  }
}

