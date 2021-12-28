package problems.p0001_0100.p0026_remove_duplicates_from_sorted_array;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (n > nums[i]) {
                nums[++i] = n;
            }
        }
        return ++i;
    }

    public static void main(String[] args) {
        // int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3,
        // 4,4,5,6,6,6,7,7,7,7,8,8,9,10,11,11,11,11,11,11,12 };
        int[] nums = { 1, 1, 2 };
        int i = removeDuplicates(nums);
        for (int j = 0; j < i; j++) {
            System.out.println(nums[j]);
        }
    }
}
