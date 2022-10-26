/** 78) Escreva um programa que leia 15 números e guarde-os em um vetor. No final,
mostre o vetor inteiro na tela e em seguida mostre em que posições foram
digitados valores que são múltiplos de 10. */

fun main() {
    val numeros = Array(15) { 0 }
    for (i in 1..15) {
        println("Qual o $i o. numero?")
        numeros[i] = readLine()!!.toInt()
    }
    println(numeros.joinToString())

    for (i in numeros.indices) {
        if (numeros[i] % 10 == 0) {
            println("Os numeres divisiveis por 10 estao na posicao $i")
        }
    }
}