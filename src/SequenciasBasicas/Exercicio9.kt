/** 9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45. */

fun main() {
    println("Quanto dinheiro voce tem na carteira?")
    var dinheiroNaCarteira = readLine()!!.toFloat()
    while (dinheiroNaCarteira < 0) {
        println("O valor dever ser maior ou igual a zero. Quanto dinheiro voce tem na carteira?")
        dinheiroNaCarteira = readLine()!!.toFloat()
    }

    val dolar = 3.45
    val resultado = dinheiroNaCarteira / dolar
    println("Voce pode comprar: $resultado dolar")
}
