import org.junit.Test
import kotlin.test.assertEquals
import org.junit.Assert.assertTrue

class PlayerTest {
    @Test
    fun playerWinning_incrementsTotalWins() {
        val player = RegularPlayer()
        assertEquals(player.wins, 0)
        player.evaluateResult(Result.WIN)
        assertEquals(player.wins, 1)
    }

    @Test
    fun playerLosing_incrementsTotalLosses() {
        val player = RegularPlayer()
        assertEquals(player.losses, 0)
        player.evaluateResult(Result.LOSS)
        assertEquals(player.losses, 1)
    }

    @Test
    fun playerPlayingDraw_incrementsTotalDraw() {
        val player = RegularPlayer()
        assertEquals(player.draws, 0)
        player.evaluateResult(Result.DRAW)
        assertEquals(player.draws, 1)
    }

    @Test
    fun regularPlayer_whenPlaying_actsRandomly() {
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