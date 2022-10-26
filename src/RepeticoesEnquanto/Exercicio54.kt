/** 54) Desenvolva um aplicativo que leia o peso e a altura de 7 pessoas, mostrando
no final:
a) Qual foi a média de altura do grupo
b) Quantas pessoas pesam mais de 90Kg
c) Quantas pessoas que pesam menos de 50Kg tem menos de 1.60m
d) Quantas pessoas que medem mais de 1.90m pesam mais de 100Kg. */

fun main() {
    var contador = 1
    var somaMedia = 0.0f
    var somaPeso = 0
    var somaMenos = 0
    var somarMaior = 0
    while (contador <= 7) {
        println("Qual e o $contador peso?")
        var peso = readLine()!!.toFloat()
        while (peso <= 0) {
            println("O peso nao pode ser menor que zero. Qual $contador peso?")
            peso = readLine()!!.toFloat()
        }
        println("val a altura?")
        var altura = readLine()!!.toFloat()
        while (altura <= 0) {
            println("A altura nao pode ser menor que zero. Qual $contador altura?")
            altura = readLine()!!.toFloat()
        }
        contador += 1
        somaMedia += altura
        if (peso > 90) {
            somaPeso += 1

            if (peso > 100 && altura > 1.90) {
                somarMaior += 1
            }
        } else if (peso < 50 && altura < 1.60) {
            somaMenos += 1
        }
    }
    val media = somaMedia / 7
    println("A altura media e de: $media")
    println("O numero de pessoas acima de 90kg e: $somaPeso")
    println("Existe $somaMenos pessoas com menos de 50 kg e menos de 1.60 de altura")
    println("Existe $somarMaior pessoas com mais de 100 kg e mais de 1.90 de altura")
}