package main

class Pedido (val cliente: Cliente) {

    private val listaDeProdutos = mutableListOf<ItemPedido>()

    val itens
        get() = listaDeProdutos.toMutableList()

    fun addProduto(itemPedido: ItemPedido) {
        listaDeProdutos.add(itemPedido)
    }

}