package leetcode.dataStructure;

/**
 * @program: LeetCode 240
 * @description: Write an efficient algorithm that searches for a target value in an m x n integer matrix.
 * The matrix has the following properties:
 * Integers in each row are sorted in ascending from left to right.
 * Integers in each column are sorted in ascending from top to bottom.
 * @author: Keyang Wang
 * @create: 2021-07-12 11:37
 **/
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        //get the row of the matrix
        int row = 0;
        // get the column of the matrix
        int column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0) {
            if (target == matrix[row][column]) {
                return true;
            } else if (target < matrix[row][column]) {
                // the target is on the left side of the matrix
                column--;
            } else {
                row++;
            }
        }

        return false;

    }

    public static void main(String[] args) {
        int[][]matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 20;
        int [][]matrix1 = {{-5}};
        int target1 = -5;
        SearchA2DMatrix searchA2DMatrix = new SearchA2DMatrix();
        System.out.println( searchA2DMatrix.searchMatrix(matrix1,target1));

    }
}
