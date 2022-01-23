# 罗马数字转整数

罗马数字包含以下七种字符: `I`， `V`，`X`，`L`，`C`，`D` 和 `M`。

## 分析

### 1. 迭代法

从末尾到头遍历罗马数字，遇到一个数字之后，判断是否比上一个小，较小则减去该值，反之则加上改值。

```java
    static HashMap<Character, Integer> romap = new HashMap<>();
    {
        romap.put('I', 1);
        romap.put('V', 5);
        romap.put('X', 10);
        romap.put('L', 50);
        romap.put('C', 100);
        romap.put('D', 500);
        romap.put('M', 1000);
    }

    public int romanToInt(String s) {
        int last = 0;
        int sum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int j = romap.get(s.charAt(i));
            if (j < last) {
                sum -= j;
            } else
                sum += j;
            last = j;
        }
        return sum;
    }
```

> 执行用时：4 ms, 在所有 Java 提交中击败了81.26%的用户
>
> 内存消耗：38.3 MB, 在所有 Java 提交中击败了93.84%的用户
