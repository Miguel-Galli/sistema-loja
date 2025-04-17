package main.dominio

import main.dominio.contratos.Imprimivel
import main.dominio.pedido.Pedido

class NotaFiscal(private val pedido: Pedido) : Imprimivel {
    override fun obtemCabecalho(): String {
        return "Nota Fiscal Gaúcha"
    }

    override fun obtemCorpo(): String {
        return pedido.obtemCorpo()
    }

    override fun obtemRodaPe(): String {
        return "---------- Skate Shop Multimarcas ----------"
    }
}