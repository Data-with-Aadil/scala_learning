object loops_practice {
  def main(args: Array[String]): Unit = {

    var a : Int = 1;
    while (a<=10){
      println(a)
      a = a + 1
    }

    var a1 : Int = 1;
    while (a1<=10){
      println(a1)
      a1 = a1 + 2
    }

    for (i <- 1 to 10){
      println(i)
    }

    for (i <- 1 until 10){
      println(i)
    }
  }

}
