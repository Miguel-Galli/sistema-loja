package main

import main.dominio.Cliente
import main.dominio.NotaFiscal
import main.dominio.pedido.ItemPedido
import main.dominio.pedido.Pedido
import main.dominio.ProdutoFactory
import main.dominio.cartao.Bandeira
import main.dominio.cartao.Cartao
import main.dominio.pedido.Pagamento
import main.impressao.Epson
import main.operadora.Rede


fun main() {

    val camiseta = ProdutoFactory.create("Camiseta", 95.0)
    val calca = ProdutoFactory.create("Calça", 89.9)
    val meia = ProdutoFactory.create("Meia", "30.0")
    val tenis = ProdutoFactory.create("Tênis", 100)

    var joao = Cliente("João", "123.456.789-00")
    val pedido = Pedido(joao)

    val itemPedido_camiseta = ItemPedido(camiseta, 1)
    val itemPedido_calca = ItemPedido(calca, 1)
    val itemPedido_meia = ItemPedido(meia, 1)

    pedido.addProduto(itemPedido_camiseta)
    pedido.addProduto(itemPedido_calca)
    pedido.addProduto(itemPedido_meia)

    val cartaoJoao = Cartao("João da Siva", "32145678910", Bandeira.MARTERCARD)

    val operadora = Rede()
    val impressora = Epson()

    val pagamento = Pagamento(operadora, impressora)

    pagamento.fechaPedido(pedido, cartaoJoao, 1234)

    impressora.imprime(NotaFiscal(pedido))



}