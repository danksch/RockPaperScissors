import RockPaperScissors.Action
import RockPaperScissors.RegularPlayer
import RockPaperScissors.RockPlayer
import RockPaperScissors.Round
import io.mockk.every
import io.mockk.spyk
import org.junit.Assert.assertEquals
import org.junit.Test

class RoundTest {
    @Test
    fun whenRoundEnds_withWin_resultMessageIsBuiltCorrectly() {
        val playerOne = spyk<RegularPlayer>()
        every { playerOne.act() } returns Action.PAPER
        val playerTwo = RockPlayer()
        val round = Round(playerOne, playerTwo)
        round.start()
        assertEquals(round.resultMessage, "Regular RockPaperScissors.Player wins!")
    }

    @Test
    fun whenRoundEnds_withDraw_resultMessageIsBuiltCorrectly() {
        val playerOne = RockPlayer()
        val playerTwo = RockPlayer()
        val round = Round(playerOne, playerTwo)
        round.start()
        assertEquals(round.resultMessage, "RockPaperScissors.Round ended in a draw!")
    }
}