package main.impressao

import main.dominio.contratos.Impressora
import main.dominio.contratos.Imprimivel

class Epson: Impressora {
    override fun imprime(imprimivel: Imprimivel) {

        println("*******EPSON*******")
        println(imprimivel.obtemCabecalho())
        println(imprimivel.obtemCorpo())
        println(imprimivel.obtemRodaPe())
    }
}