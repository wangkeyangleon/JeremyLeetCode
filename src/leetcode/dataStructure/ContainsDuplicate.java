package leetcode.dataStructure;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @program: LeetCode
 * @description: 217
 * <p>
 * Given an array of integers, find if the array contains any duplicates.
 * <p>
 * Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3,1]
 * Output: true
 * Example 2:
 * <p>
 * Input: [1,2,3,4]
 * Output: false
 * Example 3:
 * <p>
 * Input: [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 * @author: Keyang Wang
 * @create: 2021-02-08 22:27
 **/
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> map = new HashSet<>();
        for (int num : nums) {
            if (!map.add(num)) {
                return true;
            }

        }
        return false;


    }

    public static void main(String[] args) {
        int[] nums = {};
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        System.out.println(containsDuplicate.containsDuplicate(nums));
    }
}
