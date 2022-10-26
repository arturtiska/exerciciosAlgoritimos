/** 23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
para todos, mas especialmente para mulheres. Faça um programa que leia nome,
sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
que:
- Homens ganham 5% de desconto
- Mulheres ganham 13% de desconto */

fun main() {
    println("Qual seu nome?")
    val nome = readLine().toString()
    println("Qual seu sexo? 1 -> Masculino || 2 -> Feminino")
    var sexo = readLine()!!.toInt()
    while (sexo < 1 || sexo > 2) {
        println("Valor invalido. escola 1 -> Masculino || 2 -> Feminino ")
        sexo = readLine()!!.toInt()
    }

    println("Qual valor da sua compra?")
    var valorCompra = readLine()!!.toFloat()
    while (valorCompra < 0) {
        println("O valor nao pode ser menor que zero. Qual o valor da sua compra?")
        valorCompra = readLine()!!.toFloat()
    }

    if (sexo == 1) {
        val descontoM = valorCompra - (valorCompra * 0.05)
        println("$nome sua compra com desconto e de: $descontoM $")
    } else {
        val descontoF = valorCompra - (valorCompra * 0.13)
        println("$nome sua compra com desconto e de: $descontoF $")
    }
}
