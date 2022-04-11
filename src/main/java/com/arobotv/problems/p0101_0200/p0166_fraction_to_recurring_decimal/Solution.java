package com.arobotv.problems.p0101_0200.p0166_fraction_to_recurring_decimal;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0)
            return "0";
        boolean negative = (numerator >>> 31 ^ denominator >>> 31) == 1;
        long numer = numerator;
        long deno = denominator;
        StringBuilder sb = new StringBuilder();

        long quotient = numer / deno;
        if (negative && quotient == 0)
            sb.append("-");
        long mod = numer % deno;
        sb.append(quotient);
        if (mod != 0)
            sb.append(".");
        int pre = sb.length();
        int count = 0;
        mod = Math.abs(mod);
        deno = Math.abs(deno);
        Map<Long, Integer> modMap = new HashMap<>();
        while (mod != 0) {
            if (modMap.containsKey(mod)) {
                count = modMap.get(mod);
                return String.format("%s(%s)", sb.substring(0, pre + count), sb.substring(pre + count));
            }
            modMap.put(mod, count++);
            mod *= 10;
            sb.append(mod / deno);
            mod %= deno;
        }
        return sb.toString();
    }

    /*
     * 执行用时：3 ms, 在所有 Java 提交中击败了43.87%的用户
     * 内存消耗：38.7 MB, 在所有 Java 提交中击败了56.62%
     */
    public String fractionToDecimal2(int numerator, int denominator) {
        if (numerator == 0)
            return "0";
        boolean negative = (numerator >>> 31 ^ denominator >>> 31) == 1;
        numerator = -Math.abs(numerator);
        denominator = -Math.abs(denominator);
        StringBuilder sb = new StringBuilder();
        int quotient = numerator / denominator;
        long mod = numerator % denominator;
        if (negative)
            sb.append("-");
        if (quotient < 0)
            sb.append(String.valueOf(quotient).substring(1));
        else
            sb.append(quotient);
        if (mod != 0)
            sb.append(".");
        int pre = sb.length();
        int count = 0;
        Map<Long, Integer> modMap = new HashMap<>();
        while (mod != 0) {
            if (modMap.containsKey(mod)) {
                count = modMap.get(mod);
                return String.format("%s(%s)", sb.substring(0, pre + count), sb.substring(pre + count));
            }
            modMap.put(mod, count++);
            mod = -(Math.abs(mod) * 10);
            sb.append(mod / denominator);
            mod %= denominator;
        }
        return sb.toString();
    }
}
