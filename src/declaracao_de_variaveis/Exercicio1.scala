package declaracao_de_variaveis

//alias

import scala.io.StdIn.{readLine => scanner}

object Exercicio1 {

  def main(args: Array[String]): Unit = {
    val numeroRecebido = scanner("Digite um numero para calcular a raiz quadrada: ").toInt
    val num: Double = math.sqrt(numeroRecebido)
    println(num)

    //operacao com string /////////////////////////////////
    val strRecebida = scanner("Digite uma palavra: ")
    println(strRecebida * 3)

    //pega o primeiro char
    println(strRecebida.head)
    //pega o utlimo char
    println(strRecebida.last)
    //retorna a qtde de char que eu quiser
    println(strRecebida take 3)
    //apaga a qtde de char que eu quiser
    println(strRecebida drop 3)
    //retorna os char da direita pra esquerda
    println(strRecebida takeRight 3)
    //apaga os char da direita pra esquerda
    println(strRecebida dropRight 3)

    val n: Any = "any recebe qualquer coisa"
    println(n)
  }

}
