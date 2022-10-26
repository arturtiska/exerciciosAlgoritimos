 /** 7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.
Ex:
Digite um número: 3.5
O dobro de 3.5 é 7.0
A terça parte de 3.5 é 1.16666 */

fun main(){
    println("Qual e o numero?")
    val numero = readLine()!!.toFloat()

    val dobro = numero * 2
    val tercaParte = numero / 3
    println("O dobro do numero $numero e: $dobro\nA terca parte do numero $numero e: $tercaParte")

}