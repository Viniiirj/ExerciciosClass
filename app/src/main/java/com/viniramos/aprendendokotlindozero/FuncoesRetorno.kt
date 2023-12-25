package com.viniramos.aprendendokotlindozero

class Usuario ( var nome: String, var sobrenome: String){

    init {
        println("Objeto inicializado $nome $sobrenome")
    }

    constructor(nome: String):this(nome, ""){
    println("Coe $nome")

    }
}
fun main(){
    var usuario = Usuario("Vinicius")

}
