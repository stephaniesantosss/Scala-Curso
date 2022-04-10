package declaracao_de_variaveis

import scala.io.StdIn.{readLine => scanner}

object Exercicio2 {

  def main(args: Array[String]): Unit = {
    val strRecebida = scanner("Digite um número inteiro maior que 0: ").toInt

    val resposta = if (strRecebida % 2 == 0) s"O num $strRecebida é par" else s"O num $strRecebida é impar"
    println(resposta)

    val a = scanner("Digite o valor de A: ")
    val b = scanner("Digite o valor de B: ")

    val resp = if (a > b) "A é maior que B" else "A não é maior que B"
    println(resp)

    val x = scanner("Entre com a coordenada x: ").toInt
    val y = scanner("Entre com a coordenada y: ").toInt

    val respos = if (x > 0) {
      if (y > 0) {
        s"A coordenada ($x , $y) está no primeiro quadrante"
      }
      else {
        s"A coordenada ($x, $y) está no quarto quadrante"
      }
    } else if (y > 0) {
      s"A coordenada ($x, $y) está no segundo quadrantes"
    }
    else {
      s"A coordenada ($x, $y) está no terceiro quadrante"
    }

    println(respos)
  }

}
