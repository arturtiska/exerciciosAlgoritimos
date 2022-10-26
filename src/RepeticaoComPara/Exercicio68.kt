/** 68) Crie um programa que leia sexo e peso de 8 pessoas, usando a estrutura
“para”. No final, mostre na tela:
a) Quantas mulheres foram cadastradas
b) Quantos homens pesam mais de 100Kg
c) A média de peso entre as mulheres
d) O maior peso entre os homens */

fun main() {
    var totalDeMulheres = 0
    var totalHomensMaisCemKg = 0
    var totalPesoMulheres = 0.0f
    var maiorPesoHomens = 0.0f

    for (i in 1..8) {
        println("Qual e sua sexo? 1-> Masculino || 2-> Feminino")
        var sexo = readLine()!!.toInt()
        while (sexo < 0 || sexo > 2) {
            println("O codigo nao pode ser menor que zero ou maior que 2. Qual seu sexo?")
            sexo = readLine()!!.toInt()
        }

        println("Qual e seu peso?")
        var peso = readLine()!!.toFloat()
        while (peso < 0) {
            println("O peso nao pode ser menor que zero. Qual seu peso?")
            peso = readLine()!!.toFloat()
        }

        if (sexo == 2){
            totalDeMulheres++
            totalPesoMulheres += peso
        }else{
            if (peso > 100){
                totalHomensMaisCemKg++
            }
            if (peso > maiorPesoHomens ){
                maiorPesoHomens = peso
            }
        }
    }
    val mediaPesoMulheres = totalPesoMulheres / totalDeMulheres
    println("Quantas mulheres foram cadastradas? $totalDeMulheres ")
    println("Quantos homens pesam mais de 100Kg? $totalHomensMaisCemKg")
    println("A média de peso entre as mulheres? $mediaPesoMulheres")
    println("O maior peso entre os homens? $maiorPesoHomens")

}