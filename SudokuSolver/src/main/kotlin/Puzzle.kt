class Puzzle(numberOfSymbols: Int, cells: MutableList<MutableList<String>>) {
    val rows: List<CellContainer> = List(ValidSymbolsSingleton.getSymbols().size) {CellContainer()}
    val columns: List<CellContainer> = List(ValidSymbolsSingleton.getSymbols().size) {CellContainer()}
    val blocks: List<CellContainer> = List(ValidSymbolsSingleton.getSymbols().size) {CellContainer()}
    private var invalidPuzzleMessage = ""

    init {
        validatePuzzle(numberOfSymbols)
        buildCells(cells)
    }

    private fun validatePuzzle(numberOfSymbols: Int){
        if (ValidSymbolsSingleton.numberOfSymbols != ValidSymbolsSingleton.getSymbols().distinct().size){
            invalidPuzzleMessage = ""
        }
        if (numberOfSymbols != ValidSymbolsSingleton.numberOfSymbols){
            invalidPuzzleMessage = ""
        }
    }

    private fun buildCells(cells: MutableList<MutableList<String>>){
        var currentRowContainer: CellContainer
        var rowContainerIterator: Iterator<CellContainer> = rows.iterator()
        for (row in cells){
            currentRowContainer = rowContainerIterator.next()
            var currentColumnContainer: CellContainer
            var columnContainerIterator: Iterator<CellContainer> = columns.iterator()
            for (cell in row){
                currentColumnContainer = columnContainerIterator.next()
                Cell(currentRowContainer, currentColumnContainer, )
            }
        }
    }

    private fun createCells(){

    }
}