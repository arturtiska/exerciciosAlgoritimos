/** 18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
dela e depois mostre se ela pode ou não votar. */

fun main() {

    val anoAtual = 2022
    println("Qual ano voce nasceu?")
    var anoNascimento = readLine()!!.toInt()
    while (anoNascimento <= 0 || anoNascimento > anoAtual) {
        println("O ano de nascimento deve ser maior que zero e menor que o ano atual. Qual ano voce nasceu?")
        anoNascimento = readLine()!!.toInt()
    }

    val idadeAtual = anoAtual - anoNascimento
    if (idadeAtual < 16) {
        println("Voce nao pode votar!!")
    } else {
        println("Voce pode votar, soldado!")
    }
}
    