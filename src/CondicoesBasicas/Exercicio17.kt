/** 17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida. */

fun main() {
    println("Qual a velocidade do carro?")
    var velocidadeCarro = readLine()!!.toFloat()
    while (velocidadeCarro < 0) {
        println("A velocidade do carro nao podem ser menores que zero. Qual a velocidade do carro?")
        velocidadeCarro = readLine()!!.toFloat()
    }

    val velocidadeMaxima = 80

    if (velocidadeCarro > velocidadeMaxima) {
        val calculoMulta = (velocidadeCarro - velocidadeMaxima) * 5
        println("voce foi multado em $calculoMulta $")
    } else {
        println("Voce nao foi multado, sua velocidade e: $velocidadeCarro km")
    }
}
