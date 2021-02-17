package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 167
 * <p>
 * Given an array of integers numbers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 * <p>
 * Return the indices of the two numbers (1-indexed) as an integer array answer of size 2, where 1 <= answer[0] < answer[1] <= numbers.length.
 * <p>
 * You may assume that each input would have exactly one solution and you may not use the same element twice.
 * <p>
 * Example 1:
 * <p>
 * Input: numbers = [2,7,11,15], target = 9
 * Output: [1,2]
 * Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.
 * Example 2:
 * <p>
 * Input: numbers = [2,3,4], target = 6
 * Output: [1,3]
 * Example 3:
 * <p>
 * Input: numbers = [-1,0], target = -1
 * Output: [1,2]
 * @author: Keyang Wang
 * @create: 2021-02-17 19:06
 **/
public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = {};
        int index = 0;
        while (index < numbers.length) {
            for (int j = index+1; j < numbers.length; j++) {
                if (numbers[index] + numbers[j] == target) {
                    index += 1;
                    j+=1;
                    result = new int[]{index, j};
                    return result;
                }

            }
            index++;
        }
        return result;
    }
    public int[] twoSum2(int [] numbers,int target){
         int [] result = new int[2];
         int i = 0;
         while (i < numbers.length-1){
             int target2 = target - numbers[i];
             int left = i+1;
             int right = numbers.length-1;
             int middle = 0;
             while (left<=right){
                 middle = (left+right)/2;
                 if (target2<numbers[middle]){
                     right = middle-1;
                 }else if (target2>numbers[middle]){
                     left = middle+1;
                 }else {
                     result[0] = i+1;
                     result[1] = middle+1;
                     return result;
                 }
             }
             i++;

         }

        return  result;
    }

    public static void main(String[] args) {
        TwoSumII twoSumII = new TwoSumII();
        int[] numbers = {0,0,3,4};
        int target = 0;
        int [] numbers2 = {2,7,11,15};
        int target2 = 9;
        //System.out.println(Arrays.toString(twoSumII.twoSum(numbers, target)));
        System.out.println(Arrays.toString(twoSumII.twoSum2(numbers,target)));
    }
}
