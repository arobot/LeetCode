package problems.p0001_0100.p0066_plus_one;

import utils.PrintUtils;

public class PlusOne {
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

    public static void main(String[] args) {
        int[] digits = { 9, 9, 9, 9 };
        PrintUtils.printArray(plusOne(digits));
    }
}
