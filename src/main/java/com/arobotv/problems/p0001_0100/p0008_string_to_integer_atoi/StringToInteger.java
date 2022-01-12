package com.arobotv.problems.p0001_0100.p0008_string_to_integer_atoi;

public class StringToInteger {
    public static int myAtoi(String s) {
        int num = 0;
        boolean negative = false;
        boolean flag = false;
        boolean trim = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (trim)
                    return (int) num;
                continue;
            } else
                trim = true;

            if (c == '-' || c == '+') {
                if (flag)
                    return (int) num;
                negative = c == '-';
                flag = true;
            }

            if (Character.isLetter(c) || c == '.')
                return (int) num;

            if (Character.isDigit(c)) {
                flag = true;
                int tmp = num;
                num = num * 10 + (negative ? 48 - c : c - 48);
                if (tmp != num / 10) {
                    return tmp > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
        }
        return (int) num;
    }

    public static void main(String[] args) {
        // String s = "42";
        // String s = "-42";
        // String s = ".-42";
        // String s = "-42 sdf";
        String s = "       4202397529129385720198129837109287509182750987203958723094857029387450923874509283750982730849572337509287350987230985791259218409239857293759278350928370598723987982134897192213908709870987109837911   . sdf";
        // String s = "+-12";
        // String s = "+1-2";
        // String s = "-123+321";
        // String s = " +0000 12";
        System.out.println(myAtoi(s));
    }
}
