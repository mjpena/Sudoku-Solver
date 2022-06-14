interface PuzzleParser {
    fun getNumberOfSymbols(): Int
    fun getValidSymbols(): List<String>
    fun getCellRows(): List<String>
}