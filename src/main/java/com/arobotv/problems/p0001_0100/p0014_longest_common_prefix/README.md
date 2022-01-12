# 最长公共前缀

编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 `""`。

## 分析

很直观的观察，可以发现遍历全部数组元素，并依次判断每一个字母是否相同即可。但是，这样一来，每次都得全文检索一遍，效率不高。

或者可以考虑从前两个元素开始遍历，依次求解获取公共前缀。通过每两个的公共前缀依次往后查找。

### 1. 从头到尾依次找出公共前缀

逻辑依然如上述所讲，先假设第0个元素就是最长公共前缀，然后依次比较第1...n个，依次求解其公共前缀。这里自己写了一个求解公共前缀的方法进行运算。

```Java
    public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 0)
            return "";
        int i = 0;
        String prefix = strs[0];
        while (i < n - 1 && ((prefix = commonPrefix(prefix, strs[++i])) != "")) {
        }
        return prefix;
    }

    static String commonPrefix(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();
        if (aLen == 0 || bLen == 0)
            return "";
        int n = Math.min(aLen, bLen);
        char[] c = new char[n];
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) == b.charAt(i))
                c[i] = a.charAt(i);
            else
                return new String(c, 0, i);
        }
        return new String(c, 0, n);
    }
```

>执行用时：1 ms, 在所有 Java 提交中击败了69.34%的用户
>
>内存消耗：36.7 MB, 在所有 Java 提交中击败了18.94%的用户

### 2. 使用`indexOf`函数

该函数代码上较为巧妙，工整。故记录作为思考.

```Java
    public static String longestCommonPrefix2(String[] strs) {
        int n = strs.length;
        if (n == 0)
            return "";
        String prefix = strs[0];
        for (int i = 1; i < n; i++) {
            //不断的判断这个前缀是否与strs[i]有公共部分
            while (strs[i].indexOf(prefix) != 0)
                //没有公共部分，就去掉最后一位，再进行判断
                prefix = prefix.substring(0, prefix.length() - 1);
        }
        return prefix;
    }
```

>执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
>
>内存消耗：36.4 MB, 在所有 Java 提交中击败了72.29%的用户