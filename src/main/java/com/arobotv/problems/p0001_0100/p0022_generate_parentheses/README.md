# 括号生成

## 分析

合法的括号生成位置只有两种情况。

- 如果有成对的括号，则在成对的括号中间插入。`()`->`(())`;
- 在成对的括号右侧插入。`()`->`()()`

所以，只需要在遍历的过程中，将上述位置的括号统统进行补全即可。当然，还有一些情况下，插入之后会出现和之前一样的形式，导致重复的结果出现，需要考虑一下怎么去重。

### 1. 回溯

```java
    public List<String> generateParenthesis(int n) {
        strSet = new HashSet<>();
        back(n, "");
        return new ArrayList<>(strSet);
    }

    Set<String> strSet;

    public void back(int n, String str) {
        if (str.length() == 2 * n) {
            strSet.add(str);
            return;
        }
        if (str == "")
            back(n, "()");
        else
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(' && str.charAt(i + 1) == ')' || str.charAt(i) == ')') {
                    back(n, str.substring(0, i) + "()" + str.substring(i));
                }
            }
    }
```

> 执行用时：43 ms, 在所有 Java 提交中击败了5.60%的用户
>
> 内存消耗：42.4 MB, 在所有 Java 提交中击败了5.07%的用户
