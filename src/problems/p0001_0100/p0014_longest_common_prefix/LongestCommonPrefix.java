package problems.p0001_0100.p0014_longest_common_prefix;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0)
            return "";
        int i = 0;
        String prefix = strs[0];
        while (i < n - 1 && ((prefix = commonPrefix(prefix, strs[++i])) != "")) {
        }
        return prefix;
    }

    static String commonPrefix(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        if (aLen == 0 || bLen == 0)
            return "";
        int n = Math.min(aLen, bLen);
        char[] c = new char[n];
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == b.charAt(i))
                c[i] = a.charAt(i);
            else
                return new String(c, 0, i);
        }
        return new String(c, 0, n);
    }

    public static String longestCommonPrefix2(String[] strs) {
        int n = strs.length;
        if (n == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < n; i++) {
            while (strs[i].indexOf(prefix) != 0)
                prefix = prefix.substring(0, prefix.length() - 1);
        }
        return prefix;
    }

    public static void main(String[] args) {
        // String[] strs = { "flower", "flow", "flight" };
        // String[] strs = {""};
        // String[] strs = {};
        String[] strs = { "a" };
        System.out.println(longestCommonPrefix2(strs));
    }
}
