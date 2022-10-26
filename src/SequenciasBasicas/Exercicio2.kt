/**
2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas vindas para ela:
Ex:
Qual é o seu nome? João da Silva
Olá João da Silva, é um prazer te conhecer!
 */

fun main(){
   println("Qual seu nome?")
    val nome = readLine()!!.toString()
    println("Ola $nome, e um prazer te conhecer!")
}