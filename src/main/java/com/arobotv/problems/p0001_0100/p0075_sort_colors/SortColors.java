package com.arobotv.problems.p0001_0100.p0075_sort_colors;

public class SortColors {
    public void sortColors(int[] nums) {
        int firstGap = 0, secondGap = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                firstGap++;
                secondGap++;
            } else if (nums[i] == 1) {
                secondGap++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < firstGap)
                nums[i] = 0;
            else if (i < secondGap)
                nums[i] = 1;
            else
                nums[i] = 2;
        }
    }

    public void sortColors2(int[] nums) {
        int a = 0, b = nums.length - 1;
        for (int i = 0; i <= b; i++) {
            if (nums[i] == 0) {
                nums[i] = nums[a];
                nums[a] = 0;
                a++;
            } else if (nums[i] == 2) {
                nums[i] = nums[b];
                nums[b] = 2;
                i--;
                b--;
            }
        }
    }
}
