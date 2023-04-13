package com.arobotv.problems.p2401_p2500.p2404_most_frequent_even_element;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement {
    public int mostFrequentEven(int[] nums) {
        // 判断最频繁出现的偶数
        int[] count = new int[10001];
        int max = 0;
        int result = -1;
        for (int num : nums) {
            if (num % 2 == 0) {
                count[num]++;
                if (count[num] > max) {
                    max = count[num];
                    result = num;
                }
                // 当出现次数相同时，取最小值
                if (count[num] == max) {
                    result = Math.min(result, num);
                }
            }
        }
        return result;
    }

    //用hashmap实现
    public int mostFrequentEven2(int[] nums) {
        // 判断最频繁出现的偶数
        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int result = -1;
        for (int num : nums) {
            if (num % 2 == 0) {
                map.put(num, map.getOrDefault(num, 0) + 1);
                if (map.get(num) > max) {
                    max = map.get(num);
                    result = num;
                }
                // 当出现次数相同时，取最小值
                if (map.get(num) == max) {
                    result = Math.min(result, num);
                }
            }
        }
        return result;
    }
}
