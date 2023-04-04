package com.arobotv.problems.p0001_p0100.p0055_jump_game;

public class JumpGame {
    public boolean canJump(int[] nums) {
        int bonus = 0;
        // 如果能循环到最后一个，说明就到了
        for (int i = 0; i < nums.length - 1; i++) {
            //
            if (Math.max(nums[i], i + bonus) > nums.length - 1)
                break;
            if (nums[i] == 0 && bonus <= 0) {
                return false;
            }
            bonus = nums[i] > bonus ? nums[i] - 1 : bonus - 1;
        }
        return true;
    }

    public boolean canJump2(int[] nums) {
        int rightMost = nums[0];
        // 这里i依然从0开始而不是1，因为有只存在一个数据的情况
        for (int i = 0; i <= rightMost; ++i) {
            rightMost = Math.max(rightMost, i + nums[i]);
            if (rightMost >= nums.length - 1)
                return true;
        }
        return false;
    }
}
