import game.Action
import game.RegularPlayer
import game.RockPlayer
import game.Round
import io.mockk.every
import io.mockk.spyk
import org.junit.Assert.assertEquals
import org.junit.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream

class RoundTest {
    @Test
    fun whenRoundEnds_withWin_resultMessageIsBuiltCorrectly() {
        val playerOne = spyk<RegularPlayer>()
        every { playerOne.act() } returns Action.PAPER
        val playerTwo = RockPlayer()
        val round = Round(playerOne, playerTwo)
        round.start()
        assertEquals(round.resultMessage, "Regular Player wins!")
    }

    @Test
    fun whenRoundEnds_withDraw_resultMessageIsBuiltCorrectly() {
        val playerOne = RockPlayer()
        val playerTwo = RockPlayer()
        val round = Round(playerOne, playerTwo)
        round.start()
        assertEquals(round.resultMessage, "Round ended in a draw!")
    }

    @Test
    fun whenRoundEnds_withPlayerTwoWinning_resultMessageIsBuiltCorrectly() {
        val playerOne = spyk<RegularPlayer>()
        every { playerOne.act() } returns Action.SCISSORS
        val playerTwo = RockPlayer()
        val round = Round(playerOne, playerTwo)
        round.start()
        assertEquals(round.resultMessage, "Rock Player wins!")
    }

    @Test
    fun whenRoundEnds_andPrintRoundResultIsTrue_resultMessageIsPrinted() {
        val playerOne = RockPlayer()
        val playerTwo = RockPlayer()
        val round = Round(playerOne, playerTwo, true)
        val stream = ByteArrayOutputStream()
        System.setOut(PrintStream(stream))
        round.start()
        assertEquals(stream.toString().trim(), "ROCK vs. ROCK: Round ended in a draw!")
    }
}