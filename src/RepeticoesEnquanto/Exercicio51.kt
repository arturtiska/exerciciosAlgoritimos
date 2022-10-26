/** 51) Faça um aplicativo que leia o preço de 8 produtos. No final, mostre na tela
qual foi o maior e qual foi o menor preço digitados. */

fun main() {
    var contador = 1
    var maior = 0.0f
    var menorPrecoDigitado = Float.MAX_VALUE

    while (contador <= 8) {
        println("Qual o $contador valor?")
        var valor = readLine()!!.toFloat()
        while (valor <= 0) {
            println("O valor nao pode ser menor que zero. Qual o $contador valor?")
            valor = readLine()!!.toFloat()
        }
        if (valor > maior) {
            maior = valor
        }
        if (valor < menorPrecoDigitado)
            menorPrecoDigitado = valor
        contador += 1
    }
    println("O produto de maior valor foi o de: $maior")
    println("O produto com o menor preco foi o de: $menorPrecoDigitado")

}

