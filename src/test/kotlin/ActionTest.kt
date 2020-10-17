import org.junit.Assert.assertEquals
import org.junit.Test

class ActionTest {
    @Test fun rockFightingRock_resultsInDraw() {
        assertEquals(Action.ROCK.fights(Action.ROCK), Result.DRAW)
    }
    @Test fun rockFightingPaper_resultsInLoss() {
        assertEquals(Action.ROCK.fights(Action.PAPER), Result.LOSS)
    }
    @Test fun rockFightingScissor_resultsInWin() {
        assertEquals(Action.ROCK.fights(Action.SCISSOR), Result.WIN)
    }

    @Test fun paperFightingRock_resultsInLoss() {
        assertEquals(Action.PAPER.fights(Action.ROCK), Result.WIN)
    }
    @Test fun paperFightingPaper_resultsInDraw() {
        assertEquals(Action.PAPER.fights(Action.PAPER), Result.DRAW)
    }
    @Test fun paperFightsScissor_resultsInWin() {
        assertEquals(Action.PAPER.fights(Action.SCISSOR), Result.LOSS)
    }

    @Test fun scissorFightsRock_resultsInLoss() {
        assertEquals(Action.SCISSOR.fights(Action.ROCK), Result.LOSS)
    }
    @Test fun scissorFightsPaper_resultsInWin() {
        assertEquals(Action.SCISSOR.fights(Action.PAPER), Result.WIN)
    }
    @Test fun scissorFightsScissor_resultsInDraw() {
        assertEquals(Action.SCISSOR.fights(Action.SCISSOR), Result.DRAW)
    }
}