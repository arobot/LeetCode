package com.arobotv.problems.p0001_0100.p0079_word_search;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        exist = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                backtrack(board, i, j, 0, word);
                if (exist)
                    return exist;
            }
        }
        return exist;
    }

    boolean exist = false;

    void backtrack(char[][] board, int i, int j, int index, String word) {
        if (index == word.length()) {
            exist = true;
            return;
        }

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length)
            return;

        if (board[i][j] == '1')
            return;

        if (board[i][j] == word.charAt(index) && !exist) {
            board[i][j] = '1';
            backtrack(board, i + 1, j, index + 1, word);
            backtrack(board, i - 1, j, index + 1, word);
            backtrack(board, i, j + 1, index + 1, word);
            backtrack(board, i, j - 1, index + 1, word);
            board[i][j] = word.charAt(index);
        } else {
            return;
        }
    }
}
