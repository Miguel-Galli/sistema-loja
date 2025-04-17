package main.dominio.pedido

import main.dominio.cartao.Cartao
import main.dominio.contratos.Impressora
import main.operadora.Operadora

class Pagamento (
    private val operadora: Operadora,
    private val impressora: Impressora
){
    fun fechaPedido(pedido: Pedido, cartao: Cartao, senha: Int){

        if (operadora.autoriza(cartao, senha, pedido.valorTotalPedido())){
            impressora.imprime(pedido)
        } else {
            println("Falha no pagamento")
        }

    }
}