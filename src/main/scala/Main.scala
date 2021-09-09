import scala.io.StdIn.readLine

object Checksum {

  def clear() =
    System.out.print("\u001b[H\u001b[2J")
    System.out.flush()

  def main(args: Array[String]): Unit = {
    for _ <- 1 to 15 do
      clear()
      print("> ")
      val firstName = readLine()
      println()
      println(firstName)
  }
}
