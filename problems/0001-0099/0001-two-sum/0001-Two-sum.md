### 关键字
- 两数之和
- 返回下标
- 时间复杂度小于O(${n^2}$)

### 思考

#### 1. 暴力求解
暴力求解过程中，需要对数组进行两次循环遍历分别取值相加判断是否符合条件。时间复杂度必然是O(${N^2}$)。

伪代码如下：

```java
twoSum(int[] nums,int target){
    for(int i = 0; i < nums.length; i++){
        for(int j = 0; j < nums.length; j++>){
            if(nums[i] + nums[j]==target)
                return [i,j];
        }
    }
    return [];
}
```

#### 2. 暴力求解优化

在暴力求解的基础上，随着`i`值增加，`j`值实际上是不需要进行回溯的，显然`nums[i]+nums[j]=nums[j]+nums[i]`。时间复杂度为O(N·(N-1)/2),只是将规模减半，但是时间复杂度并没有降低，仍然为O(${N^2}$)

伪代码如下：

```java
twoSum(int[] nums,int target){
    for(int i = 0; i < nums.length - 1; i++){
        for(int j = i+1; j < nums.length; j++>){
            if(nums[i] + nums[j]==target)
                return [i,j];
        }
    }
    return [];
}
```

#### 3. 空间换时间优化

最终的目标，是想要找出一个时间复杂度低于O(${N^2}$)的方案。通常的手段就是通过空间来换时间，通过对题目的分析，想要降低时间复杂度，必须考虑遍历次数如何降低。Hash空间的查找理论上是O(1)的时间复杂度，所以，只要能够将数据遍历并放置在Hash表上，自然可以将回溯的时间降低。