import scala.io.StdIn.readLine

object XmasTree extends App {
  println("Please enter a natural number that is greater than 3!")
  var i = readLine()
  var j = if (!i.isEmpty) i.toInt else args(0).toInt
  var a = 1

  while (j>0) {
    println(" "*(j-1) + "*"*a)
    j -= 1
    a += 2
  }
}
