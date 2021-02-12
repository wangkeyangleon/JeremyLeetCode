package leetcode.algorithm;

/**
 * @program: LeetCode
 * @description: binarySearch
 * @author: Keyang Wang
 * @create: 2021-02-12 19:36
 **/
public class BinarySearch {
    public int  binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        int middle = 0;
        if (nums[left] > target || nums[right] < target){
            return -1;
        }

        while (left<= right){
            middle = (left+right)/2;
            if (nums[middle]>target){
                right = middle-1;
            }else if (nums[middle]<target){
                left = middle+1;
            }else {
                return middle;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,6,7,8,9};
        int target = 4;
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.binarySearch(nums,target));
        System.out.println(7/2);


    }
}
