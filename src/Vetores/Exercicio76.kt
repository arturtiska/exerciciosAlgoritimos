import kotlin.random.Random

/** 76) Crie um programa que preencha automaticamente um vetor numérico com 7
números gerados aleatoriamente pelo computador e depois mostre os valores
gerados na tela. */

fun main() {
    val numeros =  Array(7){ Random.nextInt(0,100) }
    println(numeros.joinToString())
}
