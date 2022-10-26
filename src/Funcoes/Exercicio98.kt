/**  Crie um programa que tenha uma função SuperSomador(), que vai receber dois
números como parâmetro e depois vai retornar a soma de todos os valores no
intervalo entre os valores recebidos.
Ex:
SuperSomador(1, 6) vai somar 1 + 2 + 3 + 4 + 5 + 6 e vai retornar 21
SuperSomador(15, 19) vai somar 15 + 16 + 17 + 18 + 19 e vai retornar 85 */

fun main() {
    superSomador(0, 6)
}

fun superSomador(a: Int, b: Int) {
    var contador = a
    val limite = b
    var soma = 0

    while (contador < limite) {
        contador += 1
        soma += contador

    }
    println(soma)
}