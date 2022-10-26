/** 57) Desenvolva um aplicativo que leia o salário e o sexo de vários funcionários.
No final, mostre o total de salários pagos aos homens e o total pago às
mulheres. O programa vai perguntar ao usuário se ele quer continuar ou não
sempre que ler os dados de um funcionário. */

fun main() {
    var somaSalarioMasculino = 0.0f
    var somaSalarioFeminino = 0.0f
    var sair = 0

    while (sair != 1) {

        println("Qual seu sexo? Digite 1 -> masculino || 2 -> feminino")
         val sexo = readLine()!!.toInt()

        println("Qual e o salario?")

        if (sexo == 1) {
            somaSalarioMasculino += readLine()!!.toFloat()
        } else {
            somaSalarioFeminino += readLine()!!.toFloat()
        }

        println("Deseja encerrar? Digite 1 -> Sim || 2 -> Nao")
        sair = readLine()!!.toInt()
    }

    println("O total de salarios pagos as homens e de: $somaSalarioMasculino")
    println("O total de salarios pagos as mulheres e de: $somaSalarioFeminino")

}


