/** 91) Desenvolva um algoritmo que leia dois valores pelo teclado e passe esses
valores para um procedimento Maior() que vai verificar qual deles é o maior e
mostrá-lo na tela. Caso os dois valores sejam iguais, mostrar uma mensagem
informando essa característica.*/


fun main() {
    fun maior(numero1: Int, numero2: Int){
        if (numero1 > numero2) {
            println("o primeiro valor e maior!")
        }
        if (numero1 == numero2) {
            println("Nao existe numero maior, os dois sao iguais!")
        }
        if (numero1 < numero2) {
            println("O segundo valor e maior")
        }
    }
    println("Qual o primeiro numero?")
    var numero1 = readLine()!!.toInt()
    while (numero1 <= 0){
        println("primeiro Numero nao pode ser menor que zero! Qual e a primeiro Numero?")
        numero1 = readLine()!!.toInt()
    }

    println("Qual o segundo numero?")
    var numero2 = readLine()!!.toInt()
    while (numero2 <= 0){
        println("segundo Numero nao pode ser menor que zero! Qual e a segundo Numero?")
        numero2 = readLine()!!.toInt()
    }

    println(maior(numero1, numero2))

}