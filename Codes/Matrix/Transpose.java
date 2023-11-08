package Codes.Matrix;

import java.sql.PseudoColumnUsage;
import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        /*
         * Transpose The Matrix;
         * 
         * example : - 1 2 3        1 4 6
         *             4 5 6  ->    2 5 7
         *             6 7 8        3 6 8
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
          System.out.println("The Transpose Matrix Is : ");

           for (int i = 0; i < cols; i++) {
                for (int j = 0; j < row; j++) {
                    System.out.print(mat[j][i] + " ");
                }
                System.out.println();
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
}
