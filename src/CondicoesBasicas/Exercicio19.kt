/** 19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
não um bom aproveitamento (se ficou acima da média 7.0). */

fun main() {
    println("Qual seu nome?")
    val nome = readLine().toString()

    println("Qual sua primeira nota?")
    var nota1 = readLine()!!.toFloat()
    while (nota1 < 0) {
        println("A nota nao pode ser menor que zero. Qual a primeira nota?")
        nota1 = readLine()!!.toFloat()
    }

    println("Qual a segunda nota?")
    var nota2 = readLine()!!.toFloat()
    while (nota2 < 0) {
        println("A nota nao pode ser menor que zero. Qual a segunda nota?")
        nota2 = readLine()!!.toFloat()
    }

    val media = (nota1 + nota2) / 2
    if (media < 7.0) {
        println("Sua media foi: $media, $nome voce nao teve um bom aproveitamento!")
    } else {
        println("Parabens $nome, sua media foi: $media, voce teve um bom aproveitamento")
    }
}



