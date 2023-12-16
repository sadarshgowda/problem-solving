package org.example.search;

public class BinarySearch {
 //Binary search is an efficient algorithm used to search for a specific target element within a sorted array
 //it follows a divide-and-conquer strategy, repeatedly dividing the search interval in half and discarding half of the elements in each step.

    public static void main(String[] args) {
        int[] arr = {2, 7, 13, 19, 23, 34, 45, 56, 67};
        int target = 13;  // element to find in the array

        int resultIndex = binarySearch(arr, target);

        if(resultIndex != -1){
            System.out.println(" element  " + target + " is at index " + resultIndex);
        }
        else {
            System.out.println(" element  " + target + " is not found");
        }

    }


    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length -1;



        while (low < high){
            int mid = low + (high - low) / 2;
            System.out.println("mid value is " + mid);

            if(arr[mid] == target){
                return mid;
            }

            else if(arr[mid] > target){
                high = mid -1;
            }

            else {
                low = mid + 1;
            }
        }

        return -1;
    }

}
