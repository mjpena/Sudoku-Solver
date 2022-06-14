import java.io.File

class TextFileParser(inputFile: String): PuzzleParser{
    private var fileLines: List<String> = listOf()

    init {
        fileLines = File(inputFile).readLines()
    }

    override fun getNumberOfSymbols(): Int {
        return fileLines[0].toInt()
    }

    override fun getValidSymbols(): List<String> {
        return fileLines[1].split(" ")
    }

    override fun getCellRows(): MutableList<String> {
        val cellRows: MutableList<String> = mutableListOf()
        for ((i, line) in fileLines.withIndex()){
            if (i < 2) continue
            cellRows.add(line)
        }
        return cellRows
    }
}