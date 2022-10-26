/** 52) Crie um algoritmo que leia a idade de 10 pessoas, mostrando no final:
a) Qual é a média de idade do grupo
b) Quantas pessoas tem mais de 18 anos
c) Quantas pessoas tem menos de 5 anos
d) Qual foi a maior idade lida */

fun main() {
    var contador = 1
    var soma = 0
    var somaIdade = 0
    var menorIdade = 0
    var maiorIdade = 0

    while (contador <= 10) {
        println("Qual a $contador idade?")
        var idade = readLine()!!.toInt()
        while (idade <= 0) {
            println("A idade nao pode ser menor que zero. Qual $contador idade?")
            idade = readLine()!!.toInt()
        }
        contador += 1
        soma += idade

        if (idade >= 18) {
            somaIdade += 1
        }
       else if (idade <= 5) {
            menorIdade += 1
        }

        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }
    val media = soma / 10
    println("A media das idades e: $media anos")
    println("Existe $somaIdade pessoas com idade acima de 18 anos")
    println("Existe $menorIdade pessoas com idade menor de 5 anos")
    println("A maior idade e: $maiorIdade")

}