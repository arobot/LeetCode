package com.arobotv.problems.p0301_0400.p0380_ransom_note;

public class RansomNote {
    /*
     * 执行用时：1 ms, 在所有 Java 提交中击败了99.38%的用户
     * 内存消耗：41.8 MB, 在所有 Java 提交中击败了44.50%的用户
     */
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;
        int[] temp = new int[26];
        char[] ransomChars = ransomNote.toCharArray();
        char[] magazineChars = magazine.toCharArray();

        for (char m : magazineChars) {
            temp[m - 'a']++;
        }

        for (char r : ransomChars) {
            temp[r - 'a']--;
            if (temp[r - 'a'] < 0)
                return false;
        }
        return true;
    }
}
