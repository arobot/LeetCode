package com.arobotv.problems.p2401_p2500.p2413_smallest_even_multiple;

public class SmallestEvenMultiple {
    /*
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了82.59%的用户
     */
    public int smallestEvenMultiple(int n) {
        /*
         * 如果n是偶数，那么最小的偶数倍数就是n
         * 如果n是奇数，那么最小的偶数倍数就是n * 2
         */
        return n % 2 == 0 ? n : n * 2;
    }
}
