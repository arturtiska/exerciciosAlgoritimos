/** 95) Refaça o exercício 90, só que agora em forma de função Somador(), que vai
receber dois parâmetros e vai retornar o resultado da soma entre eles para o
programa principal.*/

fun main() {
        fun somador(a: Int, b: Int){
            val soma = a + b
            println("O valor do primeiro numero e: $a")
            println("O valor do segundo numero e: $b")
            println("A soma ente $a + $b e: $soma")
        }
        println("Qual o primeiro numero?")
        var primeiroNumero = readLine()!!.toInt()
        while (primeiroNumero <= 0){
            println("primeiro Numero nao pode ser menor que zero! Qual e a primeiro Numero?")
            primeiroNumero = readLine()!!.toInt()
        }
        println("Qual o segundo numero?")
        var segundoNumero = readLine()!!.toInt()
        while (segundoNumero <= 0){
            println("segundo Numero nao pode ser menor que zero! Qual e a segundo Numero?")
            segundoNumero = readLine()!!.toInt()
        }
        println(somador(primeiroNumero, segundoNumero))

}