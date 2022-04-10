package definicao_de_metodos

import scala.io.StdIn.{readLine => scanner}

object Metodos {

  def main(args: Array[String]): Unit = {
    val a = scanner("Digite A: ").toInt
    val b = scanner("Digite B: ").toInt

    println(s"A soma de $a + $b é: " + soma(a, b))
    println("O menor valor é " + min(a, b))
    println("O maior valor é: " + max(a, b))
    println("A divisão de a por b é : " + divisao(a, b))
    println(s"O mdc de ($a e $b) é : " + mdc(a, b))

  }

  def soma(a: Int, b: Int): Int = a + b

  def min(a: Int, b: Int): Int = if (a > b) b else a

  def max(a: Int, b: Int): Int = if (a < b) b else a

  def divisao(a: Int, b: Int): Int = a / b

  def mdc(a: Int, b: Int): Int = {
    var result = min(a, b)
    while (!((a % result == 0) && (b % result == 0))) {
      result = result - 1
    }

    result
  }

}
