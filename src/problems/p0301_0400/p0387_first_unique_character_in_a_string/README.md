## 关键字
- 字符串
- 第一个不重复的字符

## 分析
- 从末尾到头上遍历
- 使用HashMap存储
- key表示字符，value表示索引位置
- 如果重复，则将value设置为负值
- 最后遍历values中的数据，找出正数的最小值即可

### 1. HashMap

hash的方案如上分析，代码如下：
```java
    public static int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int index = Integer.MAX_VALUE;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                map.put(c, -1);
            } else {
                map.put(c, i);
            }
        }
        for (int i : map.values()) {
            if (i != -1) {
                index = Math.min(index, i);
            }
        }
        return index == Integer.MAX_VALUE ? -1 : index;
    }
```

### 2. 数组方案
其实这个题目是遍历所有的小写字母，可以考虑使用一个26位的数组，使用字母的ascii码作为下标，存储其出现的下标。最后遍历该数组的消耗应该比较小。

```java
        int[] a = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1,
                -1 };
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (a[c - 'a'] == -2)
                continue;
            if (a[c - 'a'] >= 0)
                a[c - 'a'] = -2;
            else
                a[c - 'a'] = i;
        }
        int index = Integer.MAX_VALUE;
        for (int i : a) {
            if (i >= 0) {
                index = Math.min(index, i);
            }
        }
        return index == Integer.MAX_VALUE ? -1 : index;
```

跑下来执行的效率确实增加了很多。从上面的20ms提升到4ms