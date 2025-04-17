package main

import main.dominio.Cliente
import main.dominio.NotaFiscal
import main.dominio.pedido.ItemPedido
import main.dominio.pedido.Pedido
import main.dominio.ProdutoFactory
import main.dominio.cartao.Bandeira
import main.dominio.cartao.Cartao
import main.dominio.pedido.Pagamento
import main.impressao.Hp
import main.operadora.Cielo


fun main() {

    val camiseta = ProdutoFactory.create("Camiseta", 95.0)
    val calca = ProdutoFactory.create("Calça", 89.9)
    val meia = ProdutoFactory.create("Meia", "30.0")
    val tenis = ProdutoFactory.create("Tênis", 100)

    var joao = Cliente("João", "123.456.789-00")
    val pedido = Pedido(joao)

    val itemPedido_arroz = ItemPedido(camiseta, 1)
    val itemPedido_feijao = ItemPedido(calca, 1)

    pedido.addProduto(itemPedido_arroz)
    pedido.addProduto(itemPedido_feijao)

    val cartaoJoao = Cartao("João da Siva", "12345678910", Bandeira.MARTERCARD)

    val operadora = Cielo()
    val impressora = Hp()

    val pagamento = Pagamento(operadora, impressora)

    pagamento.fechaPedido(pedido, cartaoJoao, 1234)

    impressora.imprime(NotaFiscal(pedido))



}