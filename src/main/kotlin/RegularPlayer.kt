import kotlin.random.Random

class RegularPlayer : Player() {
    override fun act(): Action {
        val actions = Action.values()
        return actions[Random.nextInt(actions.size)]
    }
}