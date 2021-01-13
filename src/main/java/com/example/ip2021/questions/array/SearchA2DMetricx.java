package com.example.ip2021.questions.array;

/**
 * https://leetcode.com/problems/search-a-2d-matrix/
 * Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:
 *
 * Integers in each row are sorted from left to right.
 * The first integer of each row is greater than the last integer of the previous row.
 *
 *
 * Example 1:
 *
 *
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
 * Output: true
 * Example 2:
 *
 *
 * Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
 * Output: false
 */
public class SearchA2DMetricx {

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return  false;
        }
        int rowId = findRow(matrix, 0, matrix.length-1, target);
        System.out.println(rowId);
        if (rowId == -1) {
            return false;
        }

        return binarySearch(matrix[rowId], 0, matrix[0].length, target);
    }

    private boolean binarySearch(int[] array, int left, int right, int target) {

        int mid;
        while (left <= right) {
            mid = left + (right - left) /2;
            if (array[mid] == target) {
                return true;
            } else if (target < array[mid]) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    private int findRow(int[][] matrix, int top, int bottom, int target) {

        int mid;
        int length = matrix[0].length;
        while (top <= bottom) {
            mid =  top + (bottom - top) /2;
            if ( matrix[mid][0] <= target && matrix[mid][length -1] >= target) {
                return mid;
            } else if (target < matrix[mid][length -1 ] ) {
                bottom = mid - 1;
            } else if (target > matrix[mid][length -1 ] ) {
                top = mid +1;
            }
        }
        return  -1;
    }


}
