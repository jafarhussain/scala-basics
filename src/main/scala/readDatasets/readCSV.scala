package readDatasets

import scala.io.Source

object readFile extends App{

private val src = Source.fromFile("src/main/scala/datasets/BillingHistory.csv").getLines
private val header = src.take(1).next()

print(header)
  }

def main(): Unit = {

  readFile

}