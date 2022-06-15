class Cell(val row: CellContainer, val column: CellContainer, val block: CellContainer, value: String) {
    private var possibleSymbols: PossibleSymbols = PossibleSymbols()
    var value: String = ""
        private set

    init {
        if (possibleSymbols.containsSymbol(value)){
            possibleSymbols.setSolution(value)
        }
    }
}