package com.arobotv.problems.p2401_p2500.p2427_number_of_common_factors;

public class NumberOfCommonFactors {
    public int commonFactors(int a, int b) {
        int count = 0;
        int gcd = gcd(a, b);
        for (int i = 1; i <= gcd; i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * 最大公约数
     * @param a
     * @param b
     * @return
     */
    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
