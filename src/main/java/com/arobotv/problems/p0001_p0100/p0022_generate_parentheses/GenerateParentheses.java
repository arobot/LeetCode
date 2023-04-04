package com.arobotv.problems.p0001_p0100.p0022_generate_parentheses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        strSet = new HashSet<>();
        back(n, "");
        return new ArrayList<>(strSet);
    }

    Set<String> strSet;

    public void back(int n, String str) {
        if (str.length() == 2 * n) {
            strSet.add(str);
            return;
        }
        if (str == "")
            back(n, "()");
        else
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' && str.charAt(i + 1) == ')' || str.charAt(i) == ')') {
                    back(n, str.substring(0, i) + "()" + str.substring(i));
                }
            }
    }
}
