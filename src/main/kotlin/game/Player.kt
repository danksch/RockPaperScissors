package game

abstract class Player(open val name: String) {
    var numOfWins: Int = 0
    var numOfDraws: Int = 0
    var numOfLosses: Int = 0

    fun evaluateResult(result: Result) {
        when (result) {
            Result.WIN -> numOfWins++
            Result.DRAW -> numOfDraws++
            Result.LOSS -> numOfLosses++
        }
    }

    abstract fun act(): Action
}