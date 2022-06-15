object ValidSymbolsSingleton {
    private var symbols: List<String> = listOf()
    var numberOfSymbols: Int = 0
        private set

    fun getSymbols(validSymbols: List<String> = listOf()): List<String> {
        if (symbols.isEmpty()){
            symbols = validSymbols
            numberOfSymbols = symbols.size
        }
        return symbols
    }
}