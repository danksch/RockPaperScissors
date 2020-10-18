import game.Action
import game.RegularPlayer
import game.Result
import game.RockPlayer
import org.junit.Test
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue

class PlayerTest {
    @Test
    fun playerWinning_incrementsTotalWins() {
        val player = RegularPlayer()
        assertEquals(player.numOfWins, 0)
        player.evaluateResult(Result.WIN)
        assertEquals(player.numOfWins, 1)
    }

    @Test
    fun playerLosing_incrementsTotalLosses() {
        val player = RegularPlayer()
        assertEquals(player.numOfLosses, 0)
        player.evaluateResult(Result.LOSS)
        assertEquals(player.numOfLosses, 1)
    }

    @Test
    fun playerPlayingDraw_incrementsTotalDraw() {
        val player = RegularPlayer()
        assertEquals(player.numOfDraws, 0)
        player.evaluateResult(Result.DRAW)
        assertEquals(player.numOfDraws, 1)
    }

    @Test
    fun regularPlayer_whenPlaying_actsWithOneOfTheActions() {
        val player = RegularPlayer()
        val action = player.act()
        assertTrue(action in Action.values())
    }

    @Test
    fun rockPlayer_whenPlaying_actsWithRock() {
        val player = RockPlayer()
        val action = player.act()
        assertEquals(action, Action.ROCK)
    }
}