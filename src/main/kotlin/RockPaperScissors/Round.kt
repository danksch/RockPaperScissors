package RockPaperScissors

class Round(
    private val playerOne: Player,
    private val playerTwo: Player,
    private val printRoundResult: Boolean = false
) {
    var resultMessage: String = ""

    fun start() {
        val playerOneAction = playerOne.act()
        val playerTwoAction = playerTwo.act()
        val result = playerOneAction.fights(playerTwoAction)
        resultMessage = buildResultMessage(result)
        playerOne.evaluateResult(result)
        playerTwo.evaluateResult(playerTwoAction.fights(playerOneAction))
        if (printRoundResult) {
            println("$playerOneAction vs. $playerTwoAction: $resultMessage")
        }
    }

    private fun buildResultMessage(playerOneResult: Result): String =
        when (playerOneResult) {
            Result.WIN -> "${playerOne.name} wins!"
            Result.DRAW -> "RockPaperScissors.Round ended in a draw!"
            Result.LOSS -> "${playerTwo.name} wins!"
        }
}