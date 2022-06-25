package kotlinCollections.mapCollections

fun testaMapCollection(){
    val pedidos = mutableMapOf(
        Pair(1, "Produto Teste"),
        2 to "Produto Teste 2"
    )

    val pedido = pedidos[1]
    pedido?.let {
        println("Pedido: $it")
    }

    for (p in pedidos){
        println("Numero do pedido = ${p.key}")
        println("Valor do pedido = ${p.value}")
    }

    pedidos[3] = "drtdrt"
    pedidos.put(4, "TESTANDO")
    println(pedidos)
    pedidos[3] = "AAA"
    println(pedidos)
    pedidos.putIfAbsent(3, "GGGG")
    println(pedidos)

    pedidos.remove(1) // removeu
    pedidos.remove(2, "Produto") // nao removeu

}