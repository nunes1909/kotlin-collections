package kotlinCollections.mapCollections

fun testaMapCollection(){
    val pedidos = mapOf(
        Pair(1, "Produto Teste"),
        2 to "Produto Teste 2"
    )

    val pedido = pedidos[1]
    pedido?.let {
        println("Pedido: $it")
    }

    for (pedido in pedidos){
        println("Numero do pedido = ${pedido.key}")
        println("Valor do pedido = ${pedido.value}")
    }
}