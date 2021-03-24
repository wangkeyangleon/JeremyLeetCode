package leetcode.algorithm;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 53
 * <p>
 * Given an integer array nums, find the contiguous subarray (containing at least one number)
 * which has the largest sum and return its sum.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 * Example 2:
 * <p>
 * Input: nums = [1]
 * Output: 1
 * Example 3:
 * <p>
 * Input: nums = [5,4,-1,7,8]
 * Output: 23
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 3 * 104
 * -105 <= nums[i] <= 105
 * @author: Keyang Wang
 * @create: 2021-03-24 20:50
 **/
public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1)
            return nums[0];
        int result = nums[0];
        int sum = 0;
        for (int number : nums) {
            if (sum > 0) {
                sum += number;
            } else {
                sum = number;
            }
            result = Math.max(sum, result);
        }
        return result;
    }

    public static void main(String[] args) {
        //gold mine
        int n = 5;
        //workers
        int w = 10;
        //gold mine's money
        int[] g = {400, 500, 200, 300, 350};
        //the number of workers that each mine needs
        int[] p = {5, 5, 3, 4, 3};
        int[] preResults = new int[w];
        int[] results = new int[w];
        for (int i = 0; i < w; i++) {
            if (i < p[0]) {
                preResults[i] = 0;
            } else {
                preResults[i] = g[0];
            }
        }
        //the outer loop is the number of mines,the inner loop is the number of workers
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < w; j++) {
                if (j < p[i]) {
                    results[j] = preResults[j];
                } else {
                    results[j] = Math.max(preResults[j], preResults[j - p[i]] + g[i]);
                }
            }
            preResults = results;
        }

        System.out.println(results[n]);
    }
}
