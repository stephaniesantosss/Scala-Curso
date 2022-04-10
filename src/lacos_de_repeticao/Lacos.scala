package lacos_de_repeticao

import scala.io.StdIn.{readLine => scanner}

object Lacos {

  def main(args: Array[String]): Unit = {
    for (i: Int <- 1 to 10) {
      println(s"Que legal $i")
    }

    for {
      i <- List(1, 2, 3)
      j <- List(4, 5, 6)

      produto = i * j

      //yield obedece ao gard, ele retornará apenas os pares da lista
      if (produto % 2 == 0)
    } yield println(produto)

    tabuada()

  }

  def tabuada(): Unit = {
    val tabuada = scanner("Digite um número para exibir a tabuada: ").toInt
    println(s"Tabuada do número: $tabuada")

    for (valor: Int <- 1 to 10) {
      println(s"$tabuada x $valor = " + (tabuada * valor))
    }
  }

}
