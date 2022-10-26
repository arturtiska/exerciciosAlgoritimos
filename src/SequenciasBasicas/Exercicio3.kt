/** 3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho. */

fun main() {
    println("Qual seu nome?")
    val nome = readLine().toString()
    println("qual seu salario?")
    val salario = readLine()!!.toFloat()


    if (salario > 0) {
        println("O funcionario $nome, tem o salario de $salario em maio")
    } else {
        println("O salario deve ser maior que 0!")
    }

}




