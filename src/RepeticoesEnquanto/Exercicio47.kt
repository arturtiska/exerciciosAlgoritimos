/** 47) Desenvolva um aplicativo que mostre na tela o resultado da expressão 500 +
450 + 400 + 350 + 300 + ... + 50 + 0 */

fun main (){
    var contador = 550
    var soma = 0
    while (contador > 0){
        soma += contador
        contador -= 50
    }
    println(soma)
}