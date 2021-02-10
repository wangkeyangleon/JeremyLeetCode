package leetcode.dataStructure;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 283
 * <p>
 * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * <p>
 * Example:
 * <p>
 * Input: [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Note:
 * <p>
 * You must do this in-place without making a copy of the array.
 * Minimize the total number of operations.
 * @author: Keyang Wang
 * @create: 2021-02-10 20:02
 **/
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int j = 0;
        while (j < nums.length) {
            for (int i = j; i < nums.length - 1; i++) {
                if (nums[i] == 0) {
                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
            j++;
        }
        if (nums[0] == 0) {
            for (int i = 0; i < nums.length - 1; i++) {
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    public void moveZeroes1(int[] nums) {
        int n = nums.length, left = 0, right = 0;
        while (right < n) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
        System.out.println(Arrays.toString(nums));
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }


    public static void main(String[] args) {
        int nums[] = {0,0,2,3};
        MoveZeroes a = new MoveZeroes();
        a.moveZeroes1(nums);

    }
}
