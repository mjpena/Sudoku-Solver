import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class StrategyStatsTest{
    @Test
    fun numberOfUsersUpdates(){
        val strategyStats: StrategyStats = StrategyStats()
        strategyStats.startTimer()
        strategyStats.stopTimer()
        strategyStats.startTimer()
        strategyStats.stopTimer()
        strategyStats.startTimer()
        strategyStats.stopTimer()
        val timesUsed = strategyStats.getReport("testStrategy").split(" ")[1]
        assertEquals("3", timesUsed)
    }
}