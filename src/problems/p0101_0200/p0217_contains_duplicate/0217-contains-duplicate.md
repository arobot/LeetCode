### 关键字
- 重复元素
- 有重复则返回`true`

### 分析
该题目涉及数组遍历，时间复杂度上限为O(${N}$)。该题目要求找出重复元素即可，所以时间复杂度可以确定为O(${N}$)

常见的判断重复手段之一是哈希表，采用此手段则空间复杂度为O(${N}$)

如果有空间复杂度限制的前提下，只能考虑采用空间复杂度为O(1)的排序算法排序后，再进行一次遍历。时间复杂度和排序算法一致。

#### 1. hash方法
通过将每一个值添加到HashSet中，通过一次遍历就能够找到是否存在重复数据。
```java
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int n : nums) {
            if (hashSet.contains(n))
                return true;
            hashSet.add(n);
        }
        return false;
    }
```