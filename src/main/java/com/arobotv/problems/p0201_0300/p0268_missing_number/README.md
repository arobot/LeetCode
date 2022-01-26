# 丢失的数字

给定一个包含 [0, n] 中 n 个数的数组 nums ，找出 [0, n] 这个范围内没有出现在数组中的那个数。

## 分析

累加所有的数字，然后用等差数列公式直接减。

### 1. 等差数列求和方式

数组的长度就是数组中数字的上限，通过等差求和得到应得的值。再将数组中全部的项求和，用等差数列的和减去数组求和即可得到没有出现的值。

```java
    public int missingNumber(int[] nums) {
        int len = nums.length;
        len = (1 + len) * len / 2;
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        return len - sum;
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：42.4 MB, 在所有 Java 提交中击败了5.11%的用户

### 2. 等差数列求和优化

数组的长度就是数组中数字的上限，通过等差求和得到应得的值。再将数组中全部的项求和，用等差数列的和减去数组求和即可得到没有出现的值。

```java
    public int missingNumber(int[] nums) {
        int len = nums.length;
        len = (1 + len) * len / 2;
        for (int i : nums) {
            len -= i;
        }
        return len;
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：42.1 MB, 在所有 Java 提交中击败了5.11%的用户

### 3.巧用异或运算

借助异或两次运算，相同的数进行异或就等于0.构造一个数组装满`[0,n]`,两个数组进行异或后剩下的值就是缺失的值。

```java
    public int missingNumber2(int[] nums) {
        int len = nums.length;
        int xor = 0;
        for (int i = 0; i < len; i++) {
            xor = xor ^ nums[i] ^ (i + 1);
        }
        return xor;
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：42 MB, 在所有 Java 提交中击败了5.11%的用户
