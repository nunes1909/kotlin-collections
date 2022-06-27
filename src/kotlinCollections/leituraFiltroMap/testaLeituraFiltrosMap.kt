package kotlinCollections.leituraFiltroMap

fun testaLeituraFiltroMap() {
    val pedidos = mutableMapOf(
        Pair(1, "Produto Teste"),
        2 to "Produto Teste 2",
        4 to "Teste 4",
        5 to "Teste 5"
    )

//    val getPedido = pedidos.get(3)
//    println(getPedido)

//    val getValuePedido = pedidos.getValue(3)
//    println(getValuePedido)

//    val getOrElse = pedidos.getOrElse(0){
//        "Este produto não existe"
//    println(getOrElse)

//    val orDefault = pedidos.getOrDefault(0, "Não existe")
//    println(orDefault)

//    for (numero in pedidos.keys){
//        println("Pedido número: $numero")
//    }
//
//    for (valor in pedidos.values){
//        println("Valor do pedido: $valor")
//    }

//    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
//        numero % 2 == 0 && valor != ""
//    }
//    println(pedidosFiltrados)
//
//    val keysFiltradas = pedidos.filterKeys { key ->
//        key <= 2
//    }
//    println(keysFiltradas)
//
//    val valuesFiltrados = pedidos.filterValues { valor ->
//        valor != ""
//    }
//    println(valuesFiltrados)

//    val novosPedidos = pedidos + Pair(3, "Item 3")
//    println(novosPedidos)

//    val novosPedidos = pedidos + mapOf(4 to "Teste 4", 5 to "Teste 5")
//    println(novosPedidos)
//
//    println(novosPedidos - 1)
//    println(novosPedidos - listOf(1,2,3))

//    println(pedidos)
//    pedidos.putAll(setOf(4 to "Teste 4", 5 to "Teste 5"))
//    println(pedidos)

//    println(pedidos)
//    pedidos += (setOf(4 to "Teste 4", 5 to "Teste 5"))
//    println(pedidos)

    println(pedidos)
    pedidos.keys.remove(1)
    println(pedidos)

    pedidos.values.remove("Teste 5")
    println(pedidos)
}

