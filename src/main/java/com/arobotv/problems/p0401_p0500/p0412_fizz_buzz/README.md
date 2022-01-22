# Fizz Buzz

给你一个整数 `n` ，找出从 `1` 到 `n` 各个整数的 Fizz Buzz 表示，并用字符串数组 `answer`（**下标从 1 开始**）返回结果，其中：

- `answer[i] == "FizzBuzz"` 如果 `i` 同时是 `3` 和 `5` 的倍数。
- `answer[i] == "Fizz"` 如果 `i` 是 `3` 的倍数。
- `answer[i] == "Buzz"` 如果 `i` 是 `5` 的倍数。
- `answer[i] == i` （以字符串形式）如果上述条件全不满足。

## 分析

给定一个指定长度的字符串数组，如果数字是`3`和`5`的不同情况的倍数，则返回定义的字符。

问题的关键在于如何高校的分解或者是判定字符与`3`,`5`的关系。可以暴力的分解判定，或者是取巧的累积。

比如说，生成指定的字符序列后，先步进`3`找到`Fizz`,再步进`5`寻找`Buzz`,如果已经是`Fizz`了，则添加为`FizzBuzz`。

### 1. 分解法

```java
    public List<String> fizzBuzz(int n) {
        int i = 1;
        List<String> list = new ArrayList<>();
        while (i <= n) {
            String tmp = "";
            if (i % 3 == 0)
                tmp = "Fizz";
            if (i % 5 == 0)
                tmp += "Buzz";
            if (tmp == "")
                tmp = String.valueOf(i);
            list.add(tmp);
            i++;
        }
        return list;
    }
```

> 执行用时：2 ms, 在所有 Java 提交中击败了58.25%的用户
>
> 内存消耗：39.4 MB, 在所有 Java 提交中击败了80.59%的用户

### 2. 遍历插槽

对上一个方法的优化，去掉对字符的计算，直接步进的方式找到对应的插槽修改值。

```java
    public List<String> fizzBuzz2(int n) {

        String[] s = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = String.valueOf(i + 1);
        }
        for (int i = 3; i <= n; i += 3) {
            s[i - 1] = "Fizz";
        }

        for (int i = 5; i <= n; i += 5) {
            if (s[i - 1] == "Fizz")
                s[i - 1] = "FizzBuzz";
            else
                s[i - 1] = "Buzz";
        }
        return Arrays.asList(s);
    }
```

> 执行用时：1 ms, 在所有 Java 提交中击败了99.84%的用户
>
> 内存消耗：39.4 MB, 在所有 Java 提交中击败了89.27%的用户
