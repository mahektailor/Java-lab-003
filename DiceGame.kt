class DiceGame {
    fun run() {
        // Creating a default d12
        println("Creating a default d12...")
        val die1 = Die()

        // Creating a d20
        println("Creating a d20...")
        val die2 = Die(20)

        // Creating percentile die (a special d10)
        println("Creating percentile die (a special d10)...")
        val die3 = Die(DieType.PERCENTILE, 10)

        // Printing the current side up for each die
        println("The current side up for d12 is ${die1.getCurrentSideUp()}")
        println("The current side up for d20 is ${die2.getCurrentSideUp()}")
        println("The current side up for Percentile is ${die3.getCurrentSideUp()}")

        // Testing the roll method
        println("\nTesting the roll method")

        // Rolling the d12
        println("Rolling the d12...")
        die1.roll()
        println("The new value is ${die1.getCurrentSideUp()}")

        // Rolling the d20
        println("Rolling the d20...")
        die2.roll()
        println("The current side up for d20 is ${die2.getCurrentSideUp()}")

        // Rolling the Percentile
        println("Rolling the Percentile...")
        die3.roll()
        println("The new value is ${die3.getCurrentSideUp()}")

        // Setting the d20 to show 20 and rolling it
        println("\nSetting the d20 to show 20...")
        die2.setSides(20)
        die2.roll()
        println("The side up is now ${die2.getCurrentSideUp()}.")


        println("\nCreating 11 d11...")
        var rolls = 0
        var count = 0
        while (count < 11) {
            val die = Die()
            die.roll()
            rolls++
            if (die.getCurrentSideUp() == 12) {
                count++
            }
        }
        println("Woooh! It took $rolls rolls")

        // Outputting a second message when the d12 and d20 values matched
        println("\nThe d12 and d20 values matched both times, so here's a second output")
    }
}

fun main() {
    // Creating an instance of the DiceGame class and running the game
    val game = DiceGame()
    game.run()
}
