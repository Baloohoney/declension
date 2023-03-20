fun main() {
    val likes: Int = 151
    val declension1 = "людям"
    val declension2 = "человеку"

    var ending =
        if (likes != 11 && likes % 10 == 1) {
            declension2
        } else declension1
    val phrase = "Понравилось $likes $ending"
    println(phrase)
}