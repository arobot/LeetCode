package problems.p0301_0400.p0344_reverse_string;

import utils.PrintUtils;

public class ReverseString {
    public static void reverseString(char[] s) {
        if (s == null || s.length == 0 || s.length == 1) {
            return;
        }
        int n = s.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }

    public static void main(String[] args) {
        // char[] s = { 'h', 'e', 'l', 'a', 'o', 'b' };
        char[] s = { 'h', 'e', 'l', 'a', 'o' };
        reverseString(s);
        PrintUtils.printArray(s);
    }
}
