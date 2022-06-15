import java.io.File
import kotlin.math.sqrt

class PuzzleParser() {
    private var fileLines: List<String> = listOf()

    private fun initializeValidSymbols() {
        ValidSymbolsSingleton.getSymbols(fileLines[1].split(" "))
    }

    private fun getNumberOfSymbols(): Int {
        return fileLines[0].toInt()
    }

    private fun getCells(): MutableList<MutableList<String>>{
        val cells: MutableList<MutableList<String>> = MutableList(ValidSymbolsSingleton.getSymbols().size) {MutableList(ValidSymbolsSingleton.getSymbols().size) {""} }
        for ((rowIndex, row) in fileLines.withIndex()){
            if (rowIndex < 2) continue
            for((columnIndex, cell) in row.withIndex()){
                cells[rowIndex][columnIndex] = cell.toString()
            }
        }
        return cells
    }

    fun buildPuzzle(inputFile: String, outputFile: String): Puzzle {
        fileLines = File(inputFile).readLines()
        initializeValidSymbols()
        return Puzzle(getNumberOfSymbols(), getCells())
    }
}