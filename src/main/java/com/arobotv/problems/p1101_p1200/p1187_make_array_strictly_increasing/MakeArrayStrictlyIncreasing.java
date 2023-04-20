package com.arobotv.problems.p1101_p1200.p1187_make_array_strictly_increasing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MakeArrayStrictlyIncreasing {
    public int makeArrayIncreasing(int[] arr1, int[] arr2) {
        // 定义一个二维数组dp，dp[i][j]表示arr1的前i个元素进行j次替换后能够得到的最小值

        // 将arr2排序,去重后得到一个ArrayList
        List<Integer> arr2List = Arrays.stream(arr2)
                .distinct()
                .sorted()
                .boxed()
                .collect(Collectors.toList());
        int[][] dp = new int[arr1.length + 1][Math.min(arr1.length, arr2List.size()) + 1];

        // 初始化dp[i][0]的数据
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], Integer.MAX_VALUE);
        }
        dp[0][0] = -1;
        for (int i = 1; i <= arr1.length; i++) {
            for (int j = 0; j < dp[i].length; j++) {
                if (arr1[i - 1] > dp[i - 1][j]) {
                    dp[i][j] = arr1[i - 1];
                }
                if (j > 0 && dp[i - 1][j - 1] != Integer.MAX_VALUE) {
                    int index = fastBinarySearch(arr2List, dp[i - 1][j - 1]);
                    if (index != -1) {
                        dp[i][j] = Math.min(dp[i][j], arr2List.get(index));
                    }
                }
                if (i == arr1.length && dp[i][j] != Integer.MAX_VALUE) {
                    return j;
                }
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
