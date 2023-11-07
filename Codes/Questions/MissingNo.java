package Codes.Questions;

import java.util.Scanner;

public class MissingNo {
    public static void main(String[] args) {
        /*
         * Write a code to print the missing no.
         */
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int size = scn.nextInt();
/*
 * Take the input of array
 */     System.out.println("Enter the Array Elements : ");
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        
/*
 * Display the array : 
 */
        System.out.println("Array intered by you : ");
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("-------------------------------------------");

        int n = arr.length;
        int sum_of_natural_number = (n+1) * (n+2)/2;
        int sum = 0;

        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }

        int MissingElem = sum_of_natural_number - sum;
        System.out.println("The Missing Number is :");
        System.out.println(MissingElem);
    }
}
