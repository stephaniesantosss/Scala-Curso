package exercicios

import scala.io.StdIn.{readLine => scanner}

object ProblemaURI {

  def main(args: Array[String]): Unit = {
    val dias = scanner().toInt
    val ano = dias / 365
    val mes = (dias % 365) / 30
    val dia = (dias % 365) % 30

    println(s"$ano ano(s)")
    println(s"$mes mes(es)")
    println(s"$dia dia(as)")
  }

}
