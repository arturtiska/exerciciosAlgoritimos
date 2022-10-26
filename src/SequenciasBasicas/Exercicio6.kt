/** 6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.
Ex:
Digite um número: 9
O antecessor de 9 é 8
O sucessor de 9 é 10 */

fun main() {
    println("Qual e o numero?")
    val numero = readLine()!!.toInt()

    val antecessor = numero - 1
    val sucessor = numero + 1
    println("O antecessor de $numero e: $antecessor\nO sucessor de $numero e: $sucessor")
}
