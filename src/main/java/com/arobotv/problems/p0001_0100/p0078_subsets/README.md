# 子集

## 分析

在回溯的过程中，将每一次回溯的结果都添加到返回的列表中。待中间列表的长度和原始数组一致时，返回。

### 1. 回溯

```java
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>());
        return result;
    }

    List<List<Integer>> result;

    void backtrack(int[] nums, int index, List<Integer> temp) {
        result.add(new ArrayList<>(temp));
        if (temp.size() == nums.length)
            return;
        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(nums, i + 1, temp);
            temp.remove(temp.size() - 1);
        }
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：41.3 MB, 在所有 Java 提交中击败了18.39%的用户
