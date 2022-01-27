# 三数之和

给你一个包含 `n` 个整数的数组 `nums`，判断 `nums` 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有和为 `0` 且不重复的三元组。

注意：答案中不可以包含重复的三元组。

## 分析

要想相加等于零，必然存在正负数之和。故可以将`nums`先行排序之后，以最小值为锚点，使用双指针方式依次往后。其中，右指针固定在正数区间，左指针固定在锚点与正数之间。

### 1. 双指针

首先将数组进行排序，获得一个从低到高排序的数组。

从最低值开始，锚定一个数，从该数的右方使用双指针方式，分别从最小和最大处向中间收缩。和大于0时，左移右指针，反之则右移左指正。

```java
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> last = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0, j = 0, k = nums.length - 1;
        int nextI = 0;
        int nextK = k;
        while (i < nums.length && nums[i] <= 0) {
            j = i + 1;
            while (j < k && nums[k] >= 0) {
                int t = nums[i] + nums[j] + nums[k];
                if (nums[k] > -2 * nums[nextI]) {
                    nextK = k;
                }
                if (nextI == i && nums[j] > nums[i]) {
                    nextI = j;
                }
                if (t > 0) {
                    k--;
                } else if (t < 0) {
                    j++;
                } else {
                    if (last.isEmpty()) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    } else {
                        last.removeAll(Arrays.asList(nums[i], nums[j], nums[k]));
                        if (!last.isEmpty())
                            result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    }
                    last = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;

                }
            }
            i = nextI > i ? nextI : j;
            k = nextK;
        }
        return result;
    }
```

> 执行用时：27 ms, 在所有 Java 提交中击败了24.14%的用户
>
> 内存消耗：42.4 MB, 在所有 Java 提交中击败了43.45%的用户

### 2.优化双指针

前面在做重复值判定时，用了很笨的办法。实际上，当有一组符合条件的数据被记录时，后面所有相同的`nums[j]`和`nums[k]`就都应该被跳过。

```java
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int i = 0, j = 0, k = nums.length - 1;
        int nextI = 0;
        int nextK = k;
        while (i < nums.length && nums[i] <= 0) {
            j = i + 1;
            while (j < k && nums[k] >= 0) {
                int t = nums[i] + nums[j] + nums[k];
                if (nums[k] > -2 * nums[nextI]) {
                    nextK = k;
                }
                if (nextI == i && nums[j] > nums[i]) {
                    nextI = j;
                }
                if (t > 0) {
                    k--;
                } else if (t < 0) {
                    j++;
                } else {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    int jTemp = nums[j];
                    int kTemp = nums[k];
                    while (j < nums.length - 1 && nums[++j] == jTemp)
                        ;
                    while (k > j && nums[--k] == kTemp)
                        ;

                }
            }
            i = nextI > i ? nextI : j;
            k = nextK;
        }
        return result;
    }
```

> 执行用时：20 ms, 在所有 Java 提交中击败了82.86%的用户
>
> 内存消耗：42.2 MB, 在所有 Java 提交中击败了65.49%的用户
