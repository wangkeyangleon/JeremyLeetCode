package leetcode.dataStructure;

import java.util.HashMap;

/**
 * @program: LeetCode
 * @description: 1748
 * <p>
 * You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
 * <p>
 * Return the sum of all the unique elements of nums.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,3,2]
 * Output: 4
 * Explanation: The unique elements are [1,3], and the sum is 4.
 * Example 2:
 * <p>
 * Input: nums = [1,1,1,1,1]
 * Output: 0
 * Explanation: There are no unique elements, and the sum is 0.
 * Example 3:
 * <p>
 * Input: nums = [1,2,3,4,5]
 * Output: 15
 * Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 100
 * 1 <= nums[i] <= 100
 * @author: Keyang Wang
 * @create: 2021-03-15 21:51
 **/
public class SumOfUniqueElements {
    public int sumOfUnique(int[] nums) {
        int result=0;
        if (nums.length == 1) {
            return nums[nums.length - 1];
        }
        //key is the element and the value is the count of elements
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num:nums) {
            if (hashMap.containsKey(num)){
                int count = hashMap.get(num)+1;
                hashMap.put(num,count);
            }else {
                hashMap.put(num,1);
            }
        }
        for (Integer element:hashMap.keySet()
             ) {
            if (hashMap.get(element)==1){
                result = result + element;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SumOfUniqueElements sumOfUniqueElements = new SumOfUniqueElements();
        int []nums = {1,2,3,2};
        System.out.println(sumOfUniqueElements.sumOfUnique(nums));
    }
}
