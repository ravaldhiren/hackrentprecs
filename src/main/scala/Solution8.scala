object Solution8 {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    try {
      val n = scala.io.StdIn.readInt()
      var line = ""
      val dir = scala.collection.mutable.Map[String, String]()

      for (i <- 0 to n - 1) {
        val line = scala.io.StdIn.readLine()
        var name = line.split(" ")
        dir += (name(0) -> name(1))
      }

      var q = scala.io.StdIn.readLine()

      while (!q.isEmpty()) {
        val num = dir.get(q).isDefined

        if (num == false) {
          println("Not found")
        } else {
          println(q + "=" + dir.get(q).get)
        }
        q = scala.io.StdIn.readLine()
      }
    }
      catch{
        case ex: NullPointerException => {
          //Nothing
        }
      }

  }
}

