package com.arobotv.problems.p0701_p0800.p0706_my_hash_map;

import java.util.TreeSet;

public class MyHashMap {
    TreeSet<int[]>[] treeSets;
    static int CAPACITY = 1 << 8;

    public MyHashMap() {
        treeSets = new TreeSet[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            treeSets[i] = new TreeSet<>((a, b) -> a[0] - b[0]);
        }
    }

    public void put(int key, int value) {
        //构造KEY，用于TreeSet中存储
        int[] pair = new int[] { key, value };
        //通过运算获取索引位置
        int index = key & (CAPACITY - 1);
        //获得某个索引下TreeSet中大于等于pair的最小值
        int[] res = treeSets[index].ceiling(pair);
        //如果没有找到，说明没有大于等于pair的值，直接添加
        if (res == null || res[0] != key) {
            treeSets[index].add(pair);
        } else {
            //如果找到了，说明已经存在，直接修改
            res[1] = value;
        }
    }

    public int get(int key) {
        int[] res = treeSets[key & (CAPACITY - 1)].ceiling(new int[] { key, 0 });
        return res == null || res[0] != key ? -1 : res[1];
    }

    public void remove(int key) {
        treeSets[key & (CAPACITY - 1)].remove(new int[] { key, 0 });
    }
}
