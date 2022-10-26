/** 45) O programa acima vai ter um problema quando digitarmos o primeiro valor
 maior que o último. Resolva esse problema com um código que funcione em qualquer
 situação. */

fun main() {

    println("Digite o primeiro valor")
    var primeiroValor = readLine()!!.toInt()
    while (primeiroValor <= 0) {
        println("O numero nao pode ser menor que zero. Qual o ultimo valor?")
        primeiroValor = readLine()!!.toInt()
    }

    println("Digite o ultimo valor?")
    var ultimovalor = readLine()!!.toInt()
    while (ultimovalor <= 0) {
        println("O numero nao pode ser menor que zero. Qual o ultimo valor?")
        ultimovalor = readLine()!!.toInt()
    }

    println("Digite o incremento")
    var incremento = readLine()!!.toInt()
    while (incremento <= 0) {
        println("O numero nao pode ser menor que zero. Digite o incremento")
        incremento = readLine()!!.toInt()
    }

    if (primeiroValor > ultimovalor){
        val ultimoValorAux = ultimovalor
        ultimovalor = primeiroValor
        primeiroValor = ultimoValorAux
    }

    while (primeiroValor <= ultimovalor) {
        println(primeiroValor)
        primeiroValor += incremento
    }
}