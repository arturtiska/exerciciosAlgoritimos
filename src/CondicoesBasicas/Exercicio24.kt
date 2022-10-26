/** 24) Faça um algoritmo que pergunte a distância que um passageiro deseja
percorrer em Km. Calcule o preço da passagem, cobrando R$0.50 por Km para
viagens até 200Km e R$0.45 para viagens mais longas.*/

fun main() {
    println("Qual a distancia que voce deseja percorrer?")
    var distancia = readLine()!!.toFloat()
    while (distancia < 0) {
        println("A distancia nao pode ser menor que zero. Qual a distancia que voce deseja percorrer?")
        distancia = readLine()!!.toFloat()
    }
    if (distancia <= 200) {
        val valor = distancia * 0.50
        println("O preco da passagem e de: $valor")
    } else {
        val valor = distancia * 0.45
        println("O preco da passagem e de: $valor")
    }
}