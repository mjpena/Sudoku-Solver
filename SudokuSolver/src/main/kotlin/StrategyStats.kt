class StrategyStats {
    private var timer: Timer = Timer()
    private var numberOfUses: Int = 0

    fun startTimer(){
        timer.start()
        numberOfUses++
    }

    fun stopTimer(){
        timer.stop()
    }

    fun getReport(strategy: String): String{
        return "$strategy $numberOfUses ${timer.timeElapsed}"
    }
}