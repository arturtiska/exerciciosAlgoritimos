/** Melhore o exercício 96, criando além da função Media() uma outra função
chamada Situacao(), que vai retornar para o programa principal se o aluno está
APROVADO, em RECUPERAÇÃO ou REPROVADO. Essa nova função, vai receber como
parâmetro o resultado retornado pela função Media().*/

fun main() {

    println("Qual a primeira nota?")
    val primeiraNota = readLine()!!.toFloat()

    println("Qual a segunda nota?")
    val segundaNota = readLine()!!.toFloat()

    val result = media(primeiraNota, segundaNota)
    situacao(result)
}

fun media(a: Float, b: Float): Float {
    return (a + b) / 2
}

fun situacao(resultado: Float) {
    if (resultado < 7.5) {
        println("Voce esta reprovado")
    } else {
        println("voce esta aprovado")
    }
}