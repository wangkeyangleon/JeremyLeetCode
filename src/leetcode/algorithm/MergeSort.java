package leetcode.algorithm;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description:
 * @author: Keyang Wang
 * @create: 2021-02-27 17:30
 **/
public class MergeSort {

    private void mergeSort(int[]array,int left,int right,int[] tempArray){
        if (left<right){
            int mid = (left+right)/2;
            //recursion from left
            mergeSort(array,left,mid,tempArray);
            //recursion from right
            mergeSort(array,mid+1,right,tempArray);
            //merge
            merge(array,left,mid,right,tempArray);
        }

    }
    private void merge(int[] array, int left, int mid, int right, int[] tempArray) {
        int i = left; //the index of the left array
        int j = mid+1; //the index of the right array
        int temp = 0; //the index points the tempArray

        //put the left and right arrays to tempArray and follow the ascending order
        while (i<=mid&&j<=right){
            if (array[i]<array[j]){
                tempArray[temp] = array[i];
                i++;
            }else {
                tempArray[temp] = array[j];
                j++;
            }
            temp++;
        }

        //put the leftovers to the tempArray
        while (i<=mid){
            tempArray[temp] = array[i];
            i++;
            temp++;
        }
        while (j<=right){
            tempArray[temp]=array[j];
            j++;
            temp++;
        }

        //put the tempArray back to the original array
        temp = 0;
        int tempLeft = left;
        while (tempLeft<=right){
            array[tempLeft] = tempArray[temp];
            temp++;
            tempLeft++;
        }
    }

    public static void main(String[] args) {
        int []array = {8,4,5,7,1,3,6,2};
        int[] tempArray = new int[array.length];
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array,0,array.length-1,tempArray);
        System.out.println(Arrays.toString(array));

    }
}
