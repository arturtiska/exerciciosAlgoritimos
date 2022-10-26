/** 58) Faça um algoritmo que leia a idade de vários alunos de uma turma. O programa
vai parar quando for digitada a idade 999. No final, mostre quantos alunos
existem na turma e qual é a média de idade do grupo. */

fun main() {
    var contadorAlunos = 0
    var somaIdadeAlunos = 0

    println("Qual e a idade?")
    var idade = readLine()!!.toInt()
    while (idade < 0){
        println("A idade nao pode ser menor que zero! Qual e a idade?")
        idade = readLine()!!.toInt()
    }


    while (idade != 999){
        contadorAlunos += 1
        somaIdadeAlunos += idade
        println("Qual e a idade?\nCaso deseje sair digite 999")
        idade = readLine()!!.toInt()
        while (idade <= 0){
            println("A idade nao pode ser menor que zero! Qual e a idade?")
            idade = readLine()!!.toInt()
        }

    }
    println("Existe $contadorAlunos alunos na turma")
    println("A media entre as idades dos alunos sao de: ${somaIdadeAlunos/ contadorAlunos} anos")
    
}