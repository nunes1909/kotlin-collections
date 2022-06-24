package `base-collection`

class BancoDeNomes {
    companion object {
        private val dados = mutableListOf<String>()
    }
    val nomes: Collection<String> get() = dados

    fun salva(nome: String){
        dados.add(nome)
    }
}