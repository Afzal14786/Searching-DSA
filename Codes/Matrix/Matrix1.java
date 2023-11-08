package Codes.Matrix;

import java.util.Scanner;

public class Matrix1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number of row : ");
        int row = scn.nextInt();
        System.out.print("Enter the number of column : ");
        int cols = scn.nextInt();

        /*
            * Take input matrix elements . . .
         */
        System.out.println("Enter the elements of 2D Matrix : ");
        int[][] matrix  = new int[row][cols];
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = scn.nextInt();
            }
        }

        /*
            * Print out the entered element as Matrix form //
         */
        System.out.println("The Matrix Intered By You : ");
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        /*
         * Take a number input form user and find out whether the number is present or not, if it is present return true and the location where the element present.
         */

         System.out.println("Enter the target number : ");
         int targetElem = scn.nextInt();
         boolean flag = false;
         for(int i = 0; i < row; i++) {
            for(int j = 0; j < cols; j++) {
                if (matrix[i][j] == targetElem) {
                    flag = true;
                    System.out.println("The Element Present At (" + i + ", " + j + ")");
                    break;
                }
            }
         }

         if (flag == true) {
            System.out.println("Yes the target element is present in the array : ");
         } else {
            System.out.println("The Element You Entered is not present in the matrix : ");
         }

         scn.close();
    }
}
