package Codes.LinearSearch;
import java.util.*;
import java.io.*;


class LinerSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of an array :");
        int size = scn.nextInt();

        // enter the array elements
        System.out.println("Enter the array elements :");
        int arr[] = new int[size];
        for(int i=0; i<size; i++) {
            arr[i] = scn.nextInt();
        }

        // target element
        System.out.println("Enter your searching / target element :");
        int elem = scn.nextInt();

        // implementation of linear search
        int idx = -1;
        for (int i = 0; i < size; i++) {
            if (arr[i] == elem) {
                idx = i;
                break;
            }
        }

        if (idx == -1) {
            System.out.println("Searching element not found 😢");
        } else {
            System.out.println("Searching element found 🙂 at index-> " + idx);
        }

        scn.close();
// - - - -- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 

        /*
         * Adantage :
         *      -> Simple to understand
         *      -> No need additional memory to implement it
         *      -> useful in every kind of array like : sorted or unsorted
         */

         /*
          * Disvantage :
                    -> if the value of searching element is too high then it took to much time to search the element
                    -> Time Complexcity = O(n)
                    -> Linear Search take much high time as compare to Binary Search
          */
    }
}
