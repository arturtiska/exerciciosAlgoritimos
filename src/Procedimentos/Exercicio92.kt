/** 92) Crie uma lógica que leia um número inteiro e passe para um procedimento
ParOuImpar() que vai verificar e mostrar na tela se o valor passado como
parâmetro é PAR ou ÍMPAR. */

fun main() {
    println("Qual o numero?")
    val numero = readLine()!!.toInt()
    println(parOuImpar(numero))
}

fun parOuImpar(numero: Int) {
    if (numero % 2 == 0) {
        println("O numero $numero e Par")
        readLine()!!.toInt()
    } else {
        println("O numero $numero e Impar")
        readLine()!!.toInt()
    }
}