/** 85) Faça um algoritmo que leia o nome, o sexo e o salário de 5 funcionários e
guarde esses dados em três vetores. No final, mostre uma listagem contendo
apenas os dados das funcionárias mulheres que ganham mais de R$5 mil. */

fun main() {
    val dadosNomes = Array(5) { "" }
    val dadosSexo = Array(5) { 0 }
    val dadosSalario = Array(5) { 0.0f }
    for (i in 0..4){
        println("Qual seu nome?")
        dadosNomes[i] = readLine()!!.toString()

        println("Qual seu sexo? Digite 1 -> Masculino || 2 -> Feminino ")
        dadosSexo[i] = readLine()!!.toInt()
        while (dadosSexo[i] <= 0 || dadosSexo[i] > 2){
            println("O codigo nao pode ser menor que 1 e maior que 2")
            println("Qual seu sexo? Digite 1 -> Masculino || 2 -> Feminino ")
            dadosSexo[i] = readLine()!!.toInt()
        }

        println("Qual seu salario?")
        dadosSalario[i] = readLine()!!.toFloat()
    }

    for (i in 0..4){
        if ( dadosSalario[i] > 5.000 && dadosSexo[i] == 2){
            println("As mulheres que ganham mais de 5 mil sao: nome: ${dadosNomes[i]}, salario: ${dadosSalario[i]} ")
        }
    }

}