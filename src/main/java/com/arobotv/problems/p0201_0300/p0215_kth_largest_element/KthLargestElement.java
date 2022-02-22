package com.arobotv.problems.p0201_0300.p0215_kth_largest_element;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KthLargestElement {
    public int findKthLargest(int[] nums, int k) {
        return bucketSort(nums, k);
    }

    int bucketSort(int[] nums, int k) {
        int min = nums[0], max = nums[0];
        for (int a : nums) {
            if (max < a)
                max = a;
            if (min > a)
                min = a;
        }
        int step = 50;
        int bucketNum = max / step - min / step + 1;
        List<List<Integer>> bucketList = new ArrayList<>();
        for (int i = 0; i <= bucketNum; i++) {
            bucketList.add(new ArrayList<>());
        }

        for (int i = 0; i < nums.length; i++) {
            int index = indexFor(nums[i], min, step);
            bucketList.get(index).add(nums[i]);
        }

        List<Integer> bucket = null;
        int index = 0;
        for (int i = bucketNum ; i >= 0; i--) {
            bucket = bucketList.get(i);
            insertSort(bucket);
            for (int a : bucket) {
                System.out.println(index+":"+a);
                if (index == k - 1)
                    return a;
                nums[index++] = a;

            }
        }
        return -1;
    }

    int indexFor(int a, int min, int step) {
        return (a - min) / step;
    }

    void insertSort(List<Integer> bucket) {
        for (int i = 1; i < bucket.size(); i++) {
            int temp = bucket.get(i);
            int j = i - 1;
            for (; j >= 0 && bucket.get(j) < temp; j--) {
                bucket.set(j + 1, bucket.get(j));
            }
            bucket.set(j + 1, temp);
        }
    }


    public int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue =new PriorityQueue<>();
        for(int i:nums){
            priorityQueue.add(i);
            if(priorityQueue.size()>k){
                priorityQueue.poll();
            }
        }
        return priorityQueue.peek();
    }
}
