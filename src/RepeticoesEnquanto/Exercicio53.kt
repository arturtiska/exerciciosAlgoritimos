/** 53) Faça um programa que leia a idade e o sexo de 5 pessoas, mostrando no final:
a) Quantos homens foram cadastrados
b) Quantas mulheres foram cadastradas
c) A média de idade do grupo
d) A média de idade dos homens
e) Quantas mulheres tem mais de 20 anos */

fun main() {
    var contador = 1
    var somaTotalHomens = 0
    var somaTotalMulheres = 0
    var totalIdades = 0
    var totalIdadesHomens = 0
    var totalMulheresMaisVinteAnos = 0

    while (contador <= 5) {
        println("Qual o $contador sexo?. Escolha 1 -> Maculino || 2 -> Feminino")
        var sexo = readLine()!!.toInt()
        while (sexo < 1 || sexo > 2) {
            println("Codigo invalido. Escolha 1 -> Maculino || 2 -> Feminino ")
            sexo = readLine()!!.toInt()
        }

        println("Qual a sua idade?")
        var idade = readLine()!!.toInt()
        while (idade <= 0) {
            println("A idade nao pode ser menor que zero. Qual a sua idade?")
            idade = readLine()!!.toInt()
        }
        contador += 1
        totalIdades += idade


        if (sexo == 1) {
            somaTotalHomens++
            totalIdadesHomens += idade
        } else {
            somaTotalMulheres++
            if (idade > 20) {
                totalMulheresMaisVinteAnos++
            }
        }

    }
    val media = totalIdades / 5
    println("Foram cadastrado $somaTotalHomens homens.")
    println("Foram cadastrada $somaTotalMulheres mulheres.")
    println("A media das idades dos homens e de: ${totalIdadesHomens / somaTotalHomens}")
    println("A media das idades e: $media")
    println("Existe $totalMulheresMaisVinteAnos pessoas do sexo feminino com mais de 20 anos")

}