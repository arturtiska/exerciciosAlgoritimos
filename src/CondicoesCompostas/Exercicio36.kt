/** 36) Um programa de vida saudável quer dar pontos atividades físicas que podem
ser trocados por dinheiro. O sistema funciona assim:
- Cada hora de atividade física no mês vale pontos
- até 10h de atividade no mês: ganha 2 pontos por hora
- de 10h até 20h de atividade no mês: ganha 5 pontos por hora
- acima de 20h de atividade no mês: ganha 10 pontos por hora
- A cada ponto ganho, o cliente fatura R$0,05 (5 centavos)
Faça um programa que leia quantas horas de atividade uma pessoa teve por mês,
calcule e mostre quantos pontos ela teve e quanto dinheiro ela conseguiu ganhar.) */

fun main() {
    println("Quantas horas de atividades voce fez no mes?")
    var horasAtividade = readLine()!!.toInt()
    while (horasAtividade <= 0) {
        println("O valor nao pode ser menor que zero. Quantas horas de atividades voce fez no mes?")
        horasAtividade = readLine()!!.toInt()
    }
    val pontos = if (horasAtividade <= 10) {
        horasAtividade * 2
    } else if (horasAtividade in 11..20) {
        horasAtividade * 5
    } else {
        horasAtividade * 10
    }

    val valorTotalBonus = pontos * 0.05
    println("Voce teve $pontos pontos\nE $valorTotalBonus $")
}
