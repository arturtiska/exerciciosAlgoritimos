/** 50) Desenvolva um programa que faça o sorteio de 20 números entre 0 e 10 e
mostre na tela:
a) Quais foram os números sorteados
b) Quantos números estão acima de 5
c) Quantos números são divisíveis por 3 */

fun main(){

    var numerosAcimaDeCinco = 0
    var numerosDivisiveisPorTres = 0
    for (i in 0..19){
        val numero = (0..10).random()
        println("Os numeros sorteados foram: $numero")

        if (numero > 5){
            numerosAcimaDeCinco++
        }

        if (numero % 3 == 0){
            numerosDivisiveisPorTres++

        }
    }
     println("Existe $numerosAcimaDeCinco acima de 5")
    println("Existe $numerosDivisiveisPorTres divisiveis por 3")


}