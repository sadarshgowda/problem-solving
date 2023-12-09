package org.example.sorting;

public class Selection {

    //The Selection Sort algorithm sorts an array by repeatedly finding the minimum element from the unsorted part and placing it at the beginning.

    public static void main(String[] args) {
        int[] arr = {7,4,10,8,3,1};

        int[] result = selectionSort(arr);
        //printing result
        for (int i = 0; i < result.length; i++){
            System.out.print(arr[i] + " ");
        }

    }


    public static int[] selectionSort(int[] arr){
        for(int i = 0; i< arr.length-1; i++){
            int min = i;
            for(int j=i+1; j< arr.length; j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }

            if(min != i){
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }

        }

        return arr;
    }
}
