package leetcode.algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * @program: LeetCode
 * @description: 350
 * <p>
 * Given two arrays, write a function to compute their intersection.
 * <p>
 * Example 1:
 * <p>
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 * <p>
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * <p>
 * Note:
 * <p>
 * Each element in the result should appear as many times as it shows in both arrays.
 * The result can be in any order.
 * Follow up:
 * <p>
 * What if the given array is already sorted? How would you optimize your algorithm?
 * What if nums1's size is small compared to nums2's size? Which algorithm is better?
 * What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?
 * @author: Keyang Wang
 * @create: 2021-02-28 19:52
 **/
public class IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] intersections = new int[0];
        if (nums1.length == 0 || nums2.length == 0) {
            return intersections;
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums1) {
            if (hashMap.containsKey(num)) {
                int count = hashMap.get(num);
                hashMap.put(num, count + 1);
            } else {
                hashMap.put(num, 1);
            }
        }
        List<Integer> listIntersection = new ArrayList<>();
        for (int num : nums2) {
            if (hashMap.containsKey(num) && hashMap.get(num) >= 1) {
                listIntersection.add(num);
                int count = hashMap.get(num);
                hashMap.put(num, count - 1);
            }
        }
        intersections = new int[listIntersection.size()];
        for (int i = 0; i < listIntersection.size(); i++) {
            intersections[i] = listIntersection.get(i);
        }
        return intersections;
    }

    public static void main(String[] args) {
        IntersectionOfTwoArraysII intersection = new IntersectionOfTwoArraysII();
        int nums1[] = {4,9,5};
        int nums2[] = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection.intersect(nums1,nums2)));
    }
}
