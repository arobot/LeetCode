package com.arobotv.problems.p0701_p0800.p0706_my_hash_map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyHashMapTest {
    /*
     * 输入：
     * ["MyHashMap", "put", "put", "get", "get", "put", "get", "remove", "get"]
     * [[], [1, 1], [2, 2], [1], [3], [2, 1], [2], [2], [2]]
     * 输出：
     * [null, null, null, 1, -1, null, 1, null, -1]
     */
    @Test
    void test1() {
        MyHashMap map = new MyHashMap();
        map.put(1, 1);
        map.put(2, 2);
        Assertions.assertEquals(1, map.get(1));
        Assertions.assertEquals(-1, map.get(3));
        map.put(2, 1);
        Assertions.assertEquals(1, map.get(2));
        map.remove(2);
        Assertions.assertEquals(-1, map.get(2));
    }

    
}
