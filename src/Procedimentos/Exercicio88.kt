/**
 * 88) Crie um programa que melhore o procedimento Gerador() da questão anterior
para que mostre uma mensagem vário
Ex: Ao chamar Gerador("Aprendendo Portugol", 4) aparece:
+-------=======------+
Aprendendo Portugol
Aprendendo Portugol
Aprendendo Portugol
Aprendendo Portugol
+-------=======------+
 */
fun main() {
    gerador("Aprendendo Portugol", 4)
}
fun gerador(mensagem: String, quantidades: Int){
    var contador = 0
    println("+-------=======------+")
    while (contador < quantidades){
        contador += 1
        println(mensagem)
    }
    println("+-------=======------+")
}
