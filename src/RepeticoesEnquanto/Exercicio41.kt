/** 41) Desenvolva um programa que mostre na tela a seguinte contagem:
100 95 90 85 80 ... 0 Acabou! */

fun main() {
    var contador = 105
    while (contador > 0) {
        contador -= 5
        println(contador)
    }
    println("Acabou!")
}