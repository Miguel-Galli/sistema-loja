package main.operadora

import main.dominio.cartao.Cartao
import java.math.BigDecimal

class Rede : Operadora() {
    override val valorMaximoPermitido: BigDecimal
        get() = 2000.0.toBigDecimal()


    override fun validaCartao(cartao: Cartao, senha: Int): Boolean {
        return cartao.numero.startsWith("321") && senha == 1234
    }

}