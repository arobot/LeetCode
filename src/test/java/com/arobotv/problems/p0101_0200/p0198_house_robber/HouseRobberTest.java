package com.arobotv.problems.p0101_0200.p0198_house_robber;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseRobberTest {

    @Test
    void testRob() {
        int[] houses = {1,2,3,1};
        Assertions.assertEquals(4, new HouseRobber().rob(houses));
        Assertions.assertEquals(4, new HouseRobber().rob2(houses));
     }

     @Test
     void testRob2() {
         int[] houses = {2,7,9,3,1};
         Assertions.assertEquals(12, new HouseRobber().rob(houses));
         Assertions.assertEquals(12, new HouseRobber().rob2(houses));
      }

      @Test
      void testRob3() {
          int[] houses = {2,7,9,3,1,2};
          Assertions.assertEquals(13, new HouseRobber().rob(houses));
          Assertions.assertEquals(13, new HouseRobber().rob2(houses));
       }
}
