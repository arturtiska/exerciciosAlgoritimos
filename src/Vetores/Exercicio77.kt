/** 77) Faça um programa que leia 7 nomes de pessoas e guarde-os em um vetor. No
final, mostre uma listagem com todos os nomes informados, na ordem inversa
daquela em que eles foram informados */

fun main() {
    val nomes = Array(7) { "" }
    for (i in 0..6) {
        println("Qual o ${i + 1} nome?")
        nomes[i] = readLine().toString()
    }
    for (i in 6 downTo 0) {
        println(nomes[i])
    }
}





