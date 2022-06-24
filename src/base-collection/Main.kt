package `base-collection`

fun main(){
    val banco = BancoDeNomes()
    banco.salva("Gabriel")
    println(banco.nomes)
}