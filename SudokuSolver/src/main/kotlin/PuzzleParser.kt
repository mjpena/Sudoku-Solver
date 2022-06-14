interface FileParser {
    fun getNumberOfSymbols(): Int
    fun getValidSymbols(): List<String>
    fun getCellValues(): List<String>
}