package exercicios

import scala.io.StdIn.{readLine => scanner}

object HelloWorldNTimes {

  def main(args: Array[String]): Unit = {
    val n = scanner().toInt
    f(n)
  }

  def f(n: Int): Unit = {
    println("Hello World");
    if (n > 1) f(n - 1)
  }

}
