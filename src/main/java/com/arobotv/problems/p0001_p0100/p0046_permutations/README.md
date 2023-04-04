# 全排列

## 分析

按顺序依次取数，回溯过程中逐渐判断是否有重复值。

### 1. 自建数组

```java
    public List<List<Integer>> permute(int[] nums) {
        list = new ArrayList<>();
        backtrack(initNums(nums.length), nums);
        return list;
    }

    List<List<Integer>> list;

    void backtrack(int[] set, int[] nums) {
        if (length(set) == nums.length) {
            list.add(toList(set));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (contain(set,nums[i]))
                continue;
            addEle(set, nums[i]);
            backtrack(set, nums);
            removeLast(set);
        }
    }

    List<Integer> toList(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int i : nums)
            list.add(i);
        return list;
    }

    int[] initNums(int length) {
        int[] nums = new int[length];
        Arrays.fill(nums, -11);
        return nums;
    }

    boolean contain(int[] nums, int target) {
        for (int i : nums) {
            if (i == target)
                return true;
        }
        return false;
    }

    void addEle(int[] nums, int num) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == -11) {
                nums[i] = num;
                return;
            }
        }
    }

    void removeLast(int[] nums) {
        int index = length(nums);
        if (index > 0)
            nums[index - 1] = -11;
    }

    private int length(int[] nums) {
        int index = 0;
        for (int i : nums) {
            if (i == -11) {
                break;
            }
            index++;
        }
        return index;
    }
```

> 执行用时：1 ms, 在所有 Java 提交中击败了79.64%的用户
>
> 内存消耗：41.4 MB, 在所有 Java 提交中击败了16.19%的用户

### 2. 使用List

```java
    public List<List<Integer>> permute2(int[] nums) {
        list2 = new ArrayList<>();
        backtrack2(new ArrayList<>(), nums);
        return list2;
    }

    List<List<Integer>> list2;

    void backtrack2(List<Integer> list, int[] nums) {
        if (list.size() == nums.length) {
            list2.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (list.contains(nums[i]))
                continue;
            list.add(nums[i]);
            backtrack2(list, nums);
            list.remove(list.size() - 1);
        }
    }
```

> 执行用时：1 ms, 在所有 Java 提交中击败了79.64%的用户
>
> 内存消耗：41.2 MB, 在所有 Java 提交中击败了19.82%的用户
