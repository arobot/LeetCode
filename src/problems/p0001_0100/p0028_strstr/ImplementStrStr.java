package problems.p0001_0100.p0028_strstr;

import utils.PrintUtils;

public class ImplementStrStr {
    public static int strStr(String haystack, String needle) {
        int cur = 0;
        int next = 0;
        if (needle.length() == 0)
            return 0;
        while (cur < haystack.length() && next < needle.length()) {
            if (haystack.charAt(cur) == needle.charAt(next)) {
                cur++;
                next++;
                if (next == needle.length())
                    return cur - next;
            } else {
                cur = cur - next + 1;
                next = 0;
            }
        }
        return -1;
    }

    public static int strStr2(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        int hLen = haystack.length(), nLen = needle.length();
        if (hLen < nLen)
            return -1;
        int[] prefixTable = prefixTable(needle);
        int i = 0, j = 0;
        while (nLen - j + i <= hLen) {
            while (j > -1 && nLen - j + i <= hLen) {
                if (haystack.charAt(i) == needle.charAt(j)) {
                    i++;
                    j++;
                    if (j == nLen)
                        return i - j;
                } else {
                    j = prefixTable[j];
                }
            }
            i++;
            j++;
        }
        return -1;
    }

    public static int[] prefixTable(String needle) {
        if (needle.length() == 0)
            return new int[-1];
        int[] pt = new int[needle.length()];
        pt[0] = -1;
        int suffix = 0;
        int prefix = -1;
        while (suffix < needle.length() - 1) {
            if (prefix == -1 || needle.charAt(suffix) == needle.charAt(prefix)) {
                pt[++suffix] = ++prefix;
            } else {
                prefix = pt[prefix];// ?退化的思路还不清楚
            }
        }
        return pt;
    }

    public static void main(String[] args) {
        // String haystack = "baababc", needle = "abc";
        // String haystack = "aaa", needle = "aaaa";
        // String haystack = "mississippi", needle = "issipi";
        String haystack = "mississippi", needle = "sippia";
        // String haystack = "aabbccdd", needle = "dddc";
        // String haystack = "a", needle = "";
        // String haystack = "ashdkajssdlkajsdglkasdgjals", needle = "sd";
        // String haystack = "a", needle = "a";
        // String haystack = "mississippi", needle = "mississippi";
        // String haystack = "aabaaabaaac", needle = "aabaaac";
        // String haystack = "adcadcaddcadde", needle = "adcadde";
        System.out.println(strStr2(haystack, needle));
        // PrintUtils.printArray(prefixTable(needle));
    }
}
