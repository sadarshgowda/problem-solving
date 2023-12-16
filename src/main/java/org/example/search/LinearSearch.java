package org.example.search;

public class LinearSearch {

    //algorithm used to find a particular element in a list or array by sequentially checking each element from the start to the end until a match is found or the entire list is traversed.
    //linear search can be applied for both sorted and unsorted array

    public static void main(String[] args) {

        int size = 7; // Define the size of the array
        int[] arr = new int[size];  // Create an array of specified size

        // Define elements for the array using a for loop
        for(int i=0; i < args.length; i++){
            arr[i++] = (i+1)*10;
        }

        int target = 30; //element to search for

        int resultIndex = linearSearch(arr, target);  //

        if(resultIndex != -1){
            System.out.println(" element  " + target + " is at index " + resultIndex);
        }
        else {
            System.out.println(" element  " + target + " is not found");
        }
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                return i;  // Return the index if the target is found
            }
        }

        return -1;  // Return -1 if the target is not found in the array
    }
}
