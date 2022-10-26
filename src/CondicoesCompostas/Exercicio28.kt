/** 28) Faça um programa que leia a largura e o comprimento de um terreno
retangular, calculando e mostrando a sua área em m². O programa também
deve mostrar a classificação desse terreno, de acordo com a lista abaixo:
- Abaixo de 100m² = TERRENO POPULAR
- Entre 100m² e 500m² = TERRENO MASTER
- Acima de 500m² = TERRENO VIP */

fun main() {
    println("Qual a largura do terreno?")
    var largura = readLine()!!.toFloat()
    while (largura < 0) {
        println("o valor nao pode ser menor que zero. Qual a largura do terreno?")
        largura = readLine()!!.toFloat()
    }

    println("Qual o comprimento do terreno?")
    var comprimento = readLine()!!.toFloat()
    while (comprimento < 0) {
        println("O valor nao pode ser menor que zero. Qual o comprimento do terreno?")
        comprimento = readLine()!!.toFloat()
    }

    val metros = largura * comprimento
    if (metros < 100) {
        println("Terreno popular")
    } else if (metros <= 500) {
        println("Terreno master")
    } else {
        println("Terreno vip")
    }
}