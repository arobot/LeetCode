package problems.p0101_0200.p0217_contains_duplicate;

import java.util.HashSet;

public class ContainDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<>();
        for (int n : nums) {
            if (hashSet.contains(n))
                return true;
            hashSet.add(n);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
}