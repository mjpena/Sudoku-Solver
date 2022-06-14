class Cell(val row: String, val column: String, val block: String, validSymbols: List<String>, val value: String = "") {
    private var possibleValues: MutableList<String> = validSymbols.toMutableList()
    var solution: String = ""
        private set

    init {
        if (validSymbols.contains(value)){
            solution = value
            possibleValues = mutableListOf(value)
        }
    }

    fun isPossibleValue(value: String): Boolean {
        if (possibleValues.contains(value)) return true
        return false
    }

    fun removePossibleValue(value: String){
        if (isPossibleValue(value)){
            possibleValues.remove(value)
        }

        if (possibleValues.size == 1){
            solution = possibleValues[0]
        }
    }
}