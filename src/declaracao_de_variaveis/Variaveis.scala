package declaracao_de_variaveis

object Variaveis {

  def main(args: Array[String]): Unit = {
    val num = 1 + 23
    println(num)

    val num1 = 2.45 + 3
    println(num1)

    var str = "Hello"
    println(str)

    str = str + " Pessoal"
    println(str)

    var num2: Int = 23 + 77
    println(num2)

    num2 = num2 - 8
    println(num2)

    var y: Boolean = false
    println(y)

    y = y || true
    println(y)

    val z = if (true) println(num2 + 100) else println("False")
  }
}
