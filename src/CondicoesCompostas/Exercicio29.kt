/** 29) Desenvolva um programa que leia o nome de um funcionário, seu salário,
quantos anos ele trabalha na empresa e mostre seu novo salário, reajustado de
acordo com a tabela a seguir:
- Até 3 anos de empresa: aumento de 3%
- entre 3 e 10 anos: aumento de 12.5%
- 10 anos ou mais: aumento de 20% */

fun main() {
    println("Qual seu nome?")
    val nome = readLine().toString()
    println("Qual seu salario?")
    var salario = readLine()!!.toFloat()
    while (salario < 0) {
        println("O valor nao pode ser menor que zero. Qual e o seu salario?")
        salario = readLine()!!.toFloat()
    }

    println("Quantos anos de empresa voce tem?")
    var idadeDeEmpresa = readLine()!!.toInt()
    while (idadeDeEmpresa < 0) {
        println("O valor nao pode ser menor que zer. Quantos anos de empresa voce tem?")
        idadeDeEmpresa = readLine()!!.toInt()
    }

    if (idadeDeEmpresa <= 3) {
        val aumentoTres = (salario * 0.03)  + salario
        println("$nome voce trabalha a $idadeDeEmpresa anos, agora seu  novo salario e $aumentoTres")
        val idadeDeEmpresa = readLine()!!.toInt()
    }
   else if (idadeDeEmpresa in 3..10) {
        val aumentoDez = (salario * 12.5) / 100 + salario
        println("$nome voce trabalha a $idadeDeEmpresa anos, agora seu  novo salario e $aumentoDez")
        val idadeDeEmpresa = readLine()!!.toInt()
    }
    if (idadeDeEmpresa >= 10) {
        val aumentoMaisDez = (salario * 20) / 100 + salario
        println("$nome voce trabalha a $idadeDeEmpresa anos, agora seu  novo salario e $aumentoMaisDez")
        val idadeDeEmpresa = readLine()!!.toInt()
    }
}