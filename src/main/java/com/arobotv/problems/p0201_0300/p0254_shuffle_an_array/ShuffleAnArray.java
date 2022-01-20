package com.arobotv.problems.p0201_0300.p0254_shuffle_an_array;

import java.util.Arrays;
import java.util.Random;

import com.arobotv.utils.PrintUtils;

public class ShuffleAnArray {
    private final int[] mutable;
    
    private static final Random RANDOM = new Random();

    public ShuffleAnArray(int[] nums) {
        mutable = nums;
    }

    public int[] reset() {
        return mutable;
    }

    public int[] shuffle() {
        int[] arr=Arrays.copyOf(mutable, mutable.length);
        for (int i = 0; i < arr.length; i++) {
            int j = RANDOM.nextInt(arr.length);
            int a = arr[i];
            arr[i] = arr[j];
            arr[j] = a;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        ShuffleAnArray shuffleAnArray = new ShuffleAnArray(nums);
        while (true) {
            shuffleAnArray.reset();
            PrintUtils.printArray(shuffleAnArray.shuffle());
        }

    }
}
