package com.arobotv.problems.p0301_0400.p0322_coin_change;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CoinChangeTest {
    static CoinChange change = new CoinChange();
    @Test
    void testCoinChange() {
        Assertions.assertEquals(3, change.coinChange(new int[]{1,2,5}, 11));
    }
    @Test
    void testCoinChange2() {
        Assertions.assertEquals(3, change.coinChange(new int[]{1,2,5}, 11));
    }
}
