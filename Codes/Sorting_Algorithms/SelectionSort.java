package Codes.Sorting_Algorithms;

import java.util.*;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,3,6,8,12,98,54,34,43};
        selectionSort(arr);
        System.out.println("The Sorted (Using Selection Sort) Array Is : ");
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSort(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            int midIndex = i;

            for (int j = i+1; j < arr.length; j++) {
                
                if (arr[j] < arr[midIndex]) {
                    midIndex = j;
                }
            }

            if (arr[midIndex] != i) {
                // need to swap between arr[midIndex] and arr[i]

                int temp = arr[midIndex];
                arr[midIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}

/*
 *  Notes
 *  -> In every iteration we get smaller element in the extreme left
 *  -> Time Complexity = O(n^2)
 *  -> Space Complexity = O(1) *Constant*
 */
