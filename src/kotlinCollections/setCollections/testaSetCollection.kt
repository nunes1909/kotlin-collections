package kotlinCollections.setCollections

fun testaSetCollection() {
    val assistiramAndroid = setOf("Gabriel", "Ana", "Maria", "Joao")
    val assistiramKotlin = setOf("Gabriel", "Lia", "Fran", "Joao")

    val assistiramAmbos: MutableSet<String> = mutableSetOf()

    assistiramAmbos.addAll(assistiramAndroid)
    assistiramAmbos.addAll(assistiramKotlin)
    assistiramAmbos.add("Gabriel")

    println(assistiramAmbos)
}