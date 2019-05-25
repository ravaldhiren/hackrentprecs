object Solution1 {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val n = scala.io.Stdin.readInt()
    for (i <- 0 to n - 1) {
      var s = scala.io.Stdin.readLine()
      var a = s.toArray

      for (j <- 0 to a.length - 1) {
        if (j % 2 == 0) {
          print(a(j))
        }
      }

      print("")

      for (j <- 0 to a.length - 1) {
        if (j % 2 != 0) {
          print(a(j))
        }
      }

      println()

    }
  }

}