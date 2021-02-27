package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 349
 *
 * Given two arrays, write a function to compute their intersection.
 *
 * Example 1:
 *
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 *
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Note:
 *
 * Each element in the result must be unique.
 * The result can be in any order.
 * @author: Keyang Wang
 * @create: 2021-02-27 20:10
 **/
public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        int [] intersections = new int[0];
        if (nums1==null||nums2==null||nums1.length==0||nums2.length==0){
            return intersections;
        }
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if (nums1[0]>nums2[nums2.length-1]||nums1[nums1.length-1]<nums2[0]){
            return intersections;
        }
        List<Integer> result = new ArrayList<>();
        for (int target : nums1) {
            int left = 0;
            int right = nums2.length - 1;
            int mid = (left + right) / 2;
            while (left <= right) {
                mid = (left +right) / 2;
                if (target < nums2[mid]) {
                    right = mid - 1;
                } else if (target > nums2[mid]) {
                    left = mid + 1;
                } else {
                    if (!result.contains(nums2[mid])) {
                        result.add(nums2[mid]);
                    }
                    break;
                }
            }
        }
        intersections =new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            intersections[i] = result.get(i);
        }
        return intersections;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        int []nums1 = {};
        int [] nums2 = {};
        System.out.println(Arrays.toString(intersectionOfTwoArrays.intersection(nums1,nums2)));

    }
}
