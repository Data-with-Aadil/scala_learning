object var_vs_val {
  def main(args: Array[String]): Unit = {
    println("hello world");

    var a : Int = 99;
    println(a) ;

    var b : Int = 100;
    println(b) ;

    b = 66;
    println(b)

    val a1 : Int = 66;
    println(a1)

//    val cannot be changed.
//    a1 = 99;
//    println(a1)

    println(a + b);

    println(100 + 66);

    println(100.+(66))

    println("hello world")

    var a112 : String = "aadil mansoori"
    println(a112);
  }
}
