class Cell(puzzle: Puzzle, value: String): Solvable(puzzle) {
    override var possibleSymbols: MutableList<String> = puzzle.validSymbols.toMutableList()
    var value: String = ""
        private set

    init {
        if (possibleSymbols.contains(value)){
            possibleSymbols.
        }
    }

    fun addRow(row: CellContainer){

    }

    fun addColumn(column: CellContainer){

    }

    fun addBlock(block: CellContainer){

    }
}