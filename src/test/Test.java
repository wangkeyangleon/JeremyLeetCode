package test;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @program: LeetCode
 * @description: test
 * @author: Keyang Wang
 * @create: 2021-01-12 20:47
 **/
public class Test {
    //public static void main(String[] args) {
//        double data[][] = new double[2][2];
////        Integer j = 0;
//       System.out.println(data.length);
////        for (int i = 0; i < data.length ; i++) {
//////            System.out.println(Arrays.toString(data[i]));
////            System.out.println(data[i].length);
////        }
//
////        System.out.println(data.getClass().getName());
//        data = new double[][]{{1, 2}, {3, 4},{5,6}};
//        System.out.println(data[1].length);
//        System.out.println(data.length);
//        System.out.println(7<7);
//        String s1 = "hello";
//        String s2 = "hello";
//        String s3 = new String("hello");
//        String s4 = new String("hello");
//
//        System.out.println(s1 == s2);
//        System.out.println(s3==s4);
//        System.out.println(s1 ==s3);
//
//        StringBuilder stringBuilder = new StringBuilder();
//        stringBuilder.append("hello");
//        System.out.println(stringBuilder);
//
//        StringBuffer stringBuffer = new StringBuffer();
//        stringBuffer.append("hello");
//        System.out.println(stringBuffer);

//        double a = 3.2;
//        double b = 3.2d;
//        long c = 2;
//        long d = 2l;
//        float f = 3.2f;
//        System.out.println(a+"\n"+b+"\n"+c+"\n"+d+"\n"+f);

//        int [][]matrix = {{2,3},{1,2},{5,6}};
//        System.out.println(matrix.length);
//        System.out.println(matrix[0].length);
//        int x,y;
//        x= 5>>2;
//        y = 1>>>2;
//        System.out.println(y);
//        int a = 5;
//        System.out.println(a++ + a--);
//        System.out.println(a);
//        int [] nums = {1,2,3,4,5,6};
//        if (nums.length<=0){
//            System.out.println(1);
//        }

//        public int binarySearch(int array[], int target){
//            //check if the array is null just return
//            if(array.length <= 0){
//                return 0;
//            }
//
//            //get the left index
//            int left = 0;
//            //get the right index
//            int right = array.length-1;
//            //get the middel index
//            int middle = (right-left)/2;
//
//
//            //check whther the target equals to the left or right or not include them
//            if (array[left]>target || array[right]<target) {
//                return 0;
//            }else if (array[left] == target) {
//                return left;
//
//            }else if (array[right] == target) {
//                return right;
//            }
//
//            while(left<=right){
//                middle = (left+right)/2;
//                if (array[middle]<target){
//                    left = middle+1;
//                }else if (array[middle]>target){
//                    right = middle-1;
//                }else {
//                    return middle;
//                }
//            }
//
//            return 0;
//
//        }
//
//        public static void main(String[] args){
//            int [] nums = {1,3,5,7,9,10,22};
//            int target = 9;
//            Test test = new Test();
//            System.out.println(test.binarySearch(nums,target));
//            //System.out.println(3/2);
//        }

//    public int[] slideWindow (int[] nums, int windowSize, int step) {
//
//        // write code here
//        int n = nums.length;
//        PriorityQueue<int[]> priorityQueue = new PriorityQueue<int[]>(new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0] != o2[0] ? o2[0]-o1[0]:o2[1]-o1[1];
//            }
//        });
//
//        for (int i = 0; i < step; ++i) {
//            priorityQueue.offer(new int[]{nums[i],i});
//
//        }
//        int[] result = new int[n-step+1];
//        result[0] = priorityQueue.peek()[0];
//        for (int i = step; i < n; ++i) {
//            priorityQueue.offer(new int[]{nums[i],i});
//            while (priorityQueue.peek()[1]<=i-step){
//                priorityQueue.poll();
//            }
//            result[i-step+1]= priorityQueue.peek()[0];
//
//        }
//        return  result;

//    private int[] mergeArray(int[] num1,int m, int[] num2, int n){
//        // merge to array
//        for (int i = 0; i!=n; ++i ){
//            num1[m+i] = num2[i];
//        }
//
//        Arrays.sort(num1);
//
//        return  num1;
//
//    }
//
//    public static void main(String[] args) {
//
//
//    }
//
//
//
//    }
    //m=2,n=2
//1,3
//2,4
//private int[] mergeArray(String inputs){
//
//      // merge to array
//       for (int i = 0; i!=n; ++i ){
//           num1[m+i] = num2[i];
//       }
//       }
//private int getNum(int n){
//    ArrayList<Integer> arrayList = new ArrayList<>();
//    int temp = 1;
//    for (int i = 0; i <n; i++) {
//        arrayList.add(temp);
//        temp++;
//    }
//    int size = arrayList.size();
//    int j = 0;
//    while (size>1){
//        int index = 0;
//        for(int i =j; i<n;i++){
//            if (i%3 ==0){
//                arrayList.remove(index);
//            }
//            index ++;
//        }
//        j = n;
//        n =  n+arrayList.size();
//    }
//
//    return arrayList.get(0);
//}
//    public static void main(String[] args) {
//    Test test = new Test();
//        System.out.println(test.getNum(5));
//
//
//    }
public static void main(String[] args) {
//
    //System.out.println(1/5%3);
    int num =1;
    int end = 75;
    int id = 1;
//    while (num<=end){
//        if (num/5%3 == id){
//            for (int i = 0; i < 5; i++) {
//                System.out.println(num++ );
//            }
//
//        }
//    }
    System.out.println(11/5%3);
}



}
