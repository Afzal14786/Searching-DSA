package Codes.BinarySearch.Questions;

public class LowerBound {
    public static void main(String[] args) {
        int arr[] = {2,4,6,6,9,8,9,11,12,11};
        int target = 11;

        int res = lowerBound(arr, target);
        if(res == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("First Occurance exist at index no : " + res);
        }
    }

    private static int lowerBound(int arr[], int target) {
        
        int start = 0, end = arr.length-1, result = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(arr[mid] == target) {
                result = mid;
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
                
            } else {
                end = mid - 1;
            }
        }
        
        return result;
    }
}
