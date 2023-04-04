package com.arobotv.problems.p0001_p0100.p0036_valid_sudoku;

public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        return validHorizontal(board) && validVertical(board) && validSquare(board);
    }

    boolean validHorizontal(char[][] board) {
        int size = board.length;
        while (size-- > 0) {
            char[] horizontal = board[size];
            int[] h = new int[9];
            for (int i = 0; i < 9; i++) {
                if ('0' < horizontal[i] && horizontal[i] <= '9') {
                    int num = (int) (horizontal[i] - '1');
                    if (h[num] > 0)
                        return false;
                    else
                        h[num]++;
                }
            }
        }
        return true;
    }

    boolean validVertical(char[][] board) {
        int size = board.length;
        while (size-- > 0) {
            int[] h = new int[9];
            for (int i = 0; i < 9; i++) {
                if ('0' < board[i][size] && board[i][size] <= '9') {
                    int num = (int) (board[i][size] - '1');
                    if (h[num] > 0)
                        return false;
                    else
                        h[num]++;
                }
            }
        }
        return true;
    }

    boolean validSquare(char[][] board) {
        int h = 0, v = 0;
        while (h < 3) {
            while (v < 3) {
                int[] b = new int[9];
                for (int i = h * 3; i < h * 3 + 3; i++) {
                    for (int j = v * 3; j < v * 3 + 3; j++) {
                        if ('0' < board[i][j] && board[i][j] <= '9') {
                            int num = (int) (board[i][j] - '1');
                            if (b[num] > 0)
                                return false;
                            else
                                b[num]++;
                        }
                    }
                }
                v++;
            }
            v = 0;
            h++;
        }
        return true;
    }


}
