/** 60) Desenvolva um algoritmo que leia o nome, a idade e o sexo de várias pessoas.
O programa vai perguntar se o usuário quer ou não continuar. No final, mostre:
a) O nome da pessoa mais velha
b) O nome da mulher mais jovem
c) A média de idade do grupo
d) Quantos homens tem mais de 30 anos
e) Quantas mulheres tem menos de 18 anos */

fun main() {

    var contadorIdade = 0
    var contadorSexo = 0
    var contadorMenor18 = 0
    var homensMaisTrintaAnos = 0
    var nomePessoaMaisVelha = ""
    var maiorIdade = 0
    var nomeMulherMaisJovem = ""
    var menorIdadeMulher = 0


    var sair = 0
    while (sair != 1) {
        println("Qual o seu nome?")
        val nome = readLine().toString()

        println("Qual sua idade?")
        var idade = readLine()!!.toInt()
        while (idade <= 0) {
            println("A idade nao pode ser menor que zero! Qual e a idade?")
            idade = readLine()!!.toInt()
        }

        println("Qual o seu sexo? Digite 1 -> Masculino || 2 -> Feminino")
        val sexo = readLine()!!.toInt()

        contadorIdade += idade
        contadorSexo++

        if (idade > maiorIdade) {
            maiorIdade = idade
            nomePessoaMaisVelha = nome
        }

        if (sexo == 2) {
            if (menorIdadeMulher == 0 || idade < menorIdadeMulher) {
                menorIdadeMulher = idade
                nomeMulherMaisJovem = nome
            }
            if (idade > 18) {
                contadorMenor18++
            }
        } else {
            if (idade > 30) {
                homensMaisTrintaAnos++
            }
        }

        println("Deseja sair? Digite 1 -> Sim || 2 -> Nao")
        sair = readLine()!!.toInt()
    }

    val mediaIdadesTotais: Float = contadorIdade.toFloat() / contadorSexo

    println("O nome da pessoa mais velha e: $nomePessoaMaisVelha")
    println("O nome da mulher mais jovem e: $nomeMulherMaisJovem")
    println("A media de idades do grupo e de: $mediaIdadesTotais anos")
    println("Existe $contadorMenor18 mulheres com menos de 18 anos")
    println("Existe $homensMaisTrintaAnos com mais de 30 anos")
}