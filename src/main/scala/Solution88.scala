object Solution88 {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    try {
      val n=scala.io.StdIn.readInt()
      val dir = scala.collection.mutable.Map[String,String]()
      var line = ""


      for (i <- 0 to n-1) {

        val line = scala.io.StdIn.readLine() ;
        var name = line.split(" ")
        dir += (name(0) -> name(1))


      }
      var s = scala.io.StdIn.readLine()

      while (!s.isEmpty()) {
        var num = dir.get(s).isDefined

        if (num == false) {

          println("Not found")
        }
        else {

          println(s+"="+dir.get(s).get)
        }
        s = scala.io.StdIn.readLine()
      }

    } catch {
      case ex: NullPointerException => {
        //Nothing
      }
    }

  }
}
