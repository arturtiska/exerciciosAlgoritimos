/** 33) Escreva um programa para aprovar ou não o empréstimo bancário para a compra
de uma casa. O programa vai perguntar o valor da casa, o salário do comprador e
em quantos anos ele vai pagar. Calcule o valor da prestação mensal, sabendo que
ela não pode exceder 30% do salário ou então o empréstimo será negado. */

fun main() {
    println("Qual o valor da casa?")
    var valorCasa = readLine()!!.toFloat()
    while (valorCasa <= 0) {
        println("O valor nao pode ser menor que zero. Qual valor da casa?")
        valorCasa = readLine()!!.toFloat()
    }

    println("Qual seu salario?")
    var salario = readLine()!!.toFloat()
    while (salario <= 0) {
        println("O valor nao pode ser menor que zero. Qual seu salario?")
        salario = readLine()!!.toFloat()
    }

    println("Em quantos anos voce deseja pagar?")
    var anosPagar = readLine()!!.toInt()
    while (anosPagar <= 0) {
        println("O valor nao poder menor que zero. Em quantos anos deseja pagar?")
        anosPagar = readLine()!!.toInt()
    }

    val mesesAno = anosPagar * 12
    val valorPagarMes = valorCasa / mesesAno
    val trintaSalario = salario * 30 / 100
    if (valorPagarMes > trintaSalario) {
        println("A prestacao ficara: $valorPagarMes, seu financiamento excede os 30% do seu salario")
    } else {
        println("A prestacao ficara: $valorPagarMes, seu financiamento foi aprovado!")
    }
}