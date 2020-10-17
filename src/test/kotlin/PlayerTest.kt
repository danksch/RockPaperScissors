import org.junit.Test
import kotlin.test.assertEquals

class PlayerTest {
    @Test
    fun playerWinning_incrementsTotalWins() {
        val player = Player()
        assertEquals(player.wins, 0)
        player.evaluateResult(Result.WIN)
        assertEquals(player.wins, 1)
    }

    @Test
    fun playerLosing_incrementsTotalLosses() {
        val player = Player()
        assertEquals(player.losses, 0)
        player.evaluateResult(Result.LOSS)
        assertEquals(player.losses, 1)
    }

    @Test
    fun playerPlayingDraw_incrementsTotalDraw() {
        val player = Player()
        assertEquals(player.draws, 0)
        player.evaluateResult(Result.DRAW)
        assertEquals(player.draws, 1)
    }
}