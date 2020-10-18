class Round(private val playerOne: Player, private val playerTwo: Player) {
    var resultMessage: String = ""

    fun start() {
        val playerOneAction = playerOne.act()
        val playerTwoAction = playerTwo.act()
        val result = playerOneAction.fights(playerTwoAction)
        resultMessage = createResultMessage(result)
        playerOne.evaluateResult(result)
        playerTwo.evaluateResult(playerTwoAction.fights(playerOneAction))
    }

    private fun createResultMessage(playerOneResult: Result): String =
        when (playerOneResult) {
            Result.WIN -> "${playerOne.name} wins!"
            Result.DRAW -> "Round ended in a draw!"
            Result.LOSS -> "${playerTwo.name} wins!"
        }
}