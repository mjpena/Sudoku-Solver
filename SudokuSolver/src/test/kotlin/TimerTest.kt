import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import kotlin.math.absoluteValue

internal class TimerTest{
    @Test
    fun getElapsedTimeTimerNeverStarted(){
        val timer: Timer = Timer()
        assert(timer.getElapsedTime().toInt() == 0)
    }

    @Test
    fun getElapsedTimeNoEndTime(){
        val timer: Timer = Timer()
        timer.start()
        assert(timer.getElapsedTime().toInt() == 0)
    }

    @Test
    fun getElapsedTime(){
        val timer: Timer = Timer()
        timer.start()
        Thread.sleep(2000)
        timer.stop()
        val timeDifference = (timer.getElapsedTime() - 2000).absoluteValue
        assertTrue(timeDifference < 100)
    }
}