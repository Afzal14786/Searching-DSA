package Codes.Matrix;

import java.util.Scanner;

public class prefix1 {
    public static void main(String[] args) {
        /*
         * Prefix Sum (Brute Force Approach)
         */

         Scanner scn = new Scanner(System.in);
         System.out.println("Enter the No of rows :"); 
         int row = scn.nextInt();
         System.out.println("Enter the number of columns :");
         int cols = scn.nextInt();

         /*
          * Take input of array : 
          */

        int[][] array = new int[row][cols];
        System.out.println("Enter the elements of the array : ");
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scn.nextInt();
            }
        }

        // Print the matrix :

        System.out.println("The Matrix Entered By You : ");
        print_Matrix(array);

        /*
         * Prifix Sum : 
         */

         System.out.println("Enter the First Co-Ordinates(Row & Column) : ");
         int row1, cols1, row2, cols2;
         row1 = scn.nextInt();
        cols1 = scn.nextInt();

        System.out.println("The First Co-Ordinates Are : (" + row1 +", " + cols1 +")");
        System.out.println("Enter the Second Co-Ordinates (Row & Column) : ");
        row2 = scn.nextInt();
        cols2 = scn.nextInt();
        System.out.println("The Second Co-Ordinates Are : (" + row2 + ", " + cols2 + ")");

        int result = prefixSum(array, row1, cols1, row2, cols2);
        System.out.println("The Prefix Sum Is : " + result);
        
    }

    private static void print_Matrix(int[][] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int prefixSum(int[][] array, int r1, int c1, int r2, int c2) {

        int sum = 0;

        for(int i = r1; i <= r2; i++) {
            for(int j = c1; j <= c2; j++) {
                sum += array[i][j];
            }
        }

        return sum;
    }


}
