/** 4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
entre eles.
Ex:
Digite um valor: 8
Digite outro valor: 5
A soma entre 8 e 5 é igual a 13. */

fun main() {
    println("Entre com o primeiro numero: ")
    val primeiroNumero = readLine()!!.toInt()

    println("Entre com o segundo numero:")
    val segundoNumero = readLine()!!.toInt()


    val soma = primeiroNumero + segundoNumero
    println("A soma entre $primeiroNumero e $segundoNumero e igual a $soma")
}











