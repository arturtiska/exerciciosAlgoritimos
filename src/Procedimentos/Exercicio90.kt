/** 90) Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
valores para um procedimento Somador() que vai calcular e mostrar a soma entre
eles. */

fun main() {
    println("Qual o primeiro numero?")
    val primeiroNumero = readLine()!!.toInt()

    println("Qual o segundo numero?")
    val segundoNumero = readLine()!!.toInt()
    val soma = somador(primeiroNumero, segundoNumero)
    println("O resultado e $soma")

}

fun somador(a: Int, b: Int) = a + b
