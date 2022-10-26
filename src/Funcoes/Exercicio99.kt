import kotlin.math.pow
/** 99) Faça um programa que possua uma função chamada Potencia(), que vai receber
dois parâmetros numéricos (base e expoente) e vai calcular o resultado da
exponenciação.
Ex: Potencia(5,2) vai calcular 52 = 25 */

fun main() {
    println("Qual o numero?")
    var numero = readLine()!!.toDouble()
    while (numero < 0){
        println("segundo Numero nao pode ser menor que zero! Qual e o Numero?")
        numero = readLine()!!.toDouble()
    }
    val resposta = potencia(numero)
    println(resposta)
}
fun potencia(a: Double): Double{
    return a.pow(2)
}

