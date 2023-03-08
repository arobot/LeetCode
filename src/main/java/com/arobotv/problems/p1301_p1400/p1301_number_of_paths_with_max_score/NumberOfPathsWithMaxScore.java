package com.arobotv.problems.p1301_p1400.p1301_number_of_paths_with_max_score;

import java.util.List;

public class NumberOfPathsWithMaxScore {
    /*
     * 执行用时：7 ms, 在所有 Java 提交中击败了90.00%的用户
     * 内存消耗：39.7 MB, 在所有 Java 提交中击败了100.00%的用户
     */
    public int[] pathsWithMaxScore(List<String> board) {
        int mod = 1000000007;
        int s = board.size();
        int[][] cache = new int[s][2];
        int max = 0, maxCount = 0;
        int last = 0, lastCount = 0;
        for (int i = s - 1; i >= 0; i--) {
            String str = board.get(i);
            for (int j = s - 1; j >= 0; j--) {
                char c = str.charAt(j);
                if (c == 'X') {
                    last = cache[j][0];
                    lastCount = cache[j][1];
                    cache[j][0] = 0;
                    cache[j][1] = 0;
                    continue;
                } else if (c == 'S') {
                    cache[j][1] = 1;
                    continue;
                } else {
                    maxCount = cache[j][1];
                    max = cache[j][0];
                    if (j != s - 1) {
                        if (max == cache[j + 1][0])
                            maxCount += cache[j + 1][1];
                        else if (max < cache[j + 1][0]) {
                            max = cache[j + 1][0];
                            maxCount = cache[j + 1][1];
                        }
                        if (max == last)
                            maxCount += lastCount;
                        else if (max < last) {
                            max = last;
                            maxCount = lastCount;
                        }
                    }
                    last = cache[j][0];
                    lastCount = cache[j][1];
                    cache[j][0] = max + (c == 'E' ? 0 : (c - '0'));
                    cache[j][1] = maxCount;
                    cache[j][1] %= mod;
                }
            }
        }
        return new int[] { cache[0][1] == 0 ? 0 : cache[0][0], cache[0][1] };
    }
}
