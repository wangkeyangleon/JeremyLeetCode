package leetcode;

/**
 * @program: LeetCode
 * @description: 26
 * Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * Example 1:
 * <p>
 * Given nums = [1,1,2],
 * <p>
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
 * <p>
 * It doesn't matter what you leave beyond the returned length.
 * Example 2:
 * <p>
 * Given nums = [0,0,1,1,1,2,2,3,3,4],
 * <p>
 * Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
 * <p>
 * It doesn't matter what values are set beyond the returned length.
 * @author: Keyang Wang
 * @create: 2021-01-01 12:36
 **/

public class RemoveDuplicateFromSortedArray {

    public int remove(int[] nums) {

        if (nums.length == 0)
            return 0;
        int a = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[a] != nums[i]) {
                a++;
                nums[a] = nums[i];
            }
        }
        System.out.println("++++++++++");
        for (int i : nums
        ) {
            System.out.println(i);
        }
        System.out.println("++++++++++");
        return a + 1;


    }

    public static void main(String[] args) {
        RemoveDuplicateFromSortedArray removeDuplicateFromSortedArray = new RemoveDuplicateFromSortedArray();
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicateFromSortedArray.remove(nums));
        int[] num2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicateFromSortedArray.remove(num2));

    }

}
