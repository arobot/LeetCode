### 关键字
- 移动0到末尾
- 其他元素相对顺序不变
- `in place`操作
- 尽量少操作

### 分析
- 冒泡算法
- 在此基础上减少操作次数，则要考虑连续0的情况

#### 1. 连续0差值交换

```java
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                if(i>j){
                    nums[j] = nums[i];
                    nums[i] = 0;
                }
                j++;
            }
        }
    }
```

#### 2. 先交换值，统一置0

在方法1中，增加了不少重复的置0操作。实际上`j`值已经记录了最后一个插入位置索引，将`j`值以后的全部置0即可减少次数。

```java
    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
```