package game

enum class Action {
    ROCK {
        override fun fights(other: Action) =
            when (other) {
                ROCK -> Result.DRAW
                PAPER -> Result.LOSS
                SCISSOR -> Result.WIN
            }
    },
    PAPER {
        override fun fights(other: Action) =
            when (other) {
                ROCK -> Result.WIN
                PAPER -> Result.DRAW
                SCISSOR -> Result.LOSS
            }
    },
    SCISSOR {
        override fun fights(other: Action) =
            when (other) {
                ROCK -> Result.LOSS
                PAPER -> Result.WIN
                SCISSOR -> Result.DRAW
            }
    };

    abstract fun fights(other: Action): Result
}