/** 26) Escreva um algoritmo que leia dois números inteiros e compare-os, mostrando
na tela uma das mensagens abaixo:
- O primeiro valor é o maior
- O segundo valor é o maior
- Não existe valor maior, os dois são iguais */

fun main() {
    println("Qual o primeiro numero?")
    val numero1 = readLine()!!.toInt()

    println("Qual o segundo numero?")
    val numero2 = readLine()!!.toInt()

    if (numero1 > numero2) {
        println("o primeiro valor e maior!")
    } else if (numero1 == numero2) {
        println("Nao existe numero maior, os dois sao iguais!")
    } else {
        println("O segundo valor e maior")
    }
}