package main

fun main() {

    val arroz = Produto("Arroz", 25.0.toBigDecimal())
    val feijao = Produto("Feijao", 7.0.toBigDecimal())
    var joao = Cliente("João", "123.456.789-00")
    val pedido = Pedido(joao)

    val itemPedido_arroz = ItemPedido(arroz, 1)
    val itemPedido_feijao = ItemPedido(feijao, 1)

    pedido.addProduto(itemPedido_arroz)
    pedido.addProduto(itemPedido_feijao)

    pedido.itens.forEach { item -> println(item.produto.nome) }

}