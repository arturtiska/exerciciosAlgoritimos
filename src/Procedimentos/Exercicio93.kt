/**
93) Faça um programa que tenha um procedimento chamado Contador() que recebe
três valores como parâmetro: o início, o fim e o incremento de uma contagem. O
programa principal deve solicitar a digitação desses valores e passá-los ao
procedimento, que vai mostrar a contagem na tela.
Ex: Para os valores de início (4), fim (20) e incremento(3) teremos
Contador(4, 20, 3) vai mostrar na tela 4 >> 7 >> 10 >> 13 >> 16 >> 19 >> FIM
 */

fun main() {
    println("Qual e o inicio?")
    var inicio = readLine()!!.toInt()
    while (inicio <= 0){
        println("Numero nao pode ser menor que zero! Qual e o Numero?")
        inicio = readLine()!!.toInt()
    }

    println("Qual o fim?")
    var fim = readLine()!!.toInt()
    while (fim <= 0){
        println("Numero nao pode ser menor que zero! Qual e o Numero?")
        fim = readLine()!!.toInt()
    }

    println("Qual o incremento?")
    var incremento = readLine()!!.toInt()
    while (incremento <= 0){
        println("Numero nao pode ser menor que zero! Qual e o Numero?")
        incremento = readLine()!!.toInt()
    }

  somador(inicio, fim, incremento)

}

fun somador(inicio: Int, fim: Int, incremento: Int) {
    var inicia = inicio
    while (inicia < fim) {
        println(inicia)
         inicia += incremento
    }
    println("FIM!!")
}





