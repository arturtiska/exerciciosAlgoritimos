/** 59) Crie um programa que leia o sexo e a idade de várias pessoas. O programa vai
perguntar se o usuário quer continuar ou não a cada pessoa. No final, mostre:
a) qual é a maior idade lida
b) quantos homens foram cadastrados
c) qual é a idade da mulher mais jovem
d) qual é a média de idade entre os homens */

fun main() {

    var homensCadastrado = 0
    var somatorioIdadeHomens = 0
    var menorIdadeMulher = 100
    var maiorIdadeLida = 0

    var sair = 0
    while (sair != 1) {
        println("Qual e o seu sexo? Digite 1 -> masculino || 2 -> feminino")
        val sexo = readLine()!!.toInt()

        println("Qual e idade?")
        var idade = readLine()!!.toInt()
        while (idade < 0){
            println("A idade nao pode ser menor que zero! Qual e a idade?")
            idade = readLine()!!.toInt()
        }

        if (idade > maiorIdadeLida) {
            maiorIdadeLida = idade
        }
        if (sexo == 1) {
            homensCadastrado++
            somatorioIdadeHomens += idade
        }else{
            if (idade < menorIdadeMulher){
                menorIdadeMulher = idade
            }
        }

        println("Deseja sair? Digite 1 -> Sim || 2 -> Nao")
        sair = readLine()!!.toInt()
    }
    println("A maior idade lida foi: $maiorIdadeLida")
    println("fora cadastrado $homensCadastrado homens.")
    println("A menor idade entre as mullheres e de: $menorIdadeMulher")
    println("A media de idade entre os homens e de: ${somatorioIdadeHomens / homensCadastrado}")

}