/** 12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto. */

fun main() {
    println("Qual o preco do produto?")
    var produto = readLine()!!.toFloat()
    while (produto < 0) {
        println("O preco nao pode ser menor que zero. Qual o preco do produto?")
        produto = readLine()!!.toFloat()
    }

    val valorFinal = produto - (produto * 0.05)
    println("O preco promocional e: $valorFinal")
}