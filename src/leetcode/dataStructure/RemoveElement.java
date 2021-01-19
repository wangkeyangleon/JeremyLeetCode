package leetcode.dataStructure;

/**
 * @program: LeetCode
 * @description: 27
 * <p>
 * Given an array nums and a value val, remove all instances of that value in-place and return the new length.
 * <p>
 * Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
 * <p>
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 * <p>
 * Clarification:
 * <p>
 * Confused why the returned value is an integer but your answer is an array?
 * <p>
 * Note that the input array is passed in by reference, which means a modification to the input array will be known to the caller as well.
 * Internally you can think of this:
 * <p>
 * // nums is passed in by reference. (i.e., without making a copy)
 * int len = removeElement(nums, val);
 * <p>
 * // any modification to nums in your function would be known by the caller.
 * // using the length returned by your function, it prints the first len elements.
 * for (int i = 0; i < len; i++) {
 * print(nums[i]);
 * }
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,2,2,3], val = 3
 * Output: 2, nums = [2,2]
 * Explanation: Your function should return length = 2, with the first two elements of nums being 2.
 * It doesn't matter what you leave beyond the returned length. For example if you return 2 with nums = [2,2,3,3] or nums = [2,2,0,0], your answer will be accepted.
 * Example 2:
 * <p>
 * Input: nums = [0,1,2,2,3,0,4,2], val = 2
 * Output: 5, nums = [0,1,4,0,3]
 * Explanation: Your function should return length = 5, with the first five elements of nums containing 0, 1, 3, 0, and 4.
 * Note that the order of those five elements can be arbitrary. It doesn't matter what values are set beyond the returned length.
 * @author: Keyang Wang
 * @create: 2021-01-19 21:22
 **/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int tail = nums.length;
        int head = 0;
        while (head < tail) {
            if (nums[head] == val) {
                nums[head] = nums[tail - 1];
                tail -= 1;
            } else {
                head += 1;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int nums[] = {0, 1, 2, 3, 0, 4, 2};
        System.out.println(removeElement.removeElement(nums, 2));
    }

}
