package com.arobotv.problems.p0001_0100.p0017_letter_combinations_of_a_phone_number;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class LetterCombinationOfNumber {
    private static Map<String, List<String>> digitString = new HashMap<>();
    static {
        digitString.put("2", Arrays.asList("a", "b", "c"));
        digitString.put("3", Arrays.asList("d", "e", "f"));
        digitString.put("4", Arrays.asList("g", "h", "i"));
        digitString.put("5", Arrays.asList("j", "k", "l"));
        digitString.put("6", Arrays.asList("m", "n", "o"));
        digitString.put("7", Arrays.asList("p", "q", "r", "s"));
        digitString.put("8", Arrays.asList("t", "u", "v"));
        digitString.put("9", Arrays.asList("w", "x", "y", "z"));
    }

    public List<String> letterCombinations(String digits) {
        if (Objects.isNull(digits) || Objects.equals(digits, ""))
            return new ArrayList<>();
        List<String> strs = new ArrayList<>();
        for (char c : digits.toCharArray()) {
            strs = recrusive(String.valueOf(c), strs);
        }
        return strs;
    }

    public List<String> recrusive(String digit, List<String> pre) {
        List<String> next = new ArrayList<>();
        List<String> digitStrs = digitString.get(digit);
        if (pre.isEmpty())
            next = digitStrs;
        else
            for (String s : digitStrs) {
                for (String p : pre) {
                    next.add(p + s);
                }
            }
        return next;
    }

    private static String[] strings = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    private List<String> list;

    public List<String> letterCombinations2(String digits) {
        list = new ArrayList<>();
        if (Objects.isNull(digits) || Objects.equals(digits, ""))
            return list;

        recrusive2(digits, 0, "");
        return list;
    }

    public void recrusive2(String digits, int index, String sb) {
        if (index == digits.length()) {

            list.add(sb.toString());
            return;
        }
        String letters = strings[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            recrusive2(digits, index + 1, sb + letters.charAt(i));
        }
    }
}
