package com.arobotv.problems.p1001_p1100.p1041_robot_bounded_in_circle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RobotBoundedInCircleTest {
    /*
     * 测试方法1
     * 输入：instructions = "GGLLGG"
     * 输出：true
     * 使用Assertions.assertTrue()方法判定
     */
    @Test
    public void test1() {
        String instructions = "GGLLGG";
        RobotBoundedInCircle robotBoundedInCircle = new RobotBoundedInCircle();
        boolean result = robotBoundedInCircle.isRobotBounded(instructions);
        Assertions.assertTrue(result);
    }

    /*
     * 测试方法2
     * 输入：instructions = "GG"
     * 输出：false
     * 使用Assertions.assertFalse()方法判定
     */
    @Test
    public void test2() {
        String instructions = "GG";
        RobotBoundedInCircle robotBoundedInCircle = new RobotBoundedInCircle();
        boolean result = robotBoundedInCircle.isRobotBounded(instructions);
        Assertions.assertFalse(result);
    }

    /*
     * 测试方法3
     * 输入：instructions = "GL"
     * 输出：true
     * 使用Assertions.assertTrue()方法判定
     */

    @Test
    public void test3() {
        String instructions = "GL";
        RobotBoundedInCircle robotBoundedInCircle = new RobotBoundedInCircle();
        boolean result = robotBoundedInCircle.isRobotBounded(instructions);
        Assertions.assertTrue(result);
    }
}
