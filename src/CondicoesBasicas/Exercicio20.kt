/** 20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
ÍMPAR */

fun main() {
    println("Qual e o numero?")
    val numero = readLine()!!.toInt()
    if (numero % 2 == 0) {
        println("O numero $numero e Par")
    } else {
        println("O numero $numero e Impar")
    }
}
