package com.arobotv.problems.p0001_p0100.p0038_count_and_say;

public class CountAndSay {
    public static String countAndSay(int n) {
        if (n == 1)
            return "1";
        else
            return say(countAndSay(n - 1));
    }

    static String say(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        char last = s.charAt(0);
        for (int i = 0; i < s.length(); i++) {
            if (last == s.charAt(i))
                count++;
            else {
                sb.append(count).append(last);
                last = s.charAt(i);
                count = 1;

            }
        }
        sb.append(count).append(last);
        return sb.toString();
    }

    public static void main(String[] args) {
        int i = 10;
        while (i-- > 1) {
            System.out.print(i + ":");
            System.out.println(countAndSay(i));
        }
    }
}
