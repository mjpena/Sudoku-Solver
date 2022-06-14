class Timer {
    var timeElapsed: Long = 0
        private set
    private var startTime: Long = 0
    private var endTime: Long = 0

    fun start(){
        startTime = System.currentTimeMillis()
    }

    fun stop(){
        if (startTime.toInt() == 0) return
        endTime = System.currentTimeMillis()
        reset()
    }

    private fun reset(){
        timeElapsed += (endTime - startTime)
        startTime = 0
        endTime = 0
    }
}