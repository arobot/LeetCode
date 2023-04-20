package com.arobotv.problems.p1101_p1200.p1187_make_array_strictly_increasing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MakeArrayStrictlyIncreasing {
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        // 定义一个二维数组dp，dp[i][j]表示arr1的前i个元素进行j次替换后能够得到的最大值
        int[][] dp = new int[arr1.length][Math.min(arr1.length, arr2.length) + 1];
        // 将arr2排序,去重后得到一个ArrayList
        List<Integer> arr2List = Arrays.stream(arr2)
                .distinct()
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        dp[0][0] = arr1[0];
        int index = fastBinarySearch(arr2List, dp[0][0]);
        dp[0][1] = index == -1 ? Integer.MAX_VALUE : arr2List.get(index);
        for (int i = 1; i < arr1.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                // 当j==0时，表示不进行替换，直接将arr1[i]赋值给dp[i][j]
                if (j == 0) {
                    if (arr1[i] > dp[i - 1][j])
                        dp[i][j] = arr1[i];
                    else
                        dp[i][j] = Integer.MAX_VALUE;
                } else if (j > i + 1) {
                    break;
                } else {
                    if (arr1[i] > dp[i - 1][j-1])
                        dp[i][j] = arr1[i];
                    else {

                    }

                }
            }
        }
        /*
         * 遍历dp最后一行，找到第一个不等于Integer.Max_Value的值，返回其下标
         * 如果没有找到，返回-1
         * 
         */
        for (

                int i = 0; i < dp[dp.length - 1].length; i++) {
            if (dp[dp.length - 1][i] != Integer.MAX_VALUE) {
                return i;
            }
        }
        return -1;
    }

    /*
     * 有一个有序数组，找到第一个大于target的元素的下标
     */
    private int fastBinarySearch(List<Integer> arr2List, int target) {
        int left = 0;
        int right = arr2List.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr2List.get(mid) > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left == arr2List.size() ? -1 : left;
    }

}
