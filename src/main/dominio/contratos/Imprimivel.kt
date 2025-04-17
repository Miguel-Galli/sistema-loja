package main.dominio.contratos

interface Imprimivel {
    fun obtemCabecalho() : String
    fun obtemCorpo() : String
    fun obtemRodaPe() : String
}