package problems.p0201_0300.p0242_valid_anagram;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length())
            return false;
        if (s.equals(t))
            return true;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int n : arr) {
            if (n != 0)
                return false;
        }
        return true;
    }

    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length())
            return false;
        int a = 1, b = 1;
        for (int i = 0; i < s.length(); i++) {
            a *= (s.charAt(i) * 36 + 1);
            b *= (t.charAt(i) * 36 + 1);
        }
        return a == b;
    }

    public static void main(String[] args) {
        String s = "abc",t="cba";
        // String s = "abc",t="cbas";
        System.out.println(isAnagram2(s, t));

    }

}
