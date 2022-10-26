/** 34) O Índice de Massa Corpórea (IMC) é um valor calculado baseado na altura e no
peso de uma pessoa. De acordo com o valor do IMC, podemos classificar o
indivíduo dentro de certas faixas.
- abaixo de 18.5: Abaixo do peso
- entre 18.5 e 25: Peso ideal
- entre 25 e 30: Sobrepeso
- entre 30 e 40: Obesidade
- acima de 40: Obseidade mórbida
Obs: O IMC é calculado pela expressão peso/altura² (peso dividido pelo quadrado
da altura) */

fun main() {
    println("Qual e seu peso?")
    var peso = readLine()!!.toFloat()
    while (peso <= 0) {
        println("O valor nao pode ser menor que zero. Qual e o seu peso?")
        peso = readLine()!!.toFloat()
    }

    println("Qual e sua altura")
    var altura = readLine()!!.toFloat()
    while (altura <= 0) {
        println("O valor nao pode ser menor que zero. Qual e sua altura?")
        altura = readLine()!!.toFloat()
    }

    val imc = peso / (altura * altura)

    if (imc >= 40) {
        println("Imc $imc, Obesidade Morbida")
    } else if (imc >= 30) {
        println("Imc $imc, Obesidade")
    } else if (imc >= 25) {
        println("Imc $imc, Sobrepeso")
    } else if (imc >= 18.5) {
        println("Imc $imc, peso ideal")
    } else {
        println("Imc $imc, abaixo do peso ")
    }
}