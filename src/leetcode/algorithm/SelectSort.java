package leetcode.algorithm;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description:
 * @author: Keyang Wang
 * @create: 2021-02-27 17:30
 **/
public class SelectSort {
    private int[] selectSort(int arr[]){
        if (arr==null){
            return null;
        }
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i; j <arr.length ; j++) {
                if (arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectSort sort = new SelectSort();
        int arr[] = {11,1,2,5,11,6,9};
        System.out.println(Arrays.toString(sort.selectSort(arr)));
    }
}
