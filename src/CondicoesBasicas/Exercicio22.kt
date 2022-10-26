/** 22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
situação em relação ao alistamento militar.
- Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
alistamento.
- Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
alistamento. */

fun main() {
    val anoAtual = 2022
    println("Qual ano do seu nascimento?")
    var anoNascimento = readLine()!!.toInt()
    while (anoNascimento <= 0 || anoNascimento > anoAtual) {
        println("O ano nao pode ser menor que zero nem maior que o ano atual. Qual ano do seu nascimento?")
        anoNascimento = readLine()!!.toInt()
    }


    val idade = anoAtual - anoNascimento
    val idadeMinima = 18
    if (idade < idadeMinima) {
        println("voce nao tem idade para alistar, falta ${idadeMinima - idade} anos para seu alistamento!")
    } else {
        println("Ja passaram ${idade - idadeMinima} anos para seu alistamento!")
    }
}

