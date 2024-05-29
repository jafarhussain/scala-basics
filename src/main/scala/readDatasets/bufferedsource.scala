package readDatasets

object bufferedsrc extends App{


  val bufferedsrc = io.Source.fromFile("src/main/scala/datasets/BillingHistory.csv")
  for (line <- bufferedsrc.getLines) {
    val cols = line.split(",")
    println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)}|${cols(4)}|${cols(5)}|${cols(6)}")
  }
  bufferedsrc.close

}
