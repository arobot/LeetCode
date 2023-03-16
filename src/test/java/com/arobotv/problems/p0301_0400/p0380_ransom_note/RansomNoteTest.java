package com.arobotv.problems.p0301_0400.p0380_ransom_note;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RansomNoteTest {
    @Test
    void testCanConstruct() {
        RansomNote r = new RansomNote();
        String ransomNote = "aa", magazine = "aab";
        assertEquals(Boolean.TRUE, r.canConstruct(ransomNote, magazine));
    }

    @Test
    void testCanConstruct2() {
        RansomNote r = new RansomNote();
        String ransomNote = "aa", magazine = "ab";
        assertEquals(Boolean.FALSE, r.canConstruct(ransomNote, magazine));
    }

    @Test
    void testCanConstruct3() {
        RansomNote r = new RansomNote();
        String ransomNote = "aa", magazine = "bb";
        assertEquals(Boolean.FALSE, r.canConstruct(ransomNote, magazine));
    }
}
