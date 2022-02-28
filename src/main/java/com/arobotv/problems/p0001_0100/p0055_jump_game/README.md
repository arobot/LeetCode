# 跳跃游戏

## 分析

在前进的每一步上面，不仅要知道当前这个格子最远可以走多长，还需要知道前面的格子给的增益能够帮助我们前进多少。这里就是很典型的动态规划逻辑。

初始状态就是第一个格子可跳跃的长度，增益为0；

状态转移就需要判断或者说比较前一个格子的增益，以帮助我们解决当前格子所不能。

### 1. 动态规划

```java
    public boolean canJump(int[] nums) {
        //将dp数组简化，因为每次只会用到前一个条件
        int bonus = 0;
        //如果能循环到最后一个，说明就到了
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && bonus <= 0) {
                return false;
            }
            bonus = Math.max(nums[i] - 1, bonus - 1);
        }
        return true;
    }
```

> 执行用时：2 ms, 在所有 Java 提交中击败了94.72%的用户
>
> 内存消耗：41.5 MB, 在所有 Java 提交中击败了31.36%的用户

### 2. 贪心算法

```java
    public boolean canJump2(int[] nums) {
        int rightMost = nums[0];
        // 这里i依然从0开始而不是1，因为有只存在一个数据的情况
        for (int i = 0; i <= rightMost; ++i) {
            rightMost = Math.max(rightMost, i + nums[i]);
            if (rightMost >= nums.length - 1)
                return true;
        }
        return false;
    }
```

> 执行用时：2 ms, 在所有 Java 提交中击败了94.72%的用户
>
> 内存消耗：41.6 MB, 在所有 Java 提交中击败了29.31%的用户
