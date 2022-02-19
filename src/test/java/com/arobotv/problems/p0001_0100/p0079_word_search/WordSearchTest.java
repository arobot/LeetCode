package com.arobotv.problems.p0001_0100.p0079_word_search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WordSearchTest {
    @Test
    void testExist() {
        WordSearch wordSearch= new WordSearch();
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        Assertions.assertTrue(wordSearch.exist(board, "ABC"));
        Assertions.assertTrue(wordSearch.exist(board, "ABCCED"));
        Assertions.assertFalse(wordSearch.exist(board, "ABCCEG"));
    }
    @Test
    void testExist2() {
        WordSearch wordSearch= new WordSearch();
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        Assertions.assertTrue(wordSearch.exist(board, "SEE"));
        Assertions.assertFalse(wordSearch.exist(board, "SEG"));
    }
}
