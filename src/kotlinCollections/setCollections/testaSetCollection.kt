package kotlinCollections.setCollections

fun testaSetCollection() {
    val assistiramAndroid = listOf("Gabriel", "Ana", "Maria", "Joao")
    val assistiramKotlin = listOf("Gabriel", "Lia", "Fran", "Joao")
    val assistiramAmbos = assistiramAndroid + assistiramKotlin
    println(assistiramAmbos.distinct())
}