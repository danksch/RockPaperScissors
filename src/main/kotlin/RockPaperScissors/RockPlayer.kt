package RockPaperScissors

class RockPlayer(override val name: String = "Rock RockPaperScissors.Player") : Player(name) {
    override fun act(): Action = Action.ROCK
}