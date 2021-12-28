package problems.p0201_0300.p0283_move_zeroes;

import utils.PrintUtils;

public class MoveZeroes {
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

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 5 };
        moveZeroes(nums);
        PrintUtils.printArray(nums);
    }
}
