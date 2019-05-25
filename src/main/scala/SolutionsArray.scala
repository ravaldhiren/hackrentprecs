import java.io._
import java.math._
import java.security._
import java.text._
import java.util._
import java.util.concurrent._
import java.util.function._
import java.util.regex._
import java.util.stream._

object SolutionsArray {

  // Complete the rotLeft function below.
  def rotLeft(a: Array[Int], d: Int): Array[Int] = {

    var arr: Array[Int] = a
    var tmp: Int = 0

    /*for ( i <- 0 to arr.length - 1) {
     for (j <- (d - 1 to 0).reverse){

     tmp = arr(j)
     arr(j) = arr(j -1)
     arr(j - 1) = tmp
     //println(i)
     }
     }*/

    for (i <- 0 to arr.length - 1) {
      for (j <- (1 to d).reverse) {
        tmp = arr(j)
        arr(j) = arr(j -1)
        arr(j - 1) = tmp

      }

    }

    return arr

  }

  def main(args: Array[String]) {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val nd = stdin.readLine.split(" ")

    val n = nd(0).trim.toInt

    val d = nd(1).trim.toInt

    val a = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = rotLeft(a, d)

    printWriter.println(result.mkString(" "))

    printWriter.close()
  }
}
