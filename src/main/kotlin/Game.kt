class Game(
    private val numOfRounds: Int,
    private val playerOne: Player = RegularPlayer(),
    private val playerTwo: Player = RockPlayer(),
    private val printRoundResult: Boolean = false
) {
    var numOfCompletedRounds = 0
    var playerOneResultMessage = ""
    var playerTwoResultMessage = ""

    fun start() {
        println("Starting Rock, Paper and Scissors ($numOfRounds rounds)...")
        while (numOfCompletedRounds < numOfRounds) {
            val round = Round(playerOne, playerTwo, printRoundResult)
            round.start()
            numOfCompletedRounds++
        }
        buildAndPrintResults()
    }

    private fun buildAndPrintResults() {
        playerOneResultMessage = buildPlayerResultMessage(playerOne)
        playerTwoResultMessage = buildPlayerResultMessage(playerTwo)
        println(playerOneResultMessage)
        println(playerTwoResultMessage)
    }

    private fun buildPlayerResultMessage(player: Player): String =
        "Results for ${player.name}: WINS: ${player.wins}, LOSSES: ${player.losses}, DRAWS: ${player.draws}"
}