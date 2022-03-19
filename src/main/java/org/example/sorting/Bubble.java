package org.example.sorting;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {5,7,1,6,8,1,2,3,4};
        sortInAscending(arr);
        sortInDescending(arr);
    }

    public static void sortInAscending(int[] arr){
        for( int i =0; i < arr.length-1; i++){
            for(int j=0 ; j < arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

    public static void sortInDescending(int[] arr){
        for(int i=0 ; i< arr.length-1; i++){
            for(int j=0; j< arr.length-1-i; j++){
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }

}
