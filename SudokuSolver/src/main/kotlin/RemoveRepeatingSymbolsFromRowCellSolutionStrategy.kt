class RemoveRepeatingSymbolsFromRowCellSolutionStrategy: CellSolutionStrategy {
    override fun findApplicableCells(puzzle: Puzzle): List<Cell> {
        val rows: List<CellContainer> = puzzle.rows
        for (row in rows){
            for (cell in row.cells){
                if(cell.value)
            }
        }
    }

    override fun applyChanges() {
        TODO("Not yet implemented")
    }
}