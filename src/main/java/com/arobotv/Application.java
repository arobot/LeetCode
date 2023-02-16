package com.arobotv;

public class Application {
    public static void main(String[] args) {
        System.out.println("m,n:3,3:" + uniquePath(3, 3));
    }

    public static int uniquePath(int m, int n) {

        int[] row = new int[m];
        for (int index = 0; index < row.length; index++) {
            row[index] = 1;
        }
        for (int col = 1; col < n; col++) {
            for (int index = 1; index < row.length; index++) {
                row[index] = row[index - 1] + row[index];
            }
        }
        return row[m - 1];
    }
}
