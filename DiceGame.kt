package game

fun main() {
    print("Creating a default Die\n")
    val die1 = Die(Sides.TWENTY)
    println(die1.sideUp)
    val die2 =Die(Sides.SIX)
    println(die2.sideUp)
    // die.sideUp = -100 // This code will not compile
}