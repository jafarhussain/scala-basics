package callByName

object callByName extends App {



  def callByValue(n : Long) : Unit = {
    println("byValue: " + n)
  }


  def callByName(n: => Long): Unit = {
    println("byName: "+ n)

  }

  callByValue(System.nanoTime())
  callByValue(System.nanoTime())

  callByName(System.nanoTime())
  callByName(System.nanoTime())

}
