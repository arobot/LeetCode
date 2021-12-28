package utils;

public class ArrayUtils {
    public static void swap(int[] nums, int aIndex, int bIndex) {
        if (nums[aIndex] == nums[bIndex])
            return;
        nums[aIndex] ^= nums[bIndex];
        nums[bIndex] ^= nums[aIndex];
        nums[aIndex] ^= nums[bIndex];
    }

}
