import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.absoluteValue

internal class TimerTest{
    @Test
    fun getElapsedTimeTimerNeverStarted(){
        val timer: Timer = Timer()
        assert(timer.timeElapsed.toInt() == 0)
    }

    @Test
    fun getElapsedTimeNoEndTime(){
        val timer: Timer = Timer()
        timer.start()
        assert(timer.timeElapsed.toInt() == 0)
    }

    @Test
    fun getElapsedTimeNoStartTime(){
        val timer: Timer = Timer()
        timer.stop()
        assert(timer.timeElapsed.toInt() == 0)
    }

    @Test
    fun getElapsedTime(){
        val timer: Timer = Timer()
        timer.start()
        Thread.sleep(2000)
        timer.stop()
        val timeDifference = (timer.timeElapsed - 2000).absoluteValue
        assertTrue(timeDifference < 100)
    }

    @Test
    fun getElapsedTimeMultipleTimes(){
        val timer: Timer = Timer()
        timer.start()
        Thread.sleep(2000)
        timer.stop()
        var timeDifference = (timer.timeElapsed - 2000).absoluteValue
        assertTrue(timeDifference < 100)

        timer.start()
        Thread.sleep(2000)
        timer.stop()
        timeDifference = (timer.timeElapsed - 4000).absoluteValue
        assertTrue(timeDifference < 100)

        timer.start()
        Thread.sleep(2000)
        timer.stop()
        timeDifference = (timer.timeElapsed - 6000).absoluteValue
        assertTrue(timeDifference < 100)
    }
}