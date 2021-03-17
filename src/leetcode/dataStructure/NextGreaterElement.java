package leetcode.dataStructure;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * @program: LeetCode
 * @description: 496
 * <p>
 * You are given two integer arrays nums1 and nums2 both of unique elements, where nums1 is a subset of nums2.
 * <p>
 * Find all the next greater numbers for nums1's elements in the corresponding places of nums2.
 * <p>
 * The Next Greater Number of a number x in nums1 is the first greater number to its right in nums2. If it does not exist, return -1 for this number.
 * Example 1:
 * <p>
 * Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
 * Output: [-1,3,-1]
 * Explanation:
 * For number 4 in the first array, you cannot find the next greater number for it in the second array, so output -1.
 * For number 1 in the first array, the next greater number for it in the second array is 3.
 * For number 2 in the first array, there is no next greater number for it in the second array, so output -1.
 * Example 2:
 * <p>
 * Input: nums1 = [2,4], nums2 = [1,2,3,4]
 * Output: [3,-1]
 * Explanation:
 * For number 2 in the first array, the next greater number for it in the second array is 3.
 * For number 4 in the first array, there is no next greater number for it in the second array, so output -1.
 * @author: Keyang Wang
 * @create: 2021-03-17 20:34
 **/
public class NextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] results = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]){
                    if ((j+1)<nums2.length) {
                        for (int k = j + 1; k < nums2.length; k++) {
                            if (nums1[i] < nums2[k]) {
                                results[i] = nums2[k];
                                break;
                            } else {
                                results[i] = -1;
                            }
                        }
                    }else {
                        results[i] = -1;
                    }
                }
            }
        }
        return results;
    }

    /**
     * using stack to implement this question
     * @param nums1
     * @param nums2
     * @return
     */
    public int[] nextGreaterElement2(int[] nums1, int[] nums2){
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int [] results = new int[nums1.length];
        for (int i = 0; i < nums2.length; i++) {
            while (!stack.isEmpty()&&stack.peek()<nums2[i]){
                hashMap.put(stack.pop(),nums2[i]);
            }
            stack.push(nums2[i]);
        }
        while (!stack.isEmpty()){
            hashMap.put(stack.pop(),-1);
        }
        for (int i = 0; i < nums1.length; i++) {
            results[i] = hashMap.get(nums1[i]);
        }
        return results;
    }

    public static void main(String[] args) {
        int nums1[] = {4,1,2};
        int nums2[] = {1,2,3,4};
        NextGreaterElement nextGreaterElement = new NextGreaterElement();
        System.out.println(Arrays.toString(nextGreaterElement.nextGreaterElement2(nums1, nums2)));

    }
}
