class RockPlayer(override val name: String = "Rock Player") : Player(name) {
    override fun act(): Action = Action.ROCK
}