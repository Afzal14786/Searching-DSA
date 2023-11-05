package Codes.Sorting_Algorithms;

import java.sql.Array;
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {9,10,54,34,22,1};
        insertion(array);

        // Time Complexity = O(n^2)
        // Space Complextiy = O(1) {Constant}
        
        System.out.println("Sorted (Insertion) Array is");
        System.out.println(Arrays.toString(array));
    }

    private static void insertion(int[] arr) {
        // Insertion Sort //

        // for (int i = 0; i < arr.length; i++) {
        //     int j = i;
        //     while (j > 0 && arr[j] < arr[j-1]) {
        //         // swaping using XOR Operator //
        //         // arr[j] = arr[j] ^ arr[j-1];
        //         // arr[j-1] = arr[j] ^ arr[j-1];
        //         // arr[j] = arr[j] ^ arr[j-1];

        //         // Swaping using temp variable //
        //         int temp = arr[j];
        //         arr[j] = arr[j-1];
        //         arr[j-1] = temp;
        //         j--;
        //     }
        // }

        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while(j > 0 && arr[j] < arr[j-1]) {
                // swaping the numbers //
                /*
                 * XOR Swaping
                 */
                arr[j] = arr[j] ^ arr[j-1];
                arr[j-1] = arr[j] ^ arr[j-1];
                arr[j] = arr[j] ^ arr[j-1];
                j--;
            }
        }
    }
}
