/** 10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.*/

fun main() {
    println("Qual e a altura?")
    var altura = readLine()!!.toFloat()
    while (altura <= 0) {
        println("A altura nao pode ser menor ou igual a zero. Qual e a altura?")
        altura = readLine()!!.toFloat()
    }

    println("Qual a largura?")
    var largura = readLine()!!.toFloat()
    while (largura <= 0) {
        println("A largura nao pode ser menor ou igual a zero. Qual a largura?")
        largura = readLine()!!.toFloat()
    }
    val areaPintada = altura * largura
    val lataTinta = areaPintada / 2
    println(
        "A area a ser pintada e: $areaPintada metros quadrado\ngastara " +
                "$lataTinta latas de tinta para pintar"
    )
}

