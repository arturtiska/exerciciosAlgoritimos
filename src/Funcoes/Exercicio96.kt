/** 96) Crie um programa que tenha uma função Media(), que vai receber as 2 notas de
um aluno e retornar a sua média para o programa principal.*/

fun main() {
    println("Qual a primeira nota?")
    var nota1 = readLine()!!.toInt()
    while (nota1 <= 0){
        println("segundo Numero nao pode ser menor que zero! Qual e o Numero?")
        nota1 = readLine()!!.toInt()
    }
    println("Qual  a segunda nota?")
    var nota2 = readLine()!!.toInt()
    while (nota2 <= 0){
        println("segundo Numero nao pode ser menor que zero! Qual e o Numero?")
        nota2 = readLine()!!.toInt()
    }
    val valor = media(nota1, nota2)
    println("%.2f".format(valor))
}
fun media(a: Int, b: Int) = (a + b) / 2


