/** 87) Crie um programa que melhore o procedimento Gerador() da questão anterior
para que mostre uma mensagem personalizada, passada como parâmetro.
Ex: Ao chamar Gerador("Aprendendo Portugol") aparece:
+-------=======------+
Aprendendo Portugol
+-------=======------+ */

fun main() {
   gerador("Aprendendo Portugol")
}

fun gerador(mensagem: String) {
    println("+-------------+\n$mensagem\n+-------------+ ")
}