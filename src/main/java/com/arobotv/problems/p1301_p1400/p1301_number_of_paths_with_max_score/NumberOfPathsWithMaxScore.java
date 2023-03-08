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
        //使用一级缓存当前行计算后的结果，其中i0是当前和，i1是当前路径之和
        int[][] cache = new int[s][2];
        //后面后右边，右下以及正下方的数据作比较使用的缓存数据
        int max = 0, maxCount = 0;
        //因为使用一级缓存时，还需要使用到右下角的数据，而该数据会被覆盖，所以需要缓存。
        int last = 0, lastCount = 0;
        for (int i = s - 1; i >= 0; i--) {
            String str = board.get(i);
            for (int j = s - 1; j >= 0; j--) {
                char c = str.charAt(j);
                if (c == 'X') {
                    //缓存last数据
                    last = cache[j][0];
                    lastCount = cache[j][1];
                    cache[j][0] = 0;
                    cache[j][1] = 0;
                    continue;
                } else if (c == 'S') {
                    //初始化迭代的起始量
                    cache[j][1] = 1;
                    continue;
                } else {
                    //获取正下方的数据
                    maxCount = cache[j][1];
                    max = cache[j][0];
                    //当存在右边的数据时，也意味着存在下方数据
                    //在最下方一行时，缓存行充当了一个默认值
                    if (j != s - 1) {
                        //和右方的比较
                        if (max == cache[j + 1][0])
                            maxCount += cache[j + 1][1];
                        else if (max < cache[j + 1][0]) {
                            max = cache[j + 1][0];
                            maxCount = cache[j + 1][1];
                        }
                        //和下方的比较
                        if (max == last)
                            maxCount += lastCount;
                        else if (max < last) {
                            max = last;
                            maxCount = lastCount;
                        }
                    }
                    //缓存当前数据作为下一次迭代的右下方
                    last = cache[j][0];
                    lastCount = cache[j][1];
                    cache[j][0] = max + (c == 'E' ? 0 : (c - '0'));
                    cache[j][1] = maxCount;
                    cache[j][1] %= mod;
                }
            }
        }
        //如果最后返回时，数量为0，那么值也应该是0
        return new int[] { cache[0][1] == 0 ? 0 : cache[0][0], cache[0][1] };
    }
}
