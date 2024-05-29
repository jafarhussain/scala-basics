package recursion

object recursion {


  def factorial(n: Int): Int = {
    if (n == 0) 1 else n * factorial(n - 1)
  }

  def main(args: Array[String]): Unit = {

    println("Hello !! "+ factorial(4))

  }


}


