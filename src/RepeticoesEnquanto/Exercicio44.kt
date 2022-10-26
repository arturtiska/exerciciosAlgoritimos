/** 44) Crie um algoritmo que leia o valor inicial da contagem, o valor final e o
incremento, mostrando em seguida todos os valores no intervalo:
Ex: Digite o primeiro Valor: 3
Digite o último Valor: 10
Digite o incremento: 2
Contagem: 3 5 7 9 Acabou! */

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