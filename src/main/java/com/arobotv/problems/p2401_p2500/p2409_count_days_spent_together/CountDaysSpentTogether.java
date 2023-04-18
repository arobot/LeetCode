package com.arobotv.problems.p2401_p2500.p2409_count_days_spent_together;

public class CountDaysSpentTogether {
    private static final int[] DAYS_OF_MONTH = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    /*
     * 执行用时：1 ms, 在所有 Java 提交中击败了54.39%的用户
     * 内存消耗：39.3 MB, 在所有 Java 提交中击败了80.70%的用户
     */
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int daysOfAliceArrive = daysOfBegin(arriveAlice);
        int daysOfAliceLeave = daysOfBegin(leaveAlice);
        int daysOfBobArrive = daysOfBegin(arriveBob);
        int daysOfBobLeave = daysOfBegin(leaveBob);
        // 计算出两个人在一起的天数
        int days = Math.min(daysOfAliceLeave, daysOfBobLeave) - Math.max(daysOfAliceArrive, daysOfBobArrive);
        return days >= 0 ? days + 1 : 0;
    }

    public int daysOfBegin(String date) {
        String[] split = date.split("-");
        int month = Integer.parseInt(split[0]);
        int day = Integer.parseInt(split[1]);
        int days = 0;
        // 根据上方DAYS_OF_MONTH数组，计算出当前月份之前的天数
        for (int i = 0; i < month - 1; i++) {
            days += DAYS_OF_MONTH[i];
        }
        return days + day;
    }
}
