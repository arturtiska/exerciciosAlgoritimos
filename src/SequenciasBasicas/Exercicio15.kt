/** 15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
por hora trabalhada. */

fun main() {
    println("Quantos dias voce trabalha em um mes?")
    var diasMes = readLine()!!.toInt()
    while (diasMes < 0) {
        println("Os dias nao podem ser menores que zero. Quantos dias voce trabalha no mes?")
        diasMes = readLine()!!.toInt()
    }

    val valorHora = 25
    val horasdia = 8
    val horasMes = horasdia * diasMes
    val salario = horasMes * valorHora
    println("seu salario e de: $salario $")
}

