### 关键字
- 最高位在首位
- 除了0之外，不会以0开头

### 分析
- 考虑进位的问题
- 不进位可以就地修改
- 进位则需要做数组拷贝

#### 1. 末尾累加
依次从最高位开始计算。判断进位是否为1，如果没有进位，则跳出循环。

所有的元素遍历完毕后，进位仍然为1时，需要拷贝原数组到new array[length+1].

```java
    public static int[] plusOne(int[] digits) {
        int add = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (add > 0) {
                digits[i] += add;
                add = digits[i] / 10;
                digits[i] %= 10;
                if (add == 0)
                    break;
            }
        }
        if (add == 1) {
            int[] nums = new int[digits.length + 1];
            nums[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                nums[i + 1] = digits[i];
            }
            return nums;
        }
        return digits;
    }
```

#### 2. 跳出机制
实际上，如果原始数组中遇到存在任意一位不是9，则可以直接返回。当前位是9则直接置0并继续循环。

如果循环完成了也没有返回，只可能是999变成1000。

故，代码可以精简为

```java

```