package leetcode.algorithm;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: 1122
 * <p>
 * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
 * <p>
 * Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.
 * Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.
 * <p>
 * Example 1:
 * <p>
 * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
 * Output: [2,2,2,1,4,3,3,9,6,7,19]
 * @author: Keyang Wang
 * @create: 2021-03-09 20:45
 **/
public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int index = 0;
        for (int num:arr2) {
            for (int i = index; i <arr1.length ; i++) {
                if(arr1[i] == num){
                    swap(arr1,index,i);
                    index++;
                }
            }
        }

        if (index<arr1.length){
            for (int i = index; i <arr1.length ; i++) {
                for (int j = i; j <arr1.length ; j++) {
                    if (arr1[j]<arr1[i]){
                        swap(arr1,i,j);
                    }
                }
            }

        }
        return arr1;
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        RelativeSortArray relativeSortArray = new RelativeSortArray();
        int [] arr1 = {28,6,22,8,44,17};
        int [] arr2 = {22,28,8,6};
        int [] arr3 = {1,2,3};
        relativeSortArray.relativeSortArray(arr1,arr2);
        //relativeSortArray.swap(arr3,0,1);
        System.out.println(Arrays.toString(arr1));
    }
}
