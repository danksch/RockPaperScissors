abstract class Player(open val name: String) {
    var wins: Int = 0
    var draws: Int = 0
    var losses: Int = 0

    fun evaluateResult(result: Result) {
        when (result) {
            Result.WIN -> wins++
            Result.DRAW -> draws++
            Result.LOSS -> losses++
        }
    }

    abstract fun act(): Action
}