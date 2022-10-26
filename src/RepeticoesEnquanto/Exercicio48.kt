/** 48) Faça um programa que leia 7 números inteiros e no final mostre o somatório
entre eles. */

fun main() {
    var contador = 1
    var soma = 0
    while (contador <= 7) {
        println("Digite o $contador o. valor")
        var numero = readLine()!!.toInt()
        while (numero <= 0){
            println("O valor nao pode ser menor que zero. Qual $contador valor?")
            numero = readLine()!!.toInt()
        }
        contador += 1
        soma += numero
    }
    println("A soma de todos os valores e: $soma")
}