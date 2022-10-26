/** 71) Faça um programa que preencha automaticamente um vetor numérico com 8
posições, conforme abaixo:
999 999 999 999 999 999 999 999
0    1   2   3   4   5   6   7 */

fun main() {
    val vetor = Array(7) { 999 }
    println(vetor.joinToString())


}