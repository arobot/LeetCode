package com.arobotv.problems.p0301_0400.p0347_top_k_frequent_elements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Map.Entry;

public class TopKFrequent {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i : nums) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }
        return freqMap.entrySet().stream()
                .sorted((b, a) -> a.getValue().compareTo(b.getValue()))
                .mapToInt(Entry::getKey)
                .limit(k)
                .toArray();
    }

    public int[] topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i : nums) {
            freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
        }

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((a, b) -> b[1] - a[1]);
        for (int key : freqMap.keySet()) {
            priorityQueue.add(new int[] { key, freqMap.get(key) });
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = priorityQueue.poll()[0];
        }
        return result;
    }
}
