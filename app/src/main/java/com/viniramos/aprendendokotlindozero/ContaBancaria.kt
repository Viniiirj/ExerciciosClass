package com.viniramos.aprendendokotlindozero

class ContaBancaria (var agencia: String, var conta: String, var senha: String) {
    var usuarioAutenticado: Boolean = false
    var saldo: Double = 0.0

    init {
        usuarioAutenticado = true
        println("Agendia: $agencia Conta: $conta Senha: $senha Autenticado: $usuarioAutenticado")
    }

    fun recuperarSaldo(): Double{
        if (usuarioAutenticado == true) {
            return saldo
        } else {
            return 0.0
        }
    }

    fun depositar(deposito: Double){
        saldo+= deposito
        println("Deposito no valor de R$$deposito")
    }

    fun sacar(valor:Double){
        if (saldo < valor) {
            println("Valor maior que o disponivel em conta")
        }else {
            saldo -= valor
            println("Saque de R$$valor")
        }
    }

    fun extrato(dias: Int){
        println("Extrato dos ultimos $dias dias")
        println("Saldo em conta R$$saldo")
    }

    fun extrato(dataInicial: String, dataFinal: String){
        println("Extrato intervalo $dataInicial - $dataFinal")
        println("Saldo em conta  R$$saldo")
    }
}

fun main() {
    var conta = ContaBancaria("3302", "19964403","125452154")
    var saldo = conta.recuperarSaldo()
    println(saldo)
    conta.depositar(200.0)
    conta.sacar(500.0)
    saldo = conta.recuperarSaldo()
    println(saldo)
    conta.extrato(5)
    conta.extrato("10/05/2022", "10/06/2022")

}