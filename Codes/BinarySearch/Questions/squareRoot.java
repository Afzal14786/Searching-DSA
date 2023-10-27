package Codes.BinarySearch.Questions;

import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number of which you want to square root : ");
        int root = scn.nextInt();

        int res = Root(root);
        System.out.println("Square root of entered number : " + res);

        boolean result = Square(res);
        System.out.println(result);
        scn.close();
    }

    // this method return the square root of the entered number
    private static int Root(int root) {
        int start = 0, end = root, result = -1;

        while (start <= end) {
            // find the mid element
            int mid = start + (end - start) / 2;
            long value = mid * mid;

            if (value == root) {
                return mid;
            } else if(value < root) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    
    private static boolean Square(int num) {
        int start = 0, end = num;
        boolean result = false;

        while (start <= num) {
            // get the middle value
            int middle = start + (end - start) / 2;
            long val = middle * middle;

            if (val == num) {
                return true;
            } else if(val < num) {
                result = true;
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return result;
    }
}
