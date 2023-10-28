package Codes.Sorting_Algorithms;

import java.util.Arrays;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {2,7,8,5,3,4,1};
        sorted(arr);

        // Time Complexity = O(n^2);
        // Space Complexity = O(1) {Constant}
        System.out.println("Sorted Array is :");
        System.out.println(Arrays.toString(arr));
    }

    private static void sorted(int[] arr) {
        // bubble sort //
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length-i-1; j++) {
                // comparing //
                if (arr[j] > arr[j+1]) {
                    // swaping using XOR Operator //
                    arr[j] = arr[j] ^ arr[j+1];
                    arr[j+1] = arr[j] ^ arr[j+1];
                    arr[j] = arr[j] ^ arr[j+1];

                    flag = true;
                }
            }

            if (!flag) {
                break;
            }
        }
    }
        
}
