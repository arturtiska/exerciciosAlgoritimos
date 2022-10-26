/** Faça um programa usando a estrutura “para” que leia um número inteiro
positivo e mostre na tela uma contagem de 0 até o valor digitado:
Ex: Digite um valor: 9
Contagem: 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, FIM! */

fun main() {
    println("Qual o numero?")
    var numero = readLine()!!.toInt()
    while (numero < 0){
        println("A numero nao pode ser menor que zero! Qual e a numero?")
        numero = readLine()!!.toInt()
    }

    for (i in 0..numero){
        println(i)
    }
    println("FIM!!")
}