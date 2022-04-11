package programacao_funcional

object Programacao_Funcional {

  def main(args: Array[String]): Unit = {
    funcionalPuro(Array("OLÁ ", "TUDO ", "BEM ? "))
  }

  //Não funcional
  def printArgs(args: Array[String]): Unit = {
    var i = 0
    while (i < args.length) {
      print(args(i))
      i += 1
    }
  }

  // funcional
  def funcional(args: Array[String]): Unit = {
    for(i <- args)
      print(i)
  }

  //metodo puramente funcional
  def funcionalPuro(args: Array[String]) = {
    args.mkString("\n")
  }

}
