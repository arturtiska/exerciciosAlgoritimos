/**  Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.
Ex:
Nota 1: 4.5
Nota 2: 8.5
A média entre 4.5 e 8.5 é igual a 6.5 */

fun main() {
    println("Qual a primeira nota?")
    var primeiraNota = readLine()!!.toFloat()

    while (primeiraNota < 0) {
        println("A nota deve ser maior que zero. Qual a primeira nota?")
        primeiraNota = readLine()!!.toFloat()
    }

    println("Qual a segunda nota?")
    var segundaNota = readLine()!!.toFloat()
    while (segundaNota < 0) {
        println("A nota deve ser maior que zero. Qual a segunda nota?")
        segundaNota = readLine()!!.toFloat()
    }

    val media = (primeiraNota + segundaNota) / 2
    println("A media entre $primeiraNota e $segundaNota e igual a: $media")

}