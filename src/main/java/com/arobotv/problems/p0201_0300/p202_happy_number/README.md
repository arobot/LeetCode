# 快乐数

## 分析

递归求解。

双指针。

### 递归

```java
    private HashMap<Integer, Integer> squareMap = new HashMap<>();

    public boolean isHappy(int n) {
        if (n == 1)
            return true;
        if (squareMap.getOrDefault(n, 1) > 1)
            return false;
        int b = 0;
        while (n > 0) {
            int a = n % 10;
            b += a * a;
            n = n / 10;
        }
        squareMap.put(b, squareMap.getOrDefault(b, 0) + 1);
        return isHappy(b);
    }
```

>执行用时：1 ms, 在所有 Java 提交中击败了81.75%的用户
>
> 内存消耗：38.9 MB, 在所有 Java 提交中击败了9.16%的用户

### 双指针

和之前的循环链表逻辑类似，当这个数据链无法得到1的值之后，必然会进入某种循环当中。

```java
    public boolean isHappy2(int n) {
        int slow = n;
        int fast = next(n);
        while (fast != 1 && slow != fast) {
            slow = next(slow);
            fast = next(next(fast));
        }
        return fast == 1;
    }

    public int next(int n) {
        int b = 0;
        while (n > 0) {
            int a = n % 10;
            b += a * a;
            n = n / 10;
        }
        return b;
    }
```

> 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
> 内存消耗：38.8 MB, 在所有 Java 提交中击败了22.44%的用户
