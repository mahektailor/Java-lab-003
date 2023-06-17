package game

fun main() {
    val die = Die(Sides.TWENTY)
    print(die.sideUp)
    // die.sideUp = -100 // This code will not compile
}