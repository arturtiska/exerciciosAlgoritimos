/** 66) Escreva um programa que leia um número qualquer e mostre a tabuada desse
número, usando a estrutura “para”.
Ex: Digite um valor: 5
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15 ... */

fun main() {
    println("Qual o numero?")
    var numero = readLine()!!.toInt()
    while (numero < 0) {
        println("A numero nao pode ser menor que zero! Qual e a numero?")
        numero = readLine()!!.toInt()
    }

    for (i in 0..10) {
        val resultado = numero * i
        println("$numero X $i = $resultado")
    }
}