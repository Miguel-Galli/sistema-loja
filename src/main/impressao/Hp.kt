package main.impressao

import main.dominio.contratos.Impressora
import main.dominio.contratos.Imprimivel

class Hp : Impressora {
    override fun imprime(imprimivel: Imprimivel) {

        println("*******HP*******")
        println(imprimivel.obtemCabecalho())
        println(imprimivel.obtemCorpo())
        println(imprimivel.obtemRodaPe())
    }
}