package book.programmingInScala.chap3

/**
  * Created by tangning on 2018/1/11.
  */
object ListThreeOne {
  def main(args: Array[String]):Unit = {

    // list 3.1
    val greetStrings = new Array[String](3)
    greetStrings(0) = "He"
    greetStrings(1) = ", "
    greetStrings(2) = "Wo!\n"
    for (i <- 0 to 2)
      print (greetStrings(i))
    // list 3.2: a better way
    val greetStrings2: Array[String] = new Array[String](3)
  }
}
