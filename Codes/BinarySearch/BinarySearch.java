package Codes.BinarySearch;
import java.util.*;
import java.io.*;

class BinarySearch {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the size of Binary Array");
    int size = scn.nextInt();

    // enter the array
    System.out.println("Enter the array");
    int arr[] = new int[size];

    for (int i = 0; i < size; i++) {
        arr[i] = scn.nextInt();
    }

    // Output of array
    System.out.println("Array intered by you : ");
    for (int i = 0; i < size; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();

    System.out.println("Enter your target element");
    int target = scn.nextInt();

    int result = binarySearch(arr, target);

    if (result == -1) {
        System.out.println("Target element not found");
    } else {
        System.out.println("Target element found at index no : " + result);
    }
    scn.close();
    }

    // implementation of binary search

    public static int binarySearch(int arr[], int target) {
        int start = 0, end = arr.length-1;

        
        while (start <= end) {
            int mid = start + (end - start)/2;
            if(arr[mid] == target) {    // Search in the middle of the array
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;   // search in the right side of the middle
            } 
            else {
                end = mid-1;   // search in the left side of the middle
            }
        }

        return -1;  // if element does not exist please return -1
        
        
    }

  
}
