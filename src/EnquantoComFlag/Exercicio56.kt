/** 56) Crie um programa que leia vários números pelo teclado e mostre no final o
somatório entre eles.
Obs: O programa será interrompido quando o número 1111 for digitado */
fun main() {
    var somatorio = 0
    println("Qual o numero?")
    var numero = readLine()!!.toInt()
    while (numero <= 0) {
        println("O numero nao pode ser menor que zero! Qual o numero?")
        numero = readLine()!!.toInt()
    }


    while (numero != 1111) {
        somatorio += numero
        println("Qual o numero?\nDigite 1111 caso queira sair")
        numero = readLine()!!.toInt()
        while (numero <= 0) {
            println("O numero nao pode ser menor que zero! Qual o numero?")
            numero = readLine()!!.toInt()
        }
    }

    println("A soma de todos os numeros e de: $somatorio")
}
