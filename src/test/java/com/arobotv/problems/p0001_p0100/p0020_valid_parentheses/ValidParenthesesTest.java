package com.arobotv.problems.p0001_p0100.p0020_valid_parentheses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class ValidParenthesesTest {
    @Test
    void testIsValid() {
        ValidParentheses parentheses =new ValidParentheses();
        Assertions.assertTrue(parentheses.isValid("()"));
        Assertions.assertTrue(parentheses.isValid("{}"));
        Assertions.assertTrue(parentheses.isValid("(){}"));
        Assertions.assertTrue(parentheses.isValid("{([])}"));
        Assertions.assertFalse(parentheses.isValid("{"));
        Assertions.assertFalse(parentheses.isValid("{{}"));
        Assertions.assertFalse(parentheses.isValid("{{}})"));
        Assertions.assertFalse(parentheses.isValid("([)]"));
    }
}
