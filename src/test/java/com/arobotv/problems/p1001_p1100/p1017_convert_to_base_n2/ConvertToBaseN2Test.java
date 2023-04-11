package com.arobotv.problems.p1001_p1100.p1017_convert_to_base_n2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ConvertToBaseN2Test {
    @Test
    void testBaseNeg2() {
        // 测试输入2，输出110，使用Assertions判定
        Assertions.assertEquals("110", new ConvertToBaseN2().baseNeg2(2));
    }

    @Test
    void testBaseNeg22() {
        // 测试输入3，输出111，使用Assertions判定
        Assertions.assertEquals("111", new ConvertToBaseN2().baseNeg2(3));
    }

    @Test
    void testBaseNeg23() {
        // 测试输入4，输出100，使用Assertions判定
        Assertions.assertEquals("100", new ConvertToBaseN2().baseNeg2(4));
    }
}
