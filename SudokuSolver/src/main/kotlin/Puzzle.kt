import java.io.File
import kotlin.math.sqrt

class Puzzle(inputFile: String, outputFile: String) {
    var cells: List<List<Cell>> = listOf(listOf())
    var rows: List<CellContainer> = listOf()
    var columns: List<CellContainer> = listOf()
    var blocks: List<CellContainer> = listOf()
    var numberOfSymbols: Int = 0
    var validSymbols: List<String> = listOf()
    var invalidPuzzleMessage: String = ""

    init {
        parseInputFile(inputFile)
    }

    private fun parseInputFile(inputFile: String){
        val fileLines = File(inputFile).readLines()
        parseNumberOfSymbols(fileLines)
        parseValidSymbols(fileLines)
    }

    private fun parseNumberOfSymbols(fileLines: List<String>){
        numberOfSymbols = fileLines[0].toInt()
    }

    private fun parseValidSymbols(fileLines: List<String>){
        validSymbols = fileLines[1].split(" ")
    }

    private fun parseCells(fileLines: List<String>){
        for((i, line) in fileLines.withIndex()){
            val cellRow: MutableList<Cell> = mutableListOf()
            for(cell in line){
                cellRow.add(Cell(this, cell.toString()))
            }
        }
    }


   fun solve(){
        val puzzleTimer: Timer = Timer()

        puzzleTimer.start()
        while (true){

        }
        puzzleTimer.stop()
    }
}