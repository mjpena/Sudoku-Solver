class Timer {
    private var startTime : Long? = null
    private var endTime : Long? = null

    fun getElapsedTime(): Long{
        if (startTime == null || endTime == null) return 0
        return endTime!! - startTime!!
    }

    fun start(){
        startTime = System.currentTimeMillis()
    }

    fun stop(){
        endTime = System.currentTimeMillis()
    }
}