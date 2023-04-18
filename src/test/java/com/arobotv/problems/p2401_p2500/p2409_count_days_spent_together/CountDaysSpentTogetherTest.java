package com.arobotv.problems.p2401_p2500.p2409_count_days_spent_together;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountDaysSpentTogetherTest {
    /*
     * 输入：arriveAlice = "06-29", leaveAlice = "06-30", arriveBob = "06-29", leaveBob
     * = "06-30"
     * 输出：2
     * 使用Assertions.assertEquals做断言
     */
    @Test
    void testCountDaysTogether() {
        CountDaysSpentTogether countDaysSpentTogether = new CountDaysSpentTogether();
        int days = countDaysSpentTogether.countDaysTogether("06-29", "06-30", "06-29", "06-30");
        Assertions.assertEquals(2, days);
    }

    /*
     * 输入：arriveAlice = "08-15", leaveAlice = "08-18", arriveBob = "08-16", leaveBob
     * = "08-19"
     * 输出：3
     * 使用Assertions.assertEquals做断言
     */
    @Test
    void testCountDaysTogether2() {
        CountDaysSpentTogether countDaysSpentTogether = new CountDaysSpentTogether();
        int days = countDaysSpentTogether.countDaysTogether("08-15", "08-18", "08-16", "08-19");
        Assertions.assertEquals(3, days);
    }

    /*
     * 输入：arriveAlice = "10-01", leaveAlice = "10-31", arriveBob = "11-01", leaveBob
     * = "12-31"
     * 输出：0
     * 使用Assertions.assertEquals做断言
     */

    @Test
    void testCountDaysTogether3() {
        CountDaysSpentTogether countDaysSpentTogether = new CountDaysSpentTogether();
        int days = countDaysSpentTogether.countDaysTogether("10-01", "10-31", "11-01", "12-31");
        Assertions.assertEquals(0, days);
    }
}
