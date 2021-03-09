package leetcode.algorithm;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 976
 * Given an integer array nums, return the largest perimeter of a triangle with a non-zero area,
 * formed from three of these lengths. If it is impossible to form any triangle of a non-zero area, return 0.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,1,2]
 * Output: 5
 * Example 2:
 * <p>
 * Input: nums = [1,2,1]
 * Output: 0
 * Example 3:
 * <p>
 * Input: nums = [3,2,3,4]
 * Output: 10
 * Example 4:
 * <p>
 * Input: nums = [3,6,2,3]
 * Output: 8
 * @author: Keyang Wang
 * @create: 2021-03-07 16:06
 **/
public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] nums) {
        sortNums(nums, 0, nums.length - 1);
        Arrays.sort(nums);
        int length = nums.length;
        int a = nums[length - 1];
        int b = nums[length - 2];
        int c = nums[length - 3];
        if ((b + c) > a) {
            return a + b + c;
        } else {
            while (length > 3) {
                length--;
                a = nums[length - 1];
                b = nums[length - 2];
                c = nums[length - 3];
                if ((b + c) > a) {
                    return a + b + c;
                }
            }
            return 0;
        }
    }

    private void sortNums(int[] nums, int low, int high) {
        int i, j, pivot;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        pivot = nums[low];
        while (i < j) {
            while (nums[j] >= pivot && i < j) {
                j--;
            }
            while (nums[i] <= pivot && i < j) {
                i++;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        nums[low] = nums[i];
        nums[i] = pivot;
        sortNums(nums, low, i - 1);
        sortNums(nums, i + 1, high);

    }

    public static void main(String[] args) {
        LargestPerimeterTriangle largestPerimeterTriangle = new LargestPerimeterTriangle();
        int nums[] = {1, 2, 1};
        largestPerimeterTriangle.sortNums(nums, 0, nums.length - 1);
        //System.out.println(Arrays.toString(nums));
        System.out.println(largestPerimeterTriangle.largestPerimeter(nums));
        //    int nums[] = {2,1,2};
    }


}
