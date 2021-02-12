package leetcode.algorithm;

/**
 * @program: LeetCode
 * @description: 35
 * <p>
 * Given a sorted array of distinct integers and a target value, return the index if the target is found.
 * If not, return the index where it would be if it were inserted in order
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 * <p>
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 * <p>
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * Example 4:
 * <p>
 * Input: nums = [1,3,5,6], target = 0
 * Output: 0
 * Example 5:
 * <p>
 * Input: nums = [1], target = 0
 * Output: 0
 * @author: Keyang Wang
 * @create: 2021-02-12 21:19
 **/
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int right = nums.length - 1;
        int left = 0;
        int middle = 0;
        if (target < nums[left]) {
            return 0;
        } else if (target > nums[right]) {
            return nums.length;
        }
        while (left <= right) {
            middle = (left + right) / 2;
            if (target < nums[middle]) {
                right = middle - 1;
            } else if (target > nums[middle]) {
                left = middle + 1;
            } else {
                return middle;
            }
        }
        return left;
    }
}
