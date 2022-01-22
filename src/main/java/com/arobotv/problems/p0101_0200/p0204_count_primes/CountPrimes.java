package com.arobotv.problems.p0101_0200.p0204_count_primes;

public class CountPrimes {
    public int countPrimes(int n) {
        boolean[] b = new boolean[n];
        int count = n > 2 ? 1 : 0;
        for (int i = 3; i < n; i += 2) {
            if (b[i] == true)
                continue;
            count++;
            for (int j = i * 2; j < n; j += i) {
                b[j] = true;
            }
        }
        return count;
    }
}
