package com.arobotv.problems.p0101_0200.p0121_best_time_to_trade_stock;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BestTimeToTradeStockTest {
    static BestTimeToTradeStock stock = new BestTimeToTradeStock();
    @Test
    void testOne(){
        int[] prices = {7,1,5,3,6,4};
        Assertions.assertEquals(5, stock.maxProfit(prices));
    }

    @Test
    void testTwo(){
        int[] prices = {7,6,5,4,3,1};
        Assertions.assertEquals(0, stock.maxProfit(prices));
    }
}
