package game

class Game(
    private val numOfRounds: Int,
    private val playerOne: Player = RegularPlayer(),
    private val playerTwo: Player = RockPlayer(),
    private val printRoundResult: Boolean = false
) {
    var numOfCompletedRounds: Int = 0
    var playerOneResultMessage: String = ""
    var playerTwoResultMessage: String = ""

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
        "Results for ${player.name}: WINS: ${player.numOfWins}, LOSSES: ${player.numOfLosses}, DRAWS: ${player.numOfDraws}"
}