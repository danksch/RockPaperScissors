import org.junit.Test
import org.junit.Assert.assertEquals

class GameTest {
    @Test
    fun whenGameFinishes_withOneHundredRounds_roundsCompletedAreSetCorrectly() {
        val game = Game(100)
        game.start()
        assertEquals(game.numOfCompletedRounds, 100)
    }

    @Test
    fun whenGameFinishes_withOnlyDraws_playerResultsAreSetCorrectly() {
        val game = Game(100, RockPlayer("Rock One"), RockPlayer("Rock Two"))
        game.start()
        assertEquals(game.playerOneResultMessage, "Results for Rock One: WINS: 0, LOSSES: 0, DRAWS: 100")
        assertEquals(game.playerTwoResultMessage, "Results for Rock Two: WINS: 0, LOSSES: 0, DRAWS: 100")
    }

}