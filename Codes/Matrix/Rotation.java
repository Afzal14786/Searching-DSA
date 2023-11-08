package Codes.Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Rotation {
    public static void main(String[] args) {
        /*
         * Rotation of a 2D Matrix : 
         */

         /*
          * There is two step to rotate a 2d matrix
            1. Transpose the matrix
            2. Swap between columns.
          */

         Scanner scn = new Scanner(System.in);
         System.out.println("Enter the number of row : ");
         int row = scn.nextInt();
         System.out.println("Enter the number of columns : ");
         int cols = scn.nextInt();

         /*
          * Take input the matrix element and print it;
          */
          int[][] mat = new int[row][cols];
          System.out.println("Enter the Matrix Element : ");
          for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = scn.nextInt();
            }
          }

          System.out.println("The Entered Matrix By You Is : ");
          printMatrix(mat);

          /*
           * Transpose of a Matrix : 
           */
          System.out.println("The Rotated Matrix Is : ");
          transpose(mat);

          for(var matrix : mat) {
                System.out.println(Arrays.toString(matrix));
          }
          

            scn.close();

    }

    private static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void transpose(int[][] arr) {

        // Step 1 :
        for (int i = 0; i < arr.length; i++) {
             for (int j = 0; j < arr[i].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
             }
        }
        // Step 2 : 
        for (int i = 0; i < arr.length; i++) {
            int leftIndex = 0, rightIndex = arr[i].length-1;

            while (leftIndex < rightIndex) {
                int temp = arr[i][leftIndex];
                arr[i][leftIndex] = arr[i][rightIndex];
                arr[i][rightIndex] = temp;

                leftIndex++;
                rightIndex--;
            }
        }
    }
}