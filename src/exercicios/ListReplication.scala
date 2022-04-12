package exercicios

import scala.io.StdIn.{readLine => scanner}

object ListReplication {

  def main(args: Array[String]): Unit = {
    val a = scanner().toList
    val b = scanner().toInt
    println(a.flatMap(List.fill(b)(_)))
  }

  def f(num: Int, arr: List[Int]): List[Int] = {
    arr.flatMap(List.fill(num)(_))
  }

}
