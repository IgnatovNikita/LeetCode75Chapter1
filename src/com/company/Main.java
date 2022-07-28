package com.company;

import java.util.Arrays;

public class Main {
    public static int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            res[i] = res[i-1] + nums[i];
        }
        return res;
    }

    public static int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;
        for (int i = 1; i < nums.length; i++) {
            right += nums[i];
        }
        if (right == 0) return 0;
        right -= nums[0];
        for (int i = 1; i < nums.length; i++){
            left += nums[i-1];
            right -= nums[i];
            if (left == right) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
	// write your code here
        /*
            Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
            Return the running sum of nums.
        */
        System.out.println(Arrays.toString(runningSum(new int[]{1, 2, 3, 4})));

        /*
            Given an array of integers nums, calculate the pivot index of this array.
            The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
            If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
            Return the leftmost pivot index. If no such index exists, return -1.
         */
        System.out.println(pivotIndex(new int[]{2,1,-1}));

    }
}
