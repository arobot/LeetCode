# 颜色分类

## 分析

用双指针的方式，指向`0`和`1`与`1`和`2`的分界现，每次置换这两个位置的元素即可。

### 1. 计数后赋值

统计0,1,2的个数后再次进行赋值操作。这是取巧的行为，并没有进行排序的过程。

```java
    public void sortColors(int[] nums) {
        int firstGap = 0, secondGap = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                firstGap++;
                secondGap++;
            } else if (nums[i] == 1) {
                secondGap++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < firstGap)
                nums[i] = 0;
            else if (i < secondGap)
                nums[i] = 1;
            else
                nums[i] = 2;
        }
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：39.5 MB, 在所有 Java 提交中击败了23.27%的用户

### 2. 双指针

这里正经的做了排序的动作。设置两个指针分别从0增长和2的位置收缩，需要注意的是，进行2的位置交换后，需要原地也就是`i--`操作，继续在当前位置继续处理。

```java
    public void sortColors2(int[] nums) {
        int a = 0, b = nums.length - 1;
        for (int i = 0; i <= b; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[a];
                nums[a] = 0;
                a++;
            } else if (nums[i] == 2) {
                nums[i] = nums[b];
                nums[b] = 2;
                i--;
                b--;
            }
        }
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：39.4 MB, 在所有 Java 提交中击败了23.40%的用户
