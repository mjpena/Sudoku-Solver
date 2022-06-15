class PossibleSymbols {
    private var symbols: MutableList<String> = ValidSymbolsSingleton.getSymbols().toMutableList()

    fun containsSymbol(symbol: String): Boolean{
        if (symbols.contains(symbol)) return true
        return false
    }

    fun removeSymbol(symbol: String){
        if (containsSymbol(symbol)) {
            symbols.remove(symbol)
        }
    }

    fun setSolution(symbol: String){
        symbols = mutableListOf(symbol)
    }
}