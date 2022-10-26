/** 25) [DESAFIO] Crie um programa que leia o tamanho de três segmentos de reta.
Analise seus comprimentos e diga se é possível formar um triângulo com essas
retas. Matematicamente, para três segmentos formarem um triângulo, o comprimento
de cada lado deve ser menor que a soma dos outros dois.*/

fun main() {
    println("Qual o tamanho da primeira reta?")
    var reta1 = readLine()!!.toFloat()
    while (reta1 < 0) {
        println("O valor nao pode ser menor que zero. Qual a primeira reta?")
        reta1 = readLine()!!.toFloat()
    }
    println("Qual o tamanho da segunda reta?")
    var reta2 = readLine()!!.toFloat()
    while (reta2 < 0) {
        println("O valor nao pode ser menor que zero. Qual a segunda reta?")
        reta2 = readLine()!!.toFloat()
    }
    println("Qual o tamano da terceira reta?")
    var reta3 = readLine()!!.toFloat()
    while (reta3 < 0) {
        println("O valor nao pode ser menor que zero. Qual a terceira reta?")
        reta3 = readLine()!!.toFloat()
    }

    if (reta1 < reta2 + reta3 && reta2 < reta1 + reta3 && reta3 < reta1 + reta2) {
        println("E possivel formar um trinagulo com essas retas")
    } else {
        println("Nao e possivel formar um trinagulo com essas retas")
    }
}
