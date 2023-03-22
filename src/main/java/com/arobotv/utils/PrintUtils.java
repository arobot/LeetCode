package com.arobotv.utils;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class PrintUtils {

    public static <T> String printArrayT(Collection<T> arrays) {
        String line = arrays.stream().map(T::toString).collect(Collectors.joining(","));
        line = "[" + line + "]";
        System.out.println(line);
        return line;
    }

    public static String printArray(Collection<String> arrays) {
        String line = arrays.stream().collect(Collectors.joining(","));
        line = "[" + line + "]";
        System.out.println(line);
        return line;
    }

    public static String printArray(int[] arrays) {
        List<String> line = ArrayUtils.asList(arrays).stream().map(String::valueOf).collect(Collectors.toList());
        return printArray(line);
    }

    public static String printArray(char[] arrays) {
        List<String> line = ArrayUtils.asList(arrays).stream().map(String::valueOf).collect(Collectors.toList());
        return printArray(line);
    }

    public static void printMatrix(int[][] matrix) {
        int m = matrix.length;
        for (int x = 0; x < m; x++) {
            int[] t = matrix[x];
            printArray(t);
        }
    }
}
