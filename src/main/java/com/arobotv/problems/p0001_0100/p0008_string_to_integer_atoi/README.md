# 字符串转换整数（Atoi)

请你来实现一个`myAtoi(string s)`函数，使其能将字符串转换成一个 32 位有符号整数（类似 C/C++ 中的 `atoi` 函数）。

函数`myAtoi(string s)` 的算法如下：

- 读入字符串并丢弃无用的前导空格
- 检查下一个字符（假设还未到字符末尾）为正还是负号，读取该字符（如果有）。 确定最终结果是负数还是正数。 如果两者都不存在，则假定结果为正。
- 读入下一个字符，直到到达下一个非数字字符或到达输入的结尾。字符串的其余部分将被忽略。
- 将前面步骤读入的这些数字转换为整数（即，"123" -> 123， "0032" -> 32）。如果没有读入数字，则整数为 `0` 。必要时更改符号（从步骤 2 开始）。
- 如果整数数超过 32 位有符号整数范围 [$−2^{31}$, $2^{31}− 1$] ，需要截断这个整数，使其保持在这个范围内。具体来说，小于 $−2^{31}$ 的整数应该被固定为 $−2^{31}$ ，大于 $2^{31}− 1$ 的整数应该被固定为 $2^{31}− 1$ 。
- 返回整数作为最终结果。

注意：

- 本题中的空白字符只包括空格字符 `' '` 。
- 除前导空格或数字后的其余字符串外，请勿忽略任何其他字符。

## 关键字

- `int` 的范围
- 有符号 `+` 或 `-`
- 读到第一个非数字字符即退出
- 当读取到第一个符号位后，再次遇到符号位也需要退出

## 分析

遍历字符串中的每一个 `char` , 并判断其是否是数字或者符号位。有以下几种情况

- 符号位。标明返回值的正负关系
- 读到数字，依次累积数值
- 读到其他字符后，直接返回当前累积的值
- 读到两次符号位，在第二个符号位直接返回
- 只能跳过开头的空格字符

既然需要遍历字符串，可能在没有遍历完毕字符串就会返回，那么最差的情况下时间复杂度为$O(N)$，解析过程仅需要借助有限的空间，空间复杂度为$O(1)$

### 1. 状态分析法

```Java
    public static int myAtoi(String s) {
        int num = 0;
        boolean negative = false;
        boolean flag = false;
        boolean trim = false;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (trim)
                    return (int) num;
                continue;
            } else
                trim = true;

            if (c == '-' || c == '+') {
                if (flag)
                    return (int) num;
                negative = c == '-';
                flag = true;
            }

            if (Character.isLetter(c) || c == '.')
                return (int) num;

            if (Character.isDigit(c)) {
                flag = true;
                int tmp = num;
                num = num * 10 + (negative ? 48 - c : c - 48);
                if (tmp != num / 10) {
                    return tmp > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            }
        }
        return (int) num;
    }
```

### 2. DFA 确定有限状态机

> TODO
