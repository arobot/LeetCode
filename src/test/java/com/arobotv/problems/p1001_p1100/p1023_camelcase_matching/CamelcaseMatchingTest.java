package com.arobotv.problems.p1001_p1100.p1023_camelcase_matching;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CamelcaseMatchingTest {
    /*
     * 输入：queries =
     * ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern =
     * "FB"
     * 输出：[true,false,true,true,false]
     * 使用Assertions.assertArrayEquals()方法比较数组
     * 
     */
    @Test
    void testCamelMatch() {
        String[] queries = { "FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack" };
        String pattern = "FB";
        CamelcaseMatching camelcaseMatching = new CamelcaseMatching();
        List<Boolean> camelMatch = camelcaseMatching.camelMatch(queries, pattern);
        Assertions.assertArrayEquals(new Boolean[] { true, false, true, true, false }, camelMatch.toArray());
    }

    /*
     * 输入：queries =
     * ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern =
     * "FoBa"
     * 输出：[true,false,true,false,false]
     * 使用Assertions.assertArrayEquals()方法比较数组
     *
     */
    @Test
    void testCamelMatch2() {
        String[] queries = { "FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack" };
        String pattern = "FoBa";
        CamelcaseMatching camelcaseMatching = new CamelcaseMatching();
        List<Boolean> camelMatch = camelcaseMatching.camelMatch(queries, pattern);
        Assertions.assertArrayEquals(new Boolean[] { true, false, true, false, false }, camelMatch.toArray());
    }

    /*
     * 输入：queries =
     * ["FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"], pattern =
     * "FoBaT"
     * 输出：[false,true,false,false,false]
     * 使用Assertions.assertArrayEquals()方法比较数组
     */
    @Test
    void testCamelMatch3() {
        String[] queries = { "FooBar", "FooBarTest", "FootBall", "FrameBuffer", "ForceFeedBack" };
        String pattern = "FoBaT";
        CamelcaseMatching camelcaseMatching = new CamelcaseMatching();
        List<Boolean> camelMatch = camelcaseMatching.camelMatch(queries, pattern);
        Assertions.assertArrayEquals(new Boolean[] { false, true, false, false, false }, camelMatch.toArray());
    }
}
