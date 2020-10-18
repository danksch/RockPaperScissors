class Game(
    private val numOfRounds: Int,
    private val playerOne: Player = RegularPlayer(),
    private val playerTwo: Player = RockPlayer()
) {
    var numOfCompletedRounds = 0
    var playerOneResultMessage = ""
    var playerTwoResultMessage = ""

    fun start() {
        while (numOfCompletedRounds < numOfRounds) {
            val round = Round(playerOne, playerTwo)
            round.start()
            numOfCompletedRounds++
        }
        playerOneResultMessage = buildPlayerResultMessage(playerOne)
        playerTwoResultMessage = buildPlayerResultMessage(playerTwo)
    }

    private fun buildPlayerResultMessage(player: Player): String =
        "Results for ${player.name}: WINS: ${player.wins}, LOSSES: ${player.losses}, DRAWS: ${player.draws}"
}