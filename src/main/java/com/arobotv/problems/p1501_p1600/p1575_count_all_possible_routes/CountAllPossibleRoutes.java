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
        // 如果该位置已经有值了，则直接返回该值。
        if (cache[u][fuel] != -1)
            return cache[u][fuel];
        // 如果剩余燃料为0，但是当前位置不是结束位置，则该路径不计数。
        if (fuel == 0 && u != finish) {
            cache[u][fuel] = 0;
            return 0;
        }
        int n = locations.length;
        // 判定当剩余燃料不为零时，是否有足够的燃料进行下一步的前进。
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
        // 如果燃料不为零，但是不足以进行下一步前进时
        if (fuel != 0 && !hasNext) {
            // 判断当前位置是否为结束位置。如果是则返回1，否则返回0
            cache[u][fuel] = u == finish ? 1 : 0;
            return cache[u][fuel];
        }
        // 当可以进行下一步时，如果是从结束位置开始进行前进的，那么应当+1次计数。
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

    public int dfsOptmizeCountRoutes(int[] locations, int start, int finish, int fuel) {
        int n = locations.length;
        cache = new int[n][fuel + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(cache[i], -1);
        }
        return dfsOptmize(locations, start, finish, fuel);
    }

    /*
     * 执行用时：36 ms, 在所有 Java 提交中击败了93.73%的用户
     * 内存消耗：40.7 MB, 在所有 Java 提交中击败了94.83%的用户
     */
    int dfsOptmize(int[] locations, int u, int finish, int fuel) {
        // 如果该位置已经有值了，则直接返回该值。
        if (cache[u][fuel] != -1)
            return cache[u][fuel];

        int need = Math.abs(locations[u] - locations[finish]);
        // 如果燃料不为零，但是不足以进行下一步前进时
        if (need > fuel) {
            // 判断当前位置是否为结束位置。如果是则返回1，否则返回0
            cache[u][fuel] = u == finish ? 1 : 0;
            return cache[u][fuel];
        }
        // 当可以进行下一步时，如果是从结束位置开始进行前进的，那么应当+1次计数。
        int n = locations.length;
        int sum = u == finish ? 1 : 0;
        for (int i = 0; i < n; i++) {
            if (i != u) {
                need = Math.abs(locations[i] - locations[u]);
                if (fuel >= need) {
                    sum += dfsOptmize(locations, i, finish, fuel - need);
                    sum %= mod;
                }
            }
        }
        cache[u][fuel] = sum;
        return sum;
    }
    /*
     * 执行用时：163 ms, 在所有 Java 提交中击败了14.65%的用户
     * 内存消耗：40.7 MB, 在所有 Java 提交中击败了93.77%的用户
     */

    public int countRoutesDp(int[] locations, int start, int finish, int fuel) {
        int n = locations.length;
        int[][] temp = new int[n][fuel + 1];

        for (int i = 0; i <= fuel; i++) {
            temp[finish][i] = 1;
        }
        for (int cur = 0; cur <= fuel; cur++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j != i) {
                        int need = Math.abs(locations[i] - locations[j]);
                        if (need <= cur) {
                            temp[i][cur] += temp[j][cur - need];
                            temp[i][cur] %= mod;
                        }
                    }
                }
            }
        }
        return temp[start][fuel];
    }
}
