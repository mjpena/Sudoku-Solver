abstract class CellSolutionStrategy {
    val strategyStats: StrategyStats = StrategyStats()

    fun execute(puzzle: Puzzle): Boolean{
        strategyStats.startTimer()
        val applicableCells = findApplicableCells(puzzle)
        if (applicableCells.isNotEmpty()){

        }

        strategyStats.stopTimer()
    }

    abstract fun findApplicableCells(puzzle: Puzzle): List<Cell>
    abstract fun applyChanges()
}