package leetcode.algorithm;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 912
 * @author: Keyang Wang
 * @create: 2021-03-03 21:24
 **/
public class SortAnArray {
    public int[] sortArray(int[] nums) {
        quickSort(nums,0,nums.length-1);
        return nums;
    }

    private void quickSort(int[] array, int left, int right) {

        if (left >= right) {
            return;
        }
        int pivot = array[left];
        int low = left;
        int high = right;
        while (low < high) {
            while (array[high] >= pivot && low < high) {
                high--;
            }
            while (array[low] <= pivot && low < high) {
                low++;
            }
            int temp = array[low];
            array[low] = array[high];
            array[high] = temp;
        }
        array[left] = array[low];
        array[low] = pivot;
        quickSort(array,left,low-1);
        quickSort(array,low+1,right);

    }

    public static void main(String[] args) {
        SortAnArray sortAnArray = new SortAnArray();
        int nums[] = {5,2,3,1};
        sortAnArray.quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(sortAnArray.sortArray(nums)));
    }
}
