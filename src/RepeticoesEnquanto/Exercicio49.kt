/** 49) Crie um programa que leia 6 números inteiros e no final mostre quantos deles
são pares e quantos são ímpares. */

fun main() {
    var contador = 1
    var somaPar = 0
    var somaImpar = 0
    while (contador <= 6) {
        println("Qual o $contador numero?")
        var numero = readLine()!!.toInt()
        while (numero <= 0) {
            println("O numero nao pode ser zero. Qual $contador valor?")
            numero = readLine()!!.toInt()
        }
        contador += 1
        if (numero % 2 == 0) {
            somaPar += 1
        } else {
            somaImpar += 1
        }
    }
    println(" Existe $somaPar numeros pares")
    println(" Existe $somaImpar numeros impares")
}
