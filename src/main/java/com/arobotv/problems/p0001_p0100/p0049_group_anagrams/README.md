# 字母异位词分组

给你一个字符串数组，请你将 字母异位词 组合在一起。可以按任意顺序返回结果列表。

字母异位词 是由重新排列源单词的字母得到的一个新单词，所有源单词中的字母通常恰好只用一次。

## 分析

在[是否字母异位词](../../p0201_0300/p0242_valid_anagram/README.md)中的解法二，讲到有做质因数分解的方法。刚好可以加以运算作为hashmap的key使用。

### 1. 使用质因数

```java
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> map = new HashMap<>();
        for (String s : strs) {
            int a = 1;
            for (char c : s.toCharArray()) {
                a *= (c * 36 + 1);
            }
            if (map.containsKey(a)) {
                map.get(a).add(s);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(a, list);
            }
        }
        return  new ArrayList<>(map.values());
    }
```

> 执行用时：4 ms, 在所有 Java 提交中击败了99.94%的用户
>
> 内存消耗：44 MB, 在所有 Java 提交中击败了5.01%的用户
