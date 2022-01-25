package com.arobotv.problems.p0001_0100.p0020_valid_parentheses;

import java.util.Objects;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        if(s.length()%2==1) return false;
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty()) {
                stack.add(c);
            } else if (match(c, stack.peek()))
                stack.pop();
            else
                stack.add(c);
        }
        return stack.isEmpty();
    }

    boolean match(char c1, char c2) {
        if (c1 == ')')
            return Objects.equals(c2, '(');
        if (c1 == ']')
            return Objects.equals(c2, '[');
        if (c1 == '}')
            return Objects.equals(c2, '{');
        return false;
    }
}
