/** 81) Crie um programa que leia a idade de 8 pessoas e guarde-as em um vetor. No
final, mostre:
a) Qual é a média de idade das pessoas cadastradas
b) Em quais posições temos pessoas com mais de 25 anos
c) Qual foi a maior idade digitada (podem haver repetições)
d) Em que posições digitamos a maior idade */

fun main() {
    var maiorIdade = 0
    var somaIdades = 0

    val idades = mutableListOf<Int>()
    for (i in 1..8) {
        println("Qual a $i idade?")
        val idade = readLine()!!.toInt()
        idades.add(idade)

        somaIdades += idade

        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    for (i in 0..7) {
        if (idades[i] > 25) {
            println("As pessoas com mais de 25 anos estao na posicao: $i")
        }
    }
    for (i in 0..7) {
        if (idades[i] == maiorIdade) {
            println("A maior nota foi digitada na posicao de: $i")
        }
    }

    println("A maior idade e: $maiorIdade")
    println("A media de idades e: ${somaIdades / 8}")
}
