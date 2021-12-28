package problems.p0101_0200.p0189_rotate_array;

public class RotateArray {
    static void rotate(int[] nums, int k) {
        k %= nums.length;
        int[] a = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            a[i] = nums[(nums.length - k + i) % nums.length];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }
    }

    static void rotate2(int[] nums, int k) {
        k %= nums.length;
        int length = nums.length;
        int n = 0;
        if (k == 0)
            return;
        while (k>0) {
            for (int i = 0; i < k; i++) {
                swap(nums, n + i, length - k + i);
            }
            n += k;
            k %= (length - n);
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
        int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26,
                27 };
        int k = 32;
        rotate2(nums, k);
        for (int n : nums) {
            System.out.print(n + ", ");
        }
    }
}
