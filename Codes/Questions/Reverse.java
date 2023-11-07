package Codes.Questions;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Reverse {
    public static void main(String[] args) {
        /*
         * Reverse of a number
         */

         Scanner scn = new Scanner(System.in);
         int size;
        System.out.print("Enter the size of array : ");
        size = scn.nextInt();
        /*
         * Take input of array : 
         */

         int[] arr = new int[size];
         System.out.println("Enter the Array : ");
         for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
         }
         System.out.println("---------------------------------");
         System.out.println("Array Intered By You : ");
         /*
          * Display the array :
          */

          for(int i =0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
          }

          /*
           * Write a code to implement the reverse of an array //
           */

        for(int i = 0; i < arr.length/2; i++) {
            // swap the array //
            arr[i] = arr[i] ^ arr[arr.length-i-1];
            arr[arr.length-i-1] = arr[i] ^ arr[arr.length-i-1];
            arr[i] = arr[i] ^ arr[arr.length-i-1];
        }

        /*
         * Print the swaped array :
         */
         System.out.println();
         System.out.println("The Reverse Array is : ");

         for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
         }
         System.out.println();
    }

}
