/** 37) Uma empresa precisa reajustar o salário dos seus funcionários, dando um
aumento de acordo com alguns fatores. Faça um programa que leia o salário atual,
o gênero do funcionário e há quantos anos esse funcionário trabalha na empresa.
No final, mostre o seu novo salário, baseado na tabela a seguir:
- Mulheres
- menos de 15 anos de empresa: +5%
- de 15 até 20 anos de empresa: +12%
- mais de 20 anos de empresa: +23%
- Homens
- menos de 20 anos de empresa: +3%
- de 20 até 30 anos de empresa: +13%
- mais de 30 anos de empresa: +25% */

fun main() {
    println("Qual seu salario?")
    var salario = readLine()!!.toInt()
    while (salario <= 0) {
        println("O valor nao pode ser menor que zero. Qual e o seu salario?")
        salario = readLine()!!.toInt()
    }

    println("Qual seu sexo? Escolha 1 -> Masculino || 2 -> Feminino")
    var sexo = readLine()!!.toInt()
    while (sexo < 1 || sexo > 2) {
        println("Qual seu sexo? Escolha 1 -> Masculino || 2 -> Feminino")
        sexo = readLine()!!.toInt()
    }

    println("Quantos anos trabalha nessa empresa?")
    var idadeEmpresa = readLine()!!.toInt()
    while (idadeEmpresa <= 0) {
        println("O valor nao pode ser menor que zero. Quantos anos trabalha nessa empresa?")
        idadeEmpresa = readLine()!!.toInt()
    }
    val porcetagem = if (sexo == 2) {
        if (idadeEmpresa < 15) {
            0.05f
        } else if (idadeEmpresa <= 20) {
            0.12f
        } else {
            0.23f
        }
    } else {
        if (idadeEmpresa < 20) {
            0.03f
        } else if (idadeEmpresa <= 30) {
            0.13f
        } else {
            0.25f
        }
    }
    val valorReajuste = porcetagem * salario + salario
    println("seu novo salario e: $valorReajuste")
}
