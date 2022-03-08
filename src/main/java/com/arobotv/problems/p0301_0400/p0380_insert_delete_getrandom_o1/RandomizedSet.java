package com.arobotv.problems.p0301_0400.p0380_insert_delete_getrandom_o1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public class RandomizedSet {
    private Map<Integer, Integer> map;
    private List<Integer> list;
    private int endPointer;

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
    }

    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false;
        } else {
            // 值对应的list index索引位置
            map.put(val, endPointer);
            // 当可用的缩影小于了list的大小时，说明前面有过删除动作
            if (endPointer < list.size()) {
                //这时候需要去做值的替换
                list.set(endPointer, val);
            } else {
                // 直接添加
                list.add(val);
            }
            ++endPointer;
        }
        return true;
    }

    public boolean remove(int val) {
        // 已经存在这个key
        if (map.containsKey(val)) {
            // 获取被移除值对应list的索引
            int index = map.remove(val);
            //如果--endPointer，也就是回退后的结束位置，和获取的索引不同
            //也就是意味着不是最后一个插入的
            if (--endPointer != index) {
                // 将末尾的值取出
                int tmp = list.get(endPointer);
                //把末尾的值放到需要移除的位置
                list.set(index, tmp);
                //同时更新被移除位置的值为末尾的值
                map.put(tmp, index);
            }
            return true;
        } else {
            return false;
        }
    }

    public int getRandom() {
        int index = ThreadLocalRandom.current().nextInt(endPointer);
        return list.get(index);
    }
}
