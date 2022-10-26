/** 8) Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas.
Ex:
Digite uma distância em metros: 185.72
A distância de 85.7m corresponde a:
0.18572Km
1.8572Hm
18.572Dam */

fun main() {
    println("Qual a distancia em metros?")
    var distanciaMetros = readLine()!!.toFloat()
    while (distanciaMetros < 0) {
        println("A distancia nao pode ser menor que zero. Qual a distancia?")
        distanciaMetros = readLine()!!.toFloat()
    }

    val cm = distanciaMetros * 100
    val km = distanciaMetros * 0.001
    println(
        "A distancia de $distanciaMetros metros corresponde a:\n$cm cm \n" +
                "$km km"
    )
}

