package com.arobotv.problems.p1001_p1100.p1041_robot_bounded_in_circle;

public class RobotBoundedInCircle {
    /*
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.5 MB, 在所有 Java 提交中击败了46.46%的用户
     */
    public boolean isRobotBounded(String instructions) {
        // 困在环中的机器人
        // 机器人的初始位置为(0, 0)，面向北方。机器人可以接受下列三条指令之一：
        // “G”：直走 1 个单位
        // “L”：左转 90 度
        // “R”：右转 90 度
        // 机器人按顺序执行指令 instructions，并一直重复它们。
        // 只有在平面中存在环使得机器人永远无法离开时，返回 true。否则，返回 false。
        int[][] directions = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int x = 0, y = 0, idx = 0;
        for (char ch : instructions.toCharArray()) {
            if (ch == 'L') {
                idx = (idx + 3) % 4;
            } else if (ch == 'R') {
                idx = (idx + 1) % 4;
            } else {
                x += directions[idx][0];
                y += directions[idx][1];
            }
        }
        return (x == 0 && y == 0) || idx != 0;
    }
}
