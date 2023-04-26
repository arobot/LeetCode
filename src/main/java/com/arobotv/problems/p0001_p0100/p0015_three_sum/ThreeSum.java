package com.arobotv.problems.p0001_p0100.p0015_three_sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
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

    public List<List<Integer>> threeSum2(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int j = 0;
        int k = nums.length-1;
        for (int i = 0; i < nums.length; i++) {
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            j = i+1;
            k = nums.length-1;
            for (int second = j; second < k; second++) {
                if(second>j&&nums[second]==nums[second-1]){
                    continue;
                }
                while(second<k&&nums[i]+nums[second]+nums[k]>0){
                    k--;
                }
                if(second==k){
                    break;
                }
                if(nums[i]+nums[second]+nums[k]==0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[second]);
                    list.add(nums[k]);
                    result.add(list);
                }
            }
        }
        return result;
    }
}
