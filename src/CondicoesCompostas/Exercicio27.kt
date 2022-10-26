/** 27) Crie um programa que leia duas notas de um aluno e calcule a sua média,
mostrando uma mensagem no final, de acordo com a média atingida:
- Média até 4.9: REPROVADO
- Média entre 5.0 e 6.9: RECUPERAÇÃO
- Média 7.0 ou superior: APROVADO */

fun main() {
    println("Qual sua primeira nota?")
    var nota1 = readLine()!!.toFloat()
    while (nota1 < 0) {
        println("A nota nao pode ser menor que zero. Qual a primeira nota?")
        nota1 = readLine()!!.toFloat()
    }

    println("Qual sua segunda nota?")
    var nota2 = readLine()!!.toFloat()
    while (nota2 < 0) {
        println("A nota nao pode ser menor que zero. Qual a segunda nota?")
        nota2 = readLine()!!.toFloat()
    }

    val media = (nota1 + nota2) / 2
    if (media <= 4.9) {
        println("Voce foi reprovado")
    } else if (media <= 6.9) {
        println("Voce esta de recuperacao")
    } else {
        println("Voce foi aprovado")
    }
}
