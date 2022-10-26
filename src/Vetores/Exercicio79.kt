/** 79) Desenvolva um programa que leia 10 números inteiros e guarde-os em um vetor.
No final, mostre quais são os números pares que foram digitados e em que
posições eles estão armazenados. */

fun main() {
    val numeros = Array(10) { 0 }
    for (i in 0..9) {
        println("Qual o ${i + 1}o. numero?")
        numeros[i] = readLine()!!.toInt()
    }

    for (i in numeros.indices) {
        if (numeros[i] % 2 == 0) {
            println(" Encontrado valores ${numeros[i]} par na posicao: $i")
        }
    }
}
