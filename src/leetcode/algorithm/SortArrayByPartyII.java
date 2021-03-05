package leetcode.algorithm;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 922
 * <p>
 * Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
 * <p>
 * Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
 * <p>
 * Return any answer array that satisfies this condition.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [4,2,5,7]
 * Output: [4,5,2,7]
 * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 * Example 2:
 * <p>
 * Input: nums = [2,3]
 * Output: [2,3]
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 2 <= nums.length <= 2 * 104
 * nums.length is even.
 * Half of the integers in nums are even.
 * 0 <= nums[i] <= 1000
 * @author: Keyang Wang
 * @create: 2021-03-05 20:18
 **/
public class SortArrayByPartyII {
    public int[] sortArrayByParityII(int[] nums) {
        int [] tempNums = new int[nums.length];
        int even = 1;
        int odd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0){
                tempNums[odd] = nums[i];
                odd+=2;
            }else {
                tempNums[even] = nums[i];
                even+=2;
            }
        }
        return tempNums;
    }

    public static void main(String[] args) {
        SortArrayByPartyII sortArrayByPartyII = new SortArrayByPartyII();
        int [] nums = {4,2,5,7};
        System.out.println(Arrays.toString(sortArrayByPartyII.sortArrayByParityII(nums)));
    }
}
