import scala.io.StdIn.readLine
import java.io.FileWriter

object Checksum {

  def clear() =
    System.out.print("\u001b[H\u001b[2J")
    System.out.flush()

  def write(line: String) =
    val fw = new FileWriter("affirmation-lines.log", true)
    try {
      fw.append(line + "\n")
    }
    finally fw.close() 


  def main(args: Array[String]): Unit =
    var collector: Array[String] =
      new Array(15)
    for i <- 1 to 15 do
      clear()
      println(s"[$i/15]")
      print("> ")
      val line = readLine()
      collector(i - 1) = line
      write(line)

    clear()

    if collector.forall(_ == collector(0)) then
      println("ALL MATCH")
    else
      println("UNMATCHED")

}
