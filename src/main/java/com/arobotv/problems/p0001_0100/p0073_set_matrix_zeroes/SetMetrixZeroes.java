package com.arobotv.problems.p0001_0100.p0073_set_matrix_zeroes;

import java.util.HashSet;
import java.util.Set;

public class SetMetrixZeroes {
    public void setZeroes(int[][] matrix) {
        int h = matrix.length;
        int v = matrix[0].length;
        Set<Integer> hSet = new HashSet<>();
        Set<Integer> vSet = new HashSet<>();
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < v; j++) {
                if (matrix[i][j] == 0) {
                    hSet.add(i);
                    vSet.add(j);
                }
            }
        }
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < v; j++) {
                if (hSet.contains(i) || vSet.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public void setZeroes2(int[][] matrix) {
        int h = matrix.length;
        int v = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        for (int i = 0; i < h; i++) {
            for (int j = 0; j < v; j++) {
                if (matrix[i][j] == 0) {
                    if (i == 0)
                        firstRowZero = true;
                    if (j == 0)
                        firstColZero = true;
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < h; i++) {
            for (int j = 1; j < v; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        if (firstRowZero) {
            for (int i = 0; i < v; i++) {
                matrix[0][i] = 0;
            }
        }

        if (firstColZero) {
            for (int i = 0; i < h; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
