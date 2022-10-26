/** 14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado. */

fun main() {
    println("Quantos km voce percorreu?")
    var kmPercorridos = readLine()!!.toFloat()
    while (kmPercorridos < 0) {
        println("Os km percorridos nao podem ser menores que zero. quantos km voce percorreu?")
        kmPercorridos = readLine()!!.toFloat()
    }
    
    println("Quantos dias voce usou?")
    var dias = readLine()!!.toFloat()
    while (dias < 0) {
        println("Os dias nao podem ser menores que zero. Quantos dias voce usou?")
        dias = readLine()!!.toFloat()
    }

    val valorDiaria = 90
    val km = 0.20
    val valorDia = dias * valorDiaria
    val valorKm = kmPercorridos * km
    val precoTotal = valorDia + valorKm
    println("Seu preco total a pagar e : $precoTotal")
}
