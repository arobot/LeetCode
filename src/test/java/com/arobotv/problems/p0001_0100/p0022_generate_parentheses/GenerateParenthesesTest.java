package com.arobotv.problems.p0001_0100.p0022_generate_parentheses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GenerateParenthesesTest {
    @Test
    void testGenerateParenthesis() {
        GenerateParentheses generateParentheses = new GenerateParentheses();
        Assertions.assertEquals("[()]", generateParentheses.generateParenthesis(1).toString());
        Assertions.assertEquals("[()(), (())]", generateParentheses.generateParenthesis(2).toString());
        Assertions.assertEquals("[()()(), ()(()), (()()), (())(), ((()))]", generateParentheses.generateParenthesis(3).toString());
    }
}
