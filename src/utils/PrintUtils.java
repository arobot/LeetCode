package utils;

public class PrintUtils {
    public static void printArray(int[] arrays) {
        for (int n : arrays)
            System.out.print(n + ", ");
    }

    public static void printArray(char[] arrays) {
        for (char n : arrays)
            System.out.print(n + ", ");
    }

    public static void printMatrix(int[][] matrix) {
        int n = matrix[0].length;
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                System.out.print(matrix[x][y] + ", ");
            }
            System.out.println(" ");
        }
    }
}
