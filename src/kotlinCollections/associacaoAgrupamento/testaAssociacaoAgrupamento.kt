package kotlinCollections.associacaoAgrupamento

fun testaAssociacaoAgrupamento() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
        Pedido(5, 90.5)
    )
//    println("Não mapeados: $pedidos")

    val pedidosMapeados = pedidos.associateBy { pedido ->
        pedido.numero
    }
//    println("Mapeados Associate: $pedidosMapeados")

    val possuiFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor >= 60.0
    }
//    println("Possui frete gratis? $possuiFreteGratis")

    val apenasFreteGratis = possuiFreteGratis.filter { pedidos ->
        pedidos.value
    }
//    println("Apenas frete gratis filter: $apenasFreteGratis")

    val possuiFreteGratisGroup = pedidos.groupBy { pedido: Pedido ->
        pedido.valor >= 60.0
    }
//    println(possuiFreteGratisGroup)
//    println(possuiFreteGratisGroup[true])

    val nomes = listOf("Leo", "Bia", "Lia", "Ana", "Joao", "Amanda")
    println("Nomes: $nomes")
    val agenda = nomes.groupBy { nomes ->
        nomes.first()
    }
    println("Agenda agrupada por letra: $agenda")
    println("Nomes com a letra a: ${agenda['A']}")

}

data class Pedido(
    val numero: Int,
    val valor: Double
)