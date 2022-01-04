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
        if (haystack.length() < needle.length())
            return -1;
        int[] prefixTable = prefixTable(needle);
        int i = 0, j = 0;
        while (i <= haystack.length() - needle.length() && j < needle.length()) {
            do {
                if (haystack.charAt(i) == needle.charAt(j)) {
                    i++;
                    j++;
                    if (j == needle.length())
                        return i - j;
                    if (i == haystack.length())
                        return -1;
                } else {
                    j = prefixTable[j];
                }
            } while (j >= 0);
            i++;
            j = 0;
        }
        return -1;
    }

    public static int[] prefixTable(String needle) {
        if (needle.length() == 0)
            return new int[] { -1 };
        int[] pt = new int[needle.length()];
        pt[0] = -1;
        for (int i = 1; i < needle.length() - 1; i++) {
            if (needle.charAt(pt[i]) == needle.charAt(i))
                pt[i + 1] = pt[i] + 1;
            else if (pt[i] > 0 && needle.charAt(pt[i] - 1) == needle.charAt(i)) {
                int j = pt[i] - 1;
                int k = i;
                while (j >= 0) {
                    if (needle.charAt(j) == needle.charAt(k)) {
                        j--;
                        k--;
                    } else {
                        break;
                    }
                }
                pt[i + 1] = j == -1 ? pt[i] : 0;
            } else
                pt[i + 1] = 0;
        }
        return pt;
    }

    public static void main(String[] args) {
        // String haystack = "baababc", needle = "abc";
        // String haystack = "aaa", needle = "aaaa";
        // String haystack = "mississippi", needle = "issipi";
        // String haystack = "mississippi", needle = "sippia";
        // String haystack = "aabbccdd", needle = "dddc";
        // String haystack = "a", needle = "";
        // String haystack = "ashdkajssdlkajsdglkasdgjals", needle = "sd";
        // String haystack = "a", needle = "a";
        String haystack = "mississippi", needle = "mississippi";
        // String haystack = "aabaaabaaac", needle = "aabaaac";
        // String haystack = "adcadcaddcadde", needle = "adcadde";
        System.out.println(strStr2(haystack, needle));
        // PrintUtils.printArray(prefixTable(needle));
    }
}
