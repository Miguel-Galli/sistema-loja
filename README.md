# 🛍️ Sistema de Loja – Modelagem com Kotlin

Este projeto foi desenvolvido como parte do bootcamp da DIO, com foco em **abstração de domínios usando orientação a objetos com Kotlin**. O sistema simula o fluxo de compra em uma loja, incluindo cadastro de produtos, pedidos, pagamento via cartão e emissão de nota fiscal.

## 🔧 Tecnologias e Práticas Utilizadas

- **Kotlin** – Linguagem principal da aplicação
- **Programação Orientada a Objetos (OOP)**  
- **Princípios SOLID**
- **Abstração e Encapsulamento**
- **Design com responsabilidade única**

## 📦 Funcionalidades

- Criação e cadastro de produtos
- Cadastro de cliente
- Composição de pedidos e itens
- Processamento de pagamento com simulação de operadora de cartão
- Impressão de nota fiscal via impressora simulada

## 🧩 Estrutura do Projeto

- `main.dominio` – Entidades centrais como `Cliente`, `Pedido`, `Produto`, `NotaFiscal`
- `main.dominio.cartao` – Modelos de cartão e enumeração de bandeiras
- `main.dominio.pedido` – Lógica de pedido, item e pagamento
- `main.operadora` – Simulações de operadoras de cartão (ex: Cielo, Rede)
- `main.impressao` – Impressoras simuladas (ex: Epson, HP)

## 🧪 Exemplo de Execução

```kotlin
val camiseta = ProdutoFactory.create("Camiseta", 95.0)
val cliente = Cliente("João", "123.456.789-00")
val pedido = Pedido(cliente)

pedido.addProduto(ItemPedido(camiseta, 1))

val cartao = Cartao("João da Silva", "32145678910", Bandeira.MASTERCARD)
val pagamento = Pagamento(Rede(), Epson())

pagamento.fechaPedido(pedido, cartao, 1234)
```

## 📄 Nota Fiscal

A nota fiscal é gerada após o pagamento e impressa via uma impressora simulada definida no código (HP ou Epson).
