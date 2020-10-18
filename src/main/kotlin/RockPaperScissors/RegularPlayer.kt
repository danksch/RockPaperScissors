package RockPaperScissors

import kotlin.random.Random

class RegularPlayer(override val name: String = "Regular RockPaperScissors.Player") : Player(name) {
    override fun act(): Action {
        val actions = Action.values()
        return actions[Random.nextInt(actions.size)]
    }
}