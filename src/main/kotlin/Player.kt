class Player {
    var wins = 0
    var draws = 0
    var losses = 0

    fun evaluateResult(result: Result) {
        when (result) {
            Result.WIN -> wins++
            Result.DRAW -> draws++
            Result.LOSS -> losses++
        }
    }
}