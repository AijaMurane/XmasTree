import scala.io.StdIn.readLine

object XmasTree extends App {
  println("Please enter a natural number that is greater than 3!")
  val i = readLine()
  var j = if (!i.isEmpty) i.toInt else 3
  var temp = 1

  for (count <- 1 to j) {
    println(" "*(j-count) + "*"*temp)
    temp += 2
  }

}
