package game

enum class Action {
    ROCK {
        override fun fights(other: Action) =
            when (other) {
                ROCK -> Result.DRAW
                PAPER -> Result.LOSS
                SCISSORS -> Result.WIN
            }
    },
    PAPER {
        override fun fights(other: Action) =
            when (other) {
                ROCK -> Result.WIN
                PAPER -> Result.DRAW
                SCISSORS -> Result.LOSS
            }
    },
    SCISSORS {
        override fun fights(other: Action) =
            when (other) {
                ROCK -> Result.LOSS
                PAPER -> Result.WIN
                SCISSORS -> Result.DRAW
            }
    };

    abstract fun fights(other: Action): Result
}