package leetcode.dataStructure;

import java.util.HashMap;

/**
 * @program: LeetCode
 * @description: 剑指offer03
 * 找出数组中重复的数字。
 *
 *
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 *
 * 示例 1：
 *
 * 输入：
 * [2, 3, 1, 0, 2, 5, 3]
 * 输出：2 或 3
 * @author: Keyang Wang
 * @create: 2021-07-24 21:56
 **/
public class DuplicateNumber {
    public int findRepeatNumber(int[] nums) {
        //key is number of nums array, value is the count of nums
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                return num;
            } else {
                hashMap.put(num, 0);
            }
        }
        return 0;
    }
    // space complexity is O(1)
    public int findRepeatNumber2(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] != i){
                //check if the num[i] == num[num[i]], if yes return, if not swap it
                int temp = nums[i];
                if (nums[i] == nums[nums[i]]){
                    return nums[i];
                }
                //swap
                nums[i] = nums[temp];
                nums[temp] = temp;
            }
        }
        return 0;
    }


    public static void main(String[] args) {

    }
}
