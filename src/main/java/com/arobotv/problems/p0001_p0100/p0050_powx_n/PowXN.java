package com.arobotv.problems.p0001_p0100.p0050_powx_n;

public class PowXN {
    public double myPow(double x, int n) {
        double result = recrusive(x, 1.0, n);
        return n > 0 ? result : 1 / result;
    }

    public double recrusive(double x, double result, int n) {
        if (n == 0)
            return result;
        if (n % 2 != 0)
            result *= x;
        return recrusive(x * x, result, n / 2);
    }
}
