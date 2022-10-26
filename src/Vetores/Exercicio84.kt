/** 84) Crie um programa que leia o nome e a idade de 9 pessoas e guarde esses
valores em dois vetores, em posições relacionadas. No final, mostre uma listagem
contendo apenas os dados das pessoas menores de idade. */

fun main() {
    val dadosIdade = Array(9) { 0 }
    val dadosNomes = Array(9) { "" }
    for (i in 0..8) {
        println("Qual seu nome?")
        dadosNomes[i] = readLine()!!.toString()

        println("Qual sua idade?")
        dadosIdade[i] = readLine()!!.toInt()
        while (dadosIdade[i] < 0) {
            println("A idade nao pode ser negativa, Digite sua idade")
            dadosIdade[i] = readLine()!!.toInt()
        }
    }
    for (i in 0..8) {
        if (dadosIdade[i] < 18) {
            println("Nome: ${dadosNomes[i]}, idade: ${dadosIdade[i]}")
        }
    }
}

