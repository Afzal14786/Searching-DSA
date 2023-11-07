package Codes.Questions;
import java.util.*;
/*
 * Time Complexity : O(n);
 * Space COmplexity : O(1);
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of row");
        int size = scn.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Array Elements : ");

        // Take input of array elements
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        // Print the array elements //
        System.out.println("Array Intered by you : ");
        for(int i = 0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        /*
         * Check if the intered array is palindrome or not ?
         */
        boolean flag = false;

        for(int i = 0; i< arr.length/2; i++) {
            if(arr[i] != arr[arr.length-i-1]) {
                flag = true;
                System.out.println("It's Not a palindrome");
                break;
            }
        }
         
        if (flag == false) {
            System.out.println("It's A Palindrome");
        }



    }
}
