package definicao_de_metodos

import scala.io.StdIn.{readLine => scanner}

object Pattern_Matching {
  def main(args: Array[String]): Unit = {
    val mes = scanner("Digite um número (mês) : ").toInt
    println(s"O mês $mes é chamado de " + mesNome(mes))

    val x = scanner("Digite o valor de x: ").toDouble
    println(f1(x))

    val y = scanner("Digite o valor de y: ").toDouble
    println(f2(y))

    val z = scanner("Digite o valor de z: ").toDouble
    println(f3(x))


  }

  def mesNome(mes: Int): String = mes match {
    case 1 => "Janeiro"
    case 2 => "Fevereiro"
    case 3 => "Março"
    case 4 => "Abril"
    case 5 => "Maio"
    case 6 => "Junho"
    case 7 => "Julho"
    case 8 => "Agosto"
    case 9 => "Setembro"
    case 10 => "Outubro"
    case 11 => "Novembro"
    case 12 => "Dezembro"
  }

  def f1(x: Double): Double = x match {
    case x if (x >= 2) => x - 2
    case x if (x >= -2) && (x < 2) => x * x - 4
    case x if (x < -2) => 3
  }

  def f2(x: Double): Double = x match {
    case x if (x < 4) => x + 2
    case 4 => 3
    case x if (x > 4) => 6 - x
  }

  def f3(x: Double): Double = x match {
    case x if (x <= -1) => x + 2
    case x if (x > -1) => x * x
  }

}
