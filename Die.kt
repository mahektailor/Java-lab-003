import kotlin.random.Random

enum class DieType {
    D12, D20, PERCENTILE
}

class Die {
    private var type: DieType = DieType.D12
    private var sides: Int = 12
    private var currentSideUp: Int = 1

    // Default constructor for Die
    constructor() {
        roll()
    }

    // Constructor for Die with specified number of sides
    constructor(sides: Int) {
        this.sides = sides
        roll()
    }

    // Constructor for Die with specified type and number of sides
    constructor(type: DieType, sides: Int) {
        this.type = type
        this.sides = sides
        roll()
    }

    // Returns the type of the die
    fun getType(): DieType {
        return type
    }

    // Sets the type of the die
    fun setType(type: DieType) {
        this.type = type
    }

    // Returns the number of sides of the die
    fun getSides(): Int {
        return sides
    }

    // Sets the number of sides of the die and rolls it
    fun setSides(sides: Int) {
        this.sides = sides
        roll()
    }

    // Returns the current side facing up on the die
    fun getCurrentSideUp(): Int {
        return currentSideUp
    }

    // Rolls the die by generating a random number between 1 and the number of sides
    fun roll() {
        currentSideUp = Random.nextInt(1, sides + 1)
    }
}
