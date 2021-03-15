package leetcode.algorithm;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description:
 * @author: Keyang Wang
 * @create: 2021-02-27 17:30
 **/
public class QuickSort {
    private void quickSort(int[] arr, int low, int high) {
        int p, i, j, temp;

        if (low >= high) {
            return;
        }
        //p就是基准数,这里就是每个数组的第一个
        p = arr[low];
        i = low;
        j = high;
        while (i < j) {
            //右边当发现小于p的值时停止循环
            while (arr[j] >= p && i < j) {
                j--;
            }

            //这里一定是右边开始，上下这两个循环不能调换

            //左边当发现大于p的值时停止循环
            while (arr[i] <= p && i < j) {
                i++;
            }

            temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
        arr[low] = arr[i];
        arr[i] = p;
        quickSort(arr, low, i - 1);
        quickSort(arr, i + 1, high);
    }

    private void quickSort2(int[] array, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = array[low];
        int left = low;
        int right = high;
        while (left < right) {
            //find the element which is smaller than pivot from the right
            while (array[right]>=pivot&&left<right){
                right--;
            }
            //find the element which is larger than pivot from the left
            while (array[left]<=pivot&&left<right){
                left++;
            }
            int temp = array[right];
            array[right] = array[left];
            array[left] = temp;
        }
        array[low] = array[left];
        array[left] = pivot;
        quickSort2(array,low,left-1);
        quickSort2(array,left+1,high);

    }


    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] array = {3, 5, 10, 1, 6, 9, 4};
        quickSort.quickSort2(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }
}
