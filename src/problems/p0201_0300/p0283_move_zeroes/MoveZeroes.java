package problems.p0201_0300.p0283_move_zeroes;

import utils.ArrayUtils;
import utils.PrintUtils;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int continuousZero = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                continuousZero++;
            else
                ArrayUtils.swap(nums, i, i - continuousZero);
        }
    }

    static void swap(int[] nums, int aIndex, int bIndex) {
        if (nums[aIndex] == nums[bIndex])
            return;
        nums[aIndex] ^= nums[bIndex];
        nums[bIndex] ^= nums[aIndex];
        nums[aIndex] ^= nums[bIndex];
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 5 };
        moveZeroes(nums);
        PrintUtils.printArray(nums);
    }
}
