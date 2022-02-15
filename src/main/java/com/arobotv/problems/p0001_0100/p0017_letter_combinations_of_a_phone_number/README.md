# 电话号码的字母组合

## 分析

以前常见的T9键盘，所有的输入都是通过字母的组合得到。组合的数量可以通过排列组合计算，数量需要具体到每个按键，因为没有按键上的字母数量不尽相同。

### 1. 迭代回溯

```java
    private static Map<String, List<String>> digitString = new HashMap<>();
    static {
        digitString.put("2", Arrays.asList("a", "b", "c"));
        digitString.put("3", Arrays.asList("d", "e", "f"));
        digitString.put("4", Arrays.asList("g", "h", "i"));
        digitString.put("5", Arrays.asList("j", "k", "l"));
        digitString.put("6", Arrays.asList("m", "n", "o"));
        digitString.put("7", Arrays.asList("p", "q", "r", "s"));
        digitString.put("8", Arrays.asList("t", "u", "v"));
        digitString.put("9", Arrays.asList("w", "x", "y", "z"));
    }

    public List<String> letterCombinations(String digits) {
        if (Objects.isNull(digits))
            return new ArrayList<>();
        List<String> strs = new ArrayList<>();
        for (char c : digits.toCharArray()) {
            strs = recrusive(String.valueOf(c), strs);
        }
        return strs;
    }

    public List<String> recrusive(String digit, List<String> pre) {
        List<String> next = new ArrayList<>();
        List<String> digitStrs = digitString.get(digit);
        if (pre.isEmpty())
            next = digitStrs;
        else
            for (String s : digitStrs) {
                for (String p : pre) {
                    next.add(p + s);
                }
            }
        return next;
    }
```

> 执行用时：1 ms, 在所有 Java 提交中击败了57.99%的用户
>
> 内存消耗：39.7 MB, 在所有 Java 提交中击败了17.05%的用户

### 2. 代码简化

实际上，这个方法并没有提升效率。

```java
    private static String[] strings = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
    };

    private List<String> list;

    public List<String> letterCombinations(String digits) {
        list = new ArrayList<>();
        if (Objects.isNull(digits) || Objects.equals(digits, ""))
            return list;

        recrusive2(digits, 0, "");
        return list;
    }

    public void recrusive2(String digits, int index, String sb) {
        if (index == digits.length()) {

            list.add(sb.toString());
            return;
        }
        String letters = strings[digits.charAt(index) - '0'];
        for (int i = 0; i < letters.length(); i++) {
            recrusive2(digits, index + 1, sb + letters.charAt(i));
        }
    }
```

> 执行用时：5 ms, 在所有 Java 提交中击败了19.44%的用户
>
> 内存消耗：40.6 MB, 在所有 Java 提交中击败了5.01%的用户
