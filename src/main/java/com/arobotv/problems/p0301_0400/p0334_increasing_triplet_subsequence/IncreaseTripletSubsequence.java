package com.arobotv.problems.p0301_0400.p0334_increasing_triplet_subsequence;

public class IncreaseTripletSubsequence {
    public boolean increasingTriplet(int[] nums) {
        if (nums.length < 3)
            return false;
        int small  = Integer.MAX_VALUE,mid = Integer.MAX_VALUE;
        for(int num :nums){
            if(num<=small){
                small = num;
            }else if(num<=mid){
                mid = num;
            }else{
                return true;
            }
        }
        return false;
    }
}
