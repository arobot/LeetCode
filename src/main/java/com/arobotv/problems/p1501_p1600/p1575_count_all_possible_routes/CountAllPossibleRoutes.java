package com.arobotv.problems.p1501_p1600.p1575_count_all_possible_routes;

import java.util.Arrays;

public class CountAllPossibleRoutes {
    int mod = 1000000007;
    int[][] cache;

    public int countRoutes(int[] locations, int start, int finish, int fuel) {
        int n = locations.length;
        cache = new int[n][fuel + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(cache[i], -1);
        }
        return dfs(locations, start, finish, fuel);
    }

    int dfs(int[] locations, int u, int finish, int fuel) {
        //如果该位置已经有值了，则直接返回该值。
        if (cache[u][fuel] != -1)
            return cache[u][fuel];
            //如果剩余燃料为0，但是当前位置不是结束位置，则该路径不计数。
        if (fuel == 0 && u != finish) {
            cache[u][fuel] = 0;
            return 0;
        }
        int n = locations.length;
        //判定当剩余燃料不为零时，是否有足够的燃料进行下一步的前进。
        boolean hasNext = false;
        for (int i = 0; i < n; i++) {
            if (i != u) {
                int need = Math.abs(locations[u] - locations[i]);
                if (fuel >= need) {
                    hasNext = true;
                    break;
                }
            }
        }
        //如果燃料不为零，但是不足以进行下一步前进时
        if (fuel != 0 && !hasNext) {
            //判断当前位置是否为结束位置。如果是则返回1，否则返回0
            cache[u][fuel] = u == finish ? 1 : 0;
            return cache[u][fuel];
        }
        //当可以进行下一步时，如果是从结束位置开始进行前进的，那么应当+1次计数。
        int sum = u == finish ? 1 : 0;
        for (int i = 0; i < n; i++) {
            if (i != u) {
                int need = Math.abs(locations[i] - locations[u]);
                if (fuel >= need) {
                    sum += dfs(locations, i, finish, fuel - need);
                    sum %= mod;
                }
            }
        }
        cache[u][fuel] = sum;
        return sum;
    }
}
