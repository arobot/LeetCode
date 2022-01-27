package com.arobotv.problems.p0001_0100.p0073_set_matrix_zeroes;

import java.util.HashSet;
import java.util.Set;

public class SetMetrixZeroes {
    public void setZeroes(int[][] matrix) {
        int h = matrix.length;
        int v = matrix[0].length;
        Set<Integer> hSet = new HashSet<>();
        Set<Integer> vSet = new HashSet<>();
        for(int i = 0;i<h;i++){
            for(int j=0;j<v;j++){
                if(matrix[i][j]==0){
                    hSet.add(i);
                    vSet.add(j);
                }
            }
        }
        

    }
}
