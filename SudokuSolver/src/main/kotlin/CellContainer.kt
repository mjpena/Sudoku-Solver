class CellContainer {
    private val cells: MutableList<Cell> = mutableListOf()
    val solvedSymbols: PossibleSymbols = PossibleSymbols()
    val unsolvedSymbols: PossibleSymbols = PossibleSymbols()

    fun addCell(cell: Cell){
        if (unsolvedSymbols.containsSymbol(cell.value)){
            unsolvedSymbols.removeSymbol(cell.value)
        }
        cells.add(cell)
    }
}