/** 35) Uma empresa de aluguel de carros precisa cobrar pelos seus serviços. O
aluguel de um carro custa R$90 por dia para carro popular e R$150 por dia para
carro de luxo. Além disso, o cliente paga por Km percorrido. Faça um programa
que leia o tipo de carro alugado (popular ou luxo), quantos dias de aluguel e
quantos Km foram percorridos. No final mostre o preço a ser pago de acordo com a
tabela a seguir:
- Carros populares (aluguel de R$90 por dia)
- Até 100Km percorridos: R$0,20 por Km
- Acima de 100Km percorridos: R$0,10 por Km
- Carros de luxo (aluguel de R$150 por dia)
- Até 200Km percorridos: R$0,30 por Km
- Acima de 200Km percorridos: R$0,25 por Km */

fun main() {
    println("Qual carro voce escolheu? 1 -> Carro Popular || 2 -> Carro de luxo")
    var carro = readLine()!!.toInt()
    while (carro < 1 || carro > 2) {
        println("Valor invalido. Escolha: 1 -> Carro Popular || 2 -> Carro de luxo ")
        carro = readLine()!!.toInt()
    }
    val carroPopular = 90
    val carroLuxo = 150

    println("Quantos dias voce usou?")
    var dias = readLine()!!.toInt()
    while (dias <= 0) {
        println("O valor nao pode ser menor que zero. Quantos dias voce usou?")
        dias = readLine()!!.toInt()
    }

    println("Quantos km voce percorreu?")
    var kmPercorrido = readLine()!!.toInt()
    while (kmPercorrido <= 0) {
        println("O valor nao pode ser menor que zero. Quantos km voce percorreu?")
        kmPercorrido = readLine()!!.toInt()
    }

    if (carro == 1 && kmPercorrido <= 100) {
        val custokm = 0.20
        val valorCarroPopular = (carroPopular * dias) + (kmPercorrido * custokm)
        println("O valor da diaria do seu carro popular ficou em: $valorCarroPopular$")
    }
    if (carro == 1 && kmPercorrido > 100) {
        val custoKm = 0.10
        val valorCarroPopular = (carroPopular * dias) + (kmPercorrido * custoKm)
        println("O valor da diaria do seu carro popular ficou em: $valorCarroPopular$")
    }
    if (carro == 2 && kmPercorrido <= 200) {
        val custoKm = 0.30
        val valorCarroLuxo = (carroLuxo * dias) + (kmPercorrido * custoKm)
        println("O valor da diaria do seu carro luxo ficou em: $valorCarroLuxo")
    }
    if (carro == 2 && kmPercorrido > 200) {
        val custoKm = 0.25
        val valorCarroLuxo = (carroLuxo * dias) + (kmPercorrido * custoKm)
        println("O valor da diaria do seu carro luxo ficou em: $valorCarroLuxo")
    }
}















