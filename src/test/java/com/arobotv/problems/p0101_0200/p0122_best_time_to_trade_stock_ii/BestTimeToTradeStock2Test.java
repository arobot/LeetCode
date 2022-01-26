package com.arobotv.problems.p0101_0200.p0122_best_time_to_trade_stock_ii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToTradeStock2Test {
    static BestTimeToTradeStock2 bestTimeToTradeStock2 = new BestTimeToTradeStock2();

    @Test
    void testMaxProfit() {
        int[] prices = { 7, 1, 5, 3, 6, 4 };
        Assertions.assertEquals(7, bestTimeToTradeStock2.maxProfit(prices));
        Assertions.assertEquals(7, bestTimeToTradeStock2.maxProfit2(prices));
        Assertions.assertEquals(7, bestTimeToTradeStock2.maxProfit3(prices));
    }

    @Test
    void testMaxProfit2() {
        int[] prices = { 7, 1, 5, 3, 6, 7, 4 };
        Assertions.assertEquals(8, bestTimeToTradeStock2.maxProfit(prices));
        Assertions.assertEquals(8, bestTimeToTradeStock2.maxProfit2(prices));
        Assertions.assertEquals(8, bestTimeToTradeStock2.maxProfit3(prices));
    }

    @Test
    void testMaxProfit3() {
        int[] prices = { 1, 2, 3, 4, 5 };
        Assertions.assertEquals(4, bestTimeToTradeStock2.maxProfit(prices));
        Assertions.assertEquals(4, bestTimeToTradeStock2.maxProfit2(prices));
        Assertions.assertEquals(4, bestTimeToTradeStock2.maxProfit3(prices));
    }

    @Test
    void testMaxProfit4() {
        int[] prices = { 7, 6, 4, 3, 1 };
        Assertions.assertEquals(0, bestTimeToTradeStock2.maxProfit(prices));
        Assertions.assertEquals(0, bestTimeToTradeStock2.maxProfit2(prices));
        Assertions.assertEquals(0, bestTimeToTradeStock2.maxProfit3(prices));
    }

    @Test
    void testMaxProfit5() {
        int[] prices = { 7, 1, 5, 3, 6, 7, 4, 3, 3, 2, 1 };
        Assertions.assertEquals(8, bestTimeToTradeStock2.maxProfit(prices));
        Assertions.assertEquals(8, bestTimeToTradeStock2.maxProfit2(prices));
        Assertions.assertEquals(8, bestTimeToTradeStock2.maxProfit3(prices));
    }

    @Test
    void testMaxProfit6() {
        int[] prices = { 7 };
        Assertions.assertEquals(0, bestTimeToTradeStock2.maxProfit(prices));
        Assertions.assertEquals(0, bestTimeToTradeStock2.maxProfit2(prices));
    }

    @Test
    void testMaxProfit7() {
        int[] prices = { 7, 1, 5, 3, 6, 7, 4, 3, 3, 2, 1,3 };
        Assertions.assertEquals(10, bestTimeToTradeStock2.maxProfit(prices));
        Assertions.assertEquals(10, bestTimeToTradeStock2.maxProfit2(prices));
    }
}
