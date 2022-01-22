package com.arobotv.problems.p0101_0200.p0204_count_primes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountPrimesTest {

    @Test
    void countPrimes(){
        CountPrimes countPrimes = new CountPrimes();
        Assertions.assertEquals(countPrimes(3), countPrimes.countPrimes(3));
        Assertions.assertEquals(countPrimes(2), countPrimes.countPrimes(2));
        Assertions.assertEquals(countPrimes(5), countPrimes.countPrimes(5));
        Assertions.assertEquals(countPrimes(15), countPrimes.countPrimes(15));
        Assertions.assertEquals(countPrimes(10000), countPrimes.countPrimes(10000));
        Assertions.assertEquals(countPrimes(100000), countPrimes.countPrimes(100000));
    }

    public static int countPrimes(int n) {
        switch (n) {
             case 0: return 0;
             case 1: return 0;
             case 2: return 0;
             case 3: return 1;
             case 4: return 2;
             case 5: return 2;
             case 6: return 3;
             case 7: return 3;
             case 8: return 4;
             case 9: return 4;
             case 10: return 4;
             case 11: return 4;
             case 12: return 5;
             case 13: return 5;
             case 14: return 6;
             case 15: return 6;
             case 10000: return 1229;
             case 100000: return 9592;
             case 499979: return 41537;
             case 999983: return 78497;
             case 1500000: return 114155;
             case 5000000: return 348513;
             default: return 114514;  // 只是为了防止编译错误 
         }
     }
 
}
