abstract class Solvable(possibleSymbols: MutableList<String>) {
    open var possibleSymbols: MutableList<String> = possibleSymbols
    var isSolved: Boolean = false

    fun containsSymbol(symbol: String): Boolean{
        if (possibleSymbols.contains(symbol)) return true
        return false
    }

    fun removeSymbol(symbol: String){
        if (containsSymbol(symbol)) {
            possibleSymbols.remove(symbol)
        }
    }

    fun clearPossibleSymbols(){
        possibleSymbols.clear()
    }
}