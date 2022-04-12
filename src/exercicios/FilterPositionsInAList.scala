package exercicios

import scala.io.StdIn.{readLine => scanner}

object FilterPositionsInAList {

  def main(args: Array[String]): Unit = {
    val list = scanner().toList
    f(list)
  }

  def f(list: List[Char]): Unit = {
    println(list.zipWithIndex.filter(_._2 % 2 == 1).map(_._1))
  }
}
