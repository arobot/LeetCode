# 字母异位词

## 关键字

- 字母异位词
- 字符出现次数相同
- 仅包含小写字母

## 分析

### 1. 数组法

字母异位词，指相互间出现的字母一样多，但是排列不同。考虑到仅包含小写字母的话，那么出现的字母只可能是`a~z`.

使用一个数组 `arr` 按照 `ASCII` 遍历第一个字符串，对其出现的次数累加到 `arr[char-'a']`。再对第二个字符串进行同样的遍历，但是依次递减其出现次数。

完成两个字符串的遍历之后，遍历数组 `arr` ,当其任意位置出现非0元素即可判定是**字母异位词**。

```Java
    public static boolean isAnagram(String s, String t) {
        if (s == null || t == null || s.length() != t.length())
            return false;
        if (s.equals(t))
            return true;
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
            arr[t.charAt(i) - 'a']--;
        }
        for (int n : arr) {
            if(n!=0) return false;
        }
        return true;
    }
```

### 2. 质数唯一分解定理

> 为什么 $N*36+1$ 就是一个素数？

运算上仿佛并没有降低太多？空间复杂度也同样是${O(1)}$
