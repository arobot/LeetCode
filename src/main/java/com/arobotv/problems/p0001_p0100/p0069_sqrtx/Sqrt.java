package com.arobotv.problems.p0001_p0100.p0069_sqrtx;

public class Sqrt {
    public int mySqrt(int x) {
        int min = 1, max = x;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (x / mid == mid)
                return mid;
            if (x / mid < mid)
                max = mid - 1;
            else
                min = mid + 1;

        }
        return max;
    }
}
