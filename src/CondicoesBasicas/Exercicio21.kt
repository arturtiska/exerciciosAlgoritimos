/** 21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
BISSEXTO. */

fun main() {
    println("Qual o ano?")
    var ano = readLine()!!.toInt()
    while (ano <= 0) {
        println("O ano nao pode ser menor que zero. Qual o ano?")
        ano = readLine()!!.toInt()
    }

    if (ano % 4 == 0) {
        println("Esse ano $ano, e bissexto!")
    } else {
        println("Esse ano $ano, nao e bissexto!")
    }
}

