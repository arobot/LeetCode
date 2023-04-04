package com.arobotv.problems.p0001_p0100.p0078_subsets;

import java.util.ArrayList;
import java.util.List;

public class SubSets {
    public List<List<Integer>> subsets(int[] nums) {
        result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>());
        return result;
    }

    List<List<Integer>> result;

    void backtrack(int[] nums, int index, List<Integer> temp) {
        result.add(new ArrayList<>(temp));
        if (temp.size() == nums.length)
            return;
        for (int i = index; i < nums.length; i++) {
            temp.add(nums[i]);
            backtrack(nums, i + 1, temp);
            temp.remove(temp.size() - 1);
        }
    }
}
