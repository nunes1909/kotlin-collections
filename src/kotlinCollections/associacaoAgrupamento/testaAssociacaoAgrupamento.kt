package kotlinCollections.associacaoAgrupamento

fun testaAssociacaoAgrupamento() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
        Pedido(5, 90.5)
    )
    println("Não mapeados: $pedidos")

    val pedidosMapeados = pedidos.associateBy { pedido ->
        pedido.numero
    }
    println("Mapeados Associate: $pedidosMapeados")

    val possuiFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor >= 60.0
    }
    val apenasFreteGratis = possuiFreteGratis.filter { pedidos ->
        pedidos.value
    }
    println("Possui frete gratis? $possuiFreteGratis")
    println("Apenas frete gratis: $apenasFreteGratis")
}

data class Pedido(
    val numero: Int,
    val valor: Double
)