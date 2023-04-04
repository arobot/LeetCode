package com.arobotv.problems.p0001_p0100.p0007_reverse_integer;

public class ReverseInteger {
    public static int reverse(int x) {
        boolean negative = x < 0;
        String s = String.valueOf(x);
        char[] c = new char[s.length()];
        for (int i = s.length() - 1; i >= 0; i--) {
            c[s.length() - 1 - i] = s.charAt(i);
        }
        s = String.copyValueOf(c, 0, negative ? c.length - 1 : c.length);
        try {
            x = Integer.valueOf(s);
        } catch (NumberFormatException e) {
            return 0;
        }
        return negative ? -x : x;
    }

    public static int reverse2(int x) {
        boolean negative = x < 0;
        String s = String.valueOf(x);
        char[] c = s.toCharArray();
        int n = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (negative && i == 0)
                break;
            if (i == 9 && ((int) c[i] - 48) > 2)
                return 0;
            n += ((int) c[i] - 48) * ((int) Math.pow(10, negative ? i - 1 : i));
            if (n < 0)
                return 0;
        }
        return negative ? -n : n;
    }

    public static int reverse3(int x) {
        int r = 0;
        while (x != 0) {
            //暂存当前值，后续比较使用
            int tmp = r;
            //先进位再取mod
            r = r * 10 + x % 10;
            //舍去末尾
            x /= 10;
            //一旦溢出之后，将不再与原数相等。证明？
            if (r / 10 != tmp)
                return 0;
        }
        return r;
    }

    public static void main(String[] args) {
        // int x = 12345;
        int x = -12345;
        // int x = Integer.MIN_VALUE;
        // int x = 1111118412;
        // int x = 1534236469;
        System.out.println(reverse3(x));
    }
}