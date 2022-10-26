/** 82) Faça um algoritmo que leia a nota de 10 alunos de uma turma e guarde-as em
um vetor. No final, mostre:
a) Qual é a média da turma
b) Quantos alunos estão acima da média da turma
c) Qual foi a maior nota digitada
d) Em que posições a maior nota aparece */

fun main() {
    var media = 0.0f
    var acimaMedia = 0.0f
    var maior = 0.0f
    val notas = mutableListOf<Int>()
    for (i in 1..10) {
        println("Qual a $i nota?")
        var nota = readLine()!!.toFloat()
        while (nota <= 0){
            println("A nota nao pode ser menor que zero! Qual e a nota?")
            nota = readLine()!!.toFloat()
        }
        notas.add(nota.toInt())

        media += nota / 10

        if (nota > maior) {
            maior = nota
        }
        if (nota > 7) {
            acimaMedia += 1
        }
    }

    println("A media entre as notas e: $media")
    println("Existe $acimaMedia notas acima da media")
    println("A maior nota digitada foi: $maior")

    for (i in 0..9) {
        if (notas[i] >= maior) {
            println("A maior nota aparece na posicao: $i")
        }
    }
}