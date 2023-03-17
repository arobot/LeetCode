package com.arobotv.problems.p0201_0300.p0202_happy_number;

import java.util.HashMap;

public class HappyNumber {
    private HashMap<Integer, Integer> squareMap = new HashMap<>();

    public boolean isHappy(int n) {
        if (n == 1)
            return true;
        if (squareMap.getOrDefault(n, 1) > 1)
            return false;
        int b = 0;
        while (n > 0) {
            int a = n % 10;
            b += a * a;
            n = n / 10;
        }
        squareMap.put(b, squareMap.getOrDefault(b, 0) + 1);
        return isHappy(b);
    }

    public boolean isHappy2(int n) {
        int slow = n;
        int fast = next(n);
        while (fast != 1 && slow != fast) {
            slow = next(slow);
            fast = next(next(fast));
        }
        return fast == 1;
    }

    public int next(int n) {
        int b = 0;
        while (n > 0) {
            int a = n % 10;
            b += a * a;
            n = n / 10;
        }
        return b;
    }
}
