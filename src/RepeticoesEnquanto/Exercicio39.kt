/** 39) Faça um algoritmo que mostre na tela a seguinte contagem:
10 9 8 7 6 5 4 3 Acabou! */

fun main(){
    var contador = 11
    while (contador > 3){
        contador -= 1
        println(contador)
    }
    println("Acabou!")
}