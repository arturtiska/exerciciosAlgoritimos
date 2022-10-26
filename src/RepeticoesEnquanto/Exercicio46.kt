/** 46) Crie um programa que calcule e mostre na tela o resultado da soma entre 6 +
8 + 10 + 12 + 14 + ... + 98 + 100. */

fun main (){
    var contador = 6
    var soma = 0
    while (contador <= 100){
        soma += contador
        contador += 2
    }
    println(soma)
}