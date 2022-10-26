/** 16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias. */

fun main() {
    println("Quantos cigarros voce fuma por dia?")
    var cigarrosPorDia = readLine()!!.toInt()
    while (cigarrosPorDia < 0) {
        println("A quantidade de cigarros nao podem ser menores que zero. Quantos cigarros voce fuma por dia?")
        cigarrosPorDia = readLine()!!.toInt()
    }

    println("Quantos anos voce fuma?")
    var quantosAnosFuma = readLine()!!.toInt()
    while (quantosAnosFuma < 0) {
        println("Os anos nao podem ser menores que zero. Quantos anos voce fuma?")
        quantosAnosFuma = readLine()!!.toInt()
    }

    val quantidadeFumados = cigarrosPorDia * 365
    val totalDeCigarros = quantidadeFumados * quantosAnosFuma
    val minutosTotais = totalDeCigarros * 10
    val horasTotais = minutosTotais / 60
    val diasperdidos = horasTotais / 24
    println("Voce ja teve $diasperdidos dias perdidos")
}
