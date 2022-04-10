package exceptions

import scala.io.StdIn.{readLine => scanner}

object Exceptions {

  def main(args: Array[String]): Unit = {
    val resposta = scanner("Digite 1 ou 2: ").toInt

    try{
      println(dumb(resposta))
    }catch {
      case e: MatchError => println("Entrada inválida")
    }

  }

  def dumb(a: Int): String = a match {
    case 1 => "Sucesso"
    case 2 => "Falha"
  }

}
