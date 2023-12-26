import scala.math._
object problems_by_karthik_31 {
  def main(args: Array[String]): Unit = {

//    1. Write a program to convert kg to g. (Input 56kg print in grams
    val a : Int = 56
    print("the value of 56kg in grams = " , a * 1000,"g" )
    println()

//    2. Write a program to covert temperature from degree C to F. (Input 80C)
    val a1 : Int = 80
    print((a1 * 9/5) + 32, "F")
    println()

//    3.Declare and initialize 3 three variable and print the biggest number
    val a2: Int = 5
    val a3: Int = 10
    val a4: Int = 7

    if (a2> a3 && a2 > a4){
      print(a2)
      }
    else if (a3 > a4 && a3 > a2){
      print(a3)
    }
    else {
      print(a4)
    }
    println()

    println("using max function:-")


    val maxofthree = math.max(math.max(a2, a3), a4)
    println(maxofthree)

//    4. Write a java program that performs the following tasks.
//      a. Store a number in a variable
//      b. If value is not in range (100-1000) prints wrong number else follows
//          the steps
//      c. Check even or odd
//      d. If even divide the number by 3 and print the remainder
//      e. If odd divide the number by 2 and print the remainder

    var no = scala.io.StdIn.readInt()
    if (no >= 100 && no <= 1000){
      if((no&1) == 0){
        println("even number")
        println("the remainder after dividing the no. by 3: " + (no % 3))
      }
      else {
        println("odd number")
        println("the remainder after dividing the no. by 2: " + (no % 2))
      }}
    else{
        println("wrong number")
      }

//    5. Declare & initialize a number. Check whether the number is in range 0-100
//    or not. If not in range print invalid input. Else – if the number is in range 90-
//      100 then print Super Smart, 80-90 print Smart,70-80 print smart enough,
//    60-70 print just smart, 35-60 print no smart, 0-35 print dump.

    var nos = scala.io.StdIn.readInt()
    if (nos >=0 && nos <=100){
      if (nos >=90 && nos <=100){
        println("Super Smart")
      }
      else if (nos >= 80 && nos <= 90){
        println("Smart")
      }
      else if (nos >= 70 && nos <= 80){
        println("Smart enough")
      }
      else if (nos >= 60 && nos <= 70){
        println("Smart")
      }
      else if (nos >= 35 && nos <= 60){
        println("no smart")
      }
      else {
        println("Dump")
      }
    }
    else{
      println("invalid input")
    }

//    6. Write a program to perform simple math based on the user inputs by using
//    Switch condition.(+ , - , * , /)

    var n1 = scala.io.StdIn.readInt()
    var n2 = scala.io.StdIn.readInt()

    println(n1 + n2)
    println(n1 - n2)
    println(n1 * n2)
    println(n1 / n2)

//    7. Write a program to print “SEEKHO BIGDATA”for 60 times.

    for (i <- 1 to 60){
      println("Seekho Bigdata")
    }

//    8. Write a program to print all numbers which are divisible by 11 from 250 to 550.
    for (i <- 250 to 550){
      if (i%11 == 0){
        println(i)
      }
    }

//    9. Write a program to sum all the numbers from 56 to 15
    var ak = 0
    for(i<- 56 to 153){
      ak = ak + i
    }
    println(ak)

//    10. Write a program to print all even numbers in range 700 to 900.
    for(i<- 700 to 900){
      if(i%2 == 0){
        println(i)
      }
    }

//    11. Write a program to print all odd numbers from 251 to 51. like (251, 249,...51)
    for(i<- 251 to 51 by -1){
      if((i&1) == 1){
        print(i + ", ")
      }
    }
    println("")

//    12. Write a Program to print the count of the even numbers between the given range?
    print("Enter a low_range: ")
    var low_range = scala.io.StdIn.readInt()
    print("Enter a high_range: ")
    var high_range = scala.io.StdIn.readInt()

    var a_inc = 0
    for (i <- low_range until high_range){
      if(i % 2 == 0) {
        a_inc = a_inc + 1
      }
    }
    println("")
    println("The total count the even numbers b/w ",low_range ," and ", high_range, " is:- ", a_inc )

//    13. Write a program to print alternate even numbers from 20 to 140. Like (20,24,28...)
    for (i<- 20 to 140){
      if (i%4 == 0){
        print(i + ",")
      }
    }
    println()

    var k1 = 20
    for (k11 <- (k1 +2) to 140 by 4){
      if (k11%2 == 0){
        print(k11 + ",")
      }
    }
    println()

//    15. Print following series 2*3,3*4,4*5,......16*17 (Print in two ways – pattern & multiplied value

    var nk = 2
    var nk1 = 16
    for (i<- nk to nk1){
        println(s" $i * ${i + 1} =  ${i*(i+1)} ")


    }


  }
}
