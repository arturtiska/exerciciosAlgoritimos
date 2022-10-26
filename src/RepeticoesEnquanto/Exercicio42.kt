/** 42) Faça um algoritmo que pergunte ao usuário um número inteiro e positivo
qualquer e mostre uma contagem até esse valor:
Ex: Digite um valor: 35
Contagem: 1 2 3 4 5 6 7 ... 33 34 35 Acabou! */

fun main() {
    println("Qual e o numero?")
    var numero = readLine()!!.toInt()
    while (numero <= 0) {
        println("O numero nao pode ser menor que zero. Qual e o numero?")
        numero = readLine()!!.toInt()
    }

    var contador = 0
    while (contador < numero) {
        contador += 1
        println(contador)
    }
    println("Acabou!")
}
