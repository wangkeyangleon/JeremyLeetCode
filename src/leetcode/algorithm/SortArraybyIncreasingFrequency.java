package leetcode.algorithm;

import java.util.*;

/**
 * @program: LeetCode
 * @description: 1636
 * <p>
 * Given an array of integers nums, sort the array in increasing order based on the frequency of the values.
 * If multiple values have the same frequency, sort them in decreasing order.
 * <p>
 * Return the sorted array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,2,2,2,3]
 * Output: [3,1,1,2,2,2]
 * Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
 * Example 2:
 * <p>
 * Input: nums = [2,3,1,3,2]
 * Output: [1,3,3,2,2]
 * Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
 * Example 3:
 * <p>
 * Input: nums = [-1,1,-6,4,5,-6,1,4,1]
 * Output: [5,-1,4,4,-6,-6,1,1,1]
 * @author: Keyang Wang
 * @create: 2021-03-10 20:15
 **/
public class SortArraybyIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        int[] frequency = new int[201];
        //calculate the frequency of every number in the array
        for (int num : nums) {
            frequency[num+100] ++;
        }
        System.out.println("frequency");
        System.out.println(Arrays.toString(frequency));
        //create a new array
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 201*frequency[nums[i]+100]-nums[i]+100;
        }
        System.out.println("before sort");
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        //array reduction
        for (int i = 0; i < nums.length; i++) {
            nums[i] = 100-nums[i]%201;
        }
        System.out.println("result");
        System.out.println(Arrays.toString(nums));
        return nums;
    }

    public static void main(String[] args) {
        SortArraybyIncreasingFrequency sortArraybyIncreasingFrequency = new SortArraybyIncreasingFrequency();
        int nums[] = {1,1,2,2,2,3,5};
        sortArraybyIncreasingFrequency.frequencySort(nums);


    }
}
