package Codes.Questions;
/*
 * This Code finds out only one duplicate at a time.
 * time complexity = O(n)
 * Space Complexity = (1)
 */
import java.util.Scanner;

public class DuplicateElem {
    public static void main(String[] args) {
        /*
         * Write a code and find out the duplicate element
         */
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scn.nextInt();

        System.out.println("Enter the element of array : ");
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        System.out.println("The Array Intered By You : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("-------------------------------");

        /*
         * Implementation of code for find the duplicate
         */

         for(int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.print("The Duplcate Elements Is : " + arr[i] + " ");
                }
            }
         }
         System.out.println();
    }
}
