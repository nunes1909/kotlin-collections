package kotlinCollections.tiposCollections

fun testaMutableCollection() {
    val banco = BancoDeNomes()
    val nomesSalvos: MutableCollection<String> =
        banco.nomes as MutableCollection<String>
//    nomesSalvos.add("Joao")

    banco.salva("Gabriel")
    banco.salva("Ana")
    println(nomesSalvos)
}