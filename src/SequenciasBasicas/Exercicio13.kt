/** 13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento. */

fun main() {
    println("Qual seu salario?")
    var salario = readLine()!!.toFloat()
    while (salario <= 0) {
        println("O salario nao pode ser menor ou igual a zero. Qual o salario?")
        salario = readLine()!!.toFloat()
    }
    val novoSalario = salario * 0.15 + salario
    println("Seu novo salario e $novoSalario $")

}
