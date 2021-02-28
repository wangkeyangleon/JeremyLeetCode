package leetcode.algorithm;

import java.util.Arrays;

/**
 * @program: LeetCode
 * @description:
 * @author: Keyang Wang
 * @create: 2021-02-27 17:36
 **/
public class BubbleSort {
    private int[] bubbleSort(int[] array) {
        if (array.length == 0) {
            return array;
        }
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - j - 1; i++) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        return array;
    }

    private int[] bestBubbleSort(int array[]) {
        boolean swap = true;
        for (int i = 0; i < array.length - 1; i++) {
            swap = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap){
                break;
            }
        }
        return array;
    }


    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        int array[] = {1, 6, 9, 3, 5, 2};
        System.out.println(Arrays.toString(bubbleSort.bestBubbleSort(array)));
    }

}
