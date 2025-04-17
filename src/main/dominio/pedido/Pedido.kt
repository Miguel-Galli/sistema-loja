package main.dominio.pedido

import main.dominio.Cliente
import main.dominio.contratos.Imprimivel
import main.extensoes.formataParaReal
import java.math.BigDecimal

class Pedido (val cliente: Cliente): Imprimivel {

    private val listaDeProdutos = mutableListOf<ItemPedido>()
    private var numeroPedido: Long = 0

    val itens
        get() = listaDeProdutos.toMutableList()

    init {
        numeroPedido = System.currentTimeMillis()
    }

    fun addProduto(itemPedido: ItemPedido) {
        listaDeProdutos.add(itemPedido)
    }

    override fun obtemCabecalho(): String {
        return "Pedidon Nº ${numeroPedido}"
    }

    override fun obtemCorpo(): String {

        val corpo = StringBuilder()

        listaDeProdutos.forEach { item ->
            corpo.append("${item.produto.nome}\n")
            corpo.append("${item.produto.preco.formataParaReal()} X ")
            corpo.append("${item.quantidade} = ${item.valorTotal().formataParaReal()}\n")
        }

        return corpo.toString()

    }

    override fun obtemRodaPe(): String {
        return "valor total do pedido ${this.valorTotalPedido().formataParaReal()}"
    }

    fun valorTotalPedido(): BigDecimal = listaDeProdutos.sumOf { it.valorTotal() }

}