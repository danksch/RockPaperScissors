import io.mockk.every
import io.mockk.spyk
import org.junit.Assert.assertEquals
import org.junit.Test

class RoundTest {
    @Test
    fun roundStart_determinesWinnerCorrectly() {
        val playerOne = spyk<RegularPlayer>()
        every { playerOne.act() } returns Action.PAPER
        val playerTwo = RockPlayer()
        val round = Round(playerOne, playerTwo)
        round.start()
        assertEquals(round.resultMessage, "Regular Player wins!")
    }

    @Test
    fun roundStart_determinesDrawCorrectly() {
        val playerOne = RockPlayer()
        val playerTwo = RockPlayer()
        val round = Round(playerOne, playerTwo)
        round.start()
        assertEquals(round.resultMessage, "Round ended in a draw!")
    }
}