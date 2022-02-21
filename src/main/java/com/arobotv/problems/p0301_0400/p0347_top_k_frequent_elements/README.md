# 前K个高频元素

## 分析

这里需要先将各个元素的频率排出来，才能进行前K个元素的查找。或者寻找有没有能够动态调整评率排序的方法。

### 1. 直接排序Entry

```java
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
```

> 执行用时：17 ms, 在所有 Java 提交中击败了9.65%的用户
>
> 内存消耗：44.1 MB, 在所有 Java 提交中击败了6.58%的用户

### 2. 最大堆

```java
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
```

> 执行用时：12 ms, 在所有 Java 提交中击败了89.79%的用户
>
> 内存消耗：43.7 MB, 在所有 Java 提交中击败了20.60%的用户
