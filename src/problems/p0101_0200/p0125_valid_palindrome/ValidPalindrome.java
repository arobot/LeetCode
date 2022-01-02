package problems.p0101_0200.p0125_valid_palindrome;

public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char a = ' ';
            ;
            while (!validChar(a = s.charAt(i)) & i++ < j) {

            }
            char b = ' ';
            while (!validChar(b = s.charAt(j)) & i <= j--) {

            }
            if (!equalsChar(a, b))
                return false;
        }
        return true;
    }

    static boolean validChar(char c) {
        return (47 < c && c < 58) || // 0-9
                (64 < c && c < 91) || // A-Z
                (96 < c && c < 123);// a-z
    }

    static boolean equalsChar(char a, char b) {
        if (a == b)
            return true;
        if (a < 58 || b < 58)
            return false;
        if (a < b)
            return a == b - ('a' - 'A');
        else
            return a == b + ('a' - 'A');
    }

    public static void main(String[] args) {
        String a = "abab";
        // String a = "";
        // String a = "\"A man, a plan, a canal: Panama\"";
        // String a = "a.";
        // String a = ".,";
        System.out.println(isPalindrome(a));
    }
}