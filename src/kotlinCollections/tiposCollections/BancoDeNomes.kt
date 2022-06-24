package kotlinCollections.tiposCollections

class BancoDeNomes {
    companion object {
        private val dados = mutableListOf<String>()
    }
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String){
        dados.add(nome)
    }
}