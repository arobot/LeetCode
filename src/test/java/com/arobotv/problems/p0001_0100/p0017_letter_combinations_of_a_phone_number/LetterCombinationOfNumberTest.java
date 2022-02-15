package com.arobotv.problems.p0001_0100.p0017_letter_combinations_of_a_phone_number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LetterCombinationOfNumberTest {
    @Test
    void testLetterCombinations() {
        LetterCombinationOfNumber combinationOfNumber = new LetterCombinationOfNumber();
        Assertions.assertEquals("[a, b, c]", combinationOfNumber.letterCombinations("2").toString());
        Assertions.assertEquals("[ad, bd, cd, ae, be, ce, af, bf, cf]", combinationOfNumber.letterCombinations("23").toString());
        Assertions.assertEquals("[]", combinationOfNumber.letterCombinations("").toString());
        Assertions.assertEquals("[a, b, c]", combinationOfNumber.letterCombinations2("2").toString());
        Assertions.assertEquals("[ad, ae, af, bd, be, bf, cd, ce, cf]", combinationOfNumber.letterCombinations2("23").toString());
        Assertions.assertEquals("[]", combinationOfNumber.letterCombinations2("").toString());
    }
}
