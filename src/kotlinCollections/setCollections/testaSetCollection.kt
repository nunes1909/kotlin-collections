package kotlinCollections.setCollections

fun testaSetCollection() {
    val assistiramAndroid = setOf("Gabriel", "Ana", "Maria", "Joao")
    val assistiramKotlin = setOf("Gabriel", "Lia", "Fran", "Joao")

    val assistiramAmbos: MutableSet<String> = mutableSetOf()

    println("Union: ${assistiramAndroid union assistiramKotlin}")
    println("Subtract: ${assistiramAndroid subtract assistiramKotlin}")
    println("Intersect: ${assistiramKotlin intersect assistiramAndroid}")

    assistiramAmbos.addAll(assistiramAndroid)
    assistiramAmbos.addAll(assistiramKotlin)

    /**
     * No exemplo abaixo não será possível manipular
     * a coleção assistiramAmbosList pois ela recebe um toSet().
     */

    val assistiramAmbosList = assistiramAmbos.toSet()
//    assistiramAmbosList.addAll()
}