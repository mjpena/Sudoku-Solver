import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.assertThrows

internal class TextFileParserTest {
    private val inputFile = ".\\src\\test\\puzzles\\puzzle.txt"
    private val inputFile2 = ".\\src\\test\\puzzles\\puzzle2.txt"
    private val textFileParser: TextFileParser = TextFileParser(inputFile)
    private val textFileParser2: TextFileParser = TextFileParser(inputFile2)

    @Test
    fun getNumberOfSymbols() {
        val numberOfSymbols = textFileParser.getNumberOfSymbols()
        assertEquals(4, numberOfSymbols)
    }

    @Test
    fun getNumberOfSymbolsNotAnInt() {
        assertThrows<Exception>{
            val numberOfSymbols = textFileParser2.getNumberOfSymbols()
        }
    }

    @Test
    fun getValidSymbols() {
        val validSymbols = textFileParser.getValidSymbols()
        val targetValidSymbols = listOf<String>("1", "2", "3", "4")
        assertEquals(targetValidSymbols, validSymbols)
    }

    @Test
    fun getCellValues() {
        val cellValues = textFileParser.getCellRows()
        val targetValidSymbols = listOf<String>("2 - 3 1", "1 3 - 4", "3 1 4 -", "- 2 1 2")
        assertEquals(targetValidSymbols, targetValidSymbols)
    }
}