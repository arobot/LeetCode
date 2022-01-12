# 验证回文串

给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

说明：本题中，我们将空字符串定义为有效的回文串。

## 关键字

- 字母和数字
- 忽略大小写

## 分析

回文串即对称字串。输入的是一段语句，需要对语句做预处理，预处理部分的时间复杂度即为${O(N)}$, 所以考虑整个算法的效率就要控制在${O(N)}$的阶段即为最优。

对于空间复杂度来说，首先考虑不新开辟内存空间，借助${O(1)}$的空间复杂度为最优。

### 1. 双指针一次遍历解决

想要一次遍历解决，就必然要借助 `双指针` 的思路从头尾进行遍历。又因为输入的是一段句子，还需要考虑排除掉标点符号和空格的情况。所以需要对每一个 `char` 做合法性判定。

头尾的两个指针需要分别行进找到各自符合条件的字符后，方能进行判断。

```Java
   public static boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char a = ' ';
            ;
            while (!validChar(a = s.charAt(i)) & i++ < j) {

            }
            char b = ' ';
            while (!validChar(b = s.charAt(j)) & i <= j--) {

            }
            if (!equalsChar(a, b))
                return false;
        }
        return true;
    }

    static boolean validChar(char c) {
        return (47 < c && c < 58) || // 0-9
                (64 < c && c < 91) || // A-Z
                (96 < c && c < 123);// a-z
    }

    static boolean equalsChar(char a, char b) {
        if (a == b)//相等必然equals
            return true;
        if (a < 58 || b < 58)//不等，又都是数字的情况
            return false;
        if (a < b)//进行大小写判定
            return a == b - ('a' - 'A');
        else
            return a == b + ('a' - 'A');
    }
```
