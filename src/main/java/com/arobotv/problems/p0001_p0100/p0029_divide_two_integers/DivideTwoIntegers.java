package com.arobotv.problems.p0001_p0100.p0029_divide_two_integers;

public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        // 边界条件
        if (divisor == 1)
            return dividend;
        if (divisor == -1) {
            if (dividend == Integer.MIN_VALUE)
                return Integer.MAX_VALUE;
            return -dividend;
        }

        boolean negative = (dividend >>> 31 ^ divisor >>> 31) == 1;
        dividend = -Math.abs(dividend);
        divisor = -Math.abs(divisor);
        int result = 0;
        int count = 1;
        int baseDivisor = divisor;
        while (dividend <= baseDivisor) {
            //通过被除数减半进行判断，防止超出Integer范围溢出
            //只能小于，右移时会丢失精度
            while ((dividend >> 1) < divisor) {
                count <<= 1;
                divisor <<= 1;
            }
            result += count;
            dividend -= divisor;
            count = 1;
            divisor = baseDivisor;
        }
        return negative ? -result : result;
    }
}
