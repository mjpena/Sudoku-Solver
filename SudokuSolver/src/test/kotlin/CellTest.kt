import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CellTest {

    @Test
    fun isInitiallySolved() {
        val cell: Cell = Cell("1", "2", "3", listOf("1", "2", "3"), "3")
        assertTrue(cell.solution == "3")
        assertFalse(cell.isPossibleValue("1"))
        assertFalse(cell.isPossibleValue("2"))
        assertTrue(cell.isPossibleValue("3"))
    }

    @Test
    fun isNotInitiallySolved() {
        val cell: Cell = Cell("1", "2", "3", listOf("1", "2", "3"), "0")
        assertTrue(cell.solution == "")
        assertTrue(cell.isPossibleValue("1"))
        assertTrue(cell.isPossibleValue("2"))
        assertTrue(cell.isPossibleValue("3"))
    }

    @Test
    fun removePossibleValue(){
        val cell: Cell = Cell("1", "2", "3", listOf("1", "2", "3"), "0")
        assertTrue(cell.isPossibleValue("1"))
        cell.removePossibleValue("1")
        assertFalse(cell.isPossibleValue("1"))
    }

    @Test
    fun removePossibleValueNotValidValue(){
        val cell: Cell = Cell("1", "2", "3", listOf("1", "2", "3"), "0")
        cell.removePossibleValue("0")
        assertFalse(cell.isPossibleValue(""))
    }

    @Test
    fun removePossibleValueUntilSolved(){
        val cell: Cell = Cell("1", "2", "3", listOf("1", "2", "3"), "0")
        assertTrue(cell.solution == "")
        cell.removePossibleValue("1")
        cell.removePossibleValue("2")
        assertTrue(cell.solution == "3")
    }
}