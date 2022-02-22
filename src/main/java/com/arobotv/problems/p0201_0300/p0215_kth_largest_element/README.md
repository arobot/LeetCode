# 数组中第K个最大元素

## 分析

将数组排序后，直接取第K个元素即可。

这里，我们首先使用桶排序方式进行排序过程。

### 1. 桶排序

在桶排序最后进行插入的过程中，直接数到对应的个数后直接返回。避免再次进行遍历。

```java
public int findKthLargest(int[] nums, int k) {
        return bucketSort(nums, k);
    }

    int bucketSort(int[] nums, int k) {
        int min = nums[0], max = nums[0];
        for (int a : nums) {
            if (max < a)
                max = a;
            if (min > a)
                min = a;
        }
        int step = 50;
        int bucketNum = max / step - min / step + 1;
        List<List<Integer>> bucketList = new ArrayList<>();
        for (int i = 0; i <= bucketNum; i++) {
            bucketList.add(new ArrayList<>());
        }

        for (int i = 0; i < nums.length; i++) {
            int index = indexFor(nums[i], min, step);
            bucketList.get(index).add(nums[i]);
        }

        List<Integer> bucket = null;
        int index = 0;
        for (int i = bucketNum ; i >= 0; i--) {
            bucket = bucketList.get(i);
            insertSort(bucket);
            for (int a : bucket) {
                System.out.println(index+":"+a);
                if (index == k - 1)
                    return a;
                nums[index++] = a;

            }
        }
        return -1;
    }

    int indexFor(int a, int min, int step) {
        return (a - min) / step;
    }

    void insertSort(List<Integer> bucket) {
        for (int i = 1; i < bucket.size(); i++) {
            int temp = bucket.get(i);
            int j = i - 1;
            for (; j >= 0 && bucket.get(j) < temp; j--) {
                bucket.set(j + 1, bucket.get(j));
            }
            bucket.set(j + 1, temp);
        }
    }
```

> 执行用时：5 ms, 在所有 Java 提交中击败了46.71%的用户
>
> 内存消耗：41.6 MB, 在所有 Java 提交中击败了9.94%的用户

### 2. 使用最小堆

```java
    public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue =new PriorityQueue<>();
        for(int i:nums){
            priorityQueue.add(i);
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        return priorityQueue.peek();
    }
```

> 执行用时：5 ms, 在所有 Java 提交中击败了46.71%的用户
>
> 内存消耗：41.4 MB, 在所有 Java 提交中击败了18.77%的用户

### 3. 使用系统排序

```java
    public int findKthLargest(int[] nums, int k) {
    Arrays.sort(nums);//先排序
    return nums[nums.length - k];//在查找
    }
```

> 执行用时：2 ms, 在所有 Java 提交中击败了82.33%的用户
>
> 内存消耗：41.6 MB, 在所有 Java 提交中击败了9.73%的用户
