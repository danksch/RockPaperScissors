import io.mockk.every
import io.mockk.mockk
import org.junit.Assert.assertEquals
import org.junit.Test


class RoundTest {
    //@Test
    fun roundStart_determinesWinnerCorrectly() {
        val playerOneMock = mockk<RegularPlayer>()
        every { playerOneMock.act() } returns Action.PAPER
        val playerTwo = RockPlayer()
        val round = Round(playerOneMock, playerTwo)
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