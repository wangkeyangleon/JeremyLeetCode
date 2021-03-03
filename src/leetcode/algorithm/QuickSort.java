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

            //这里一定是右边开始，上下这两个循环不能调换（下面有解析，可以先想想）

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
        quickSort(arr,low,i-1);
        quickSort(arr,i+1,high);
    }


    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] array = {5,2,3,1};
        quickSort.quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

    }
}
