package org.example.sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] arr = {5,7,1,6,8};
        int[] result = sortInDescending(arr);

        for(int item : result){
            System.out.print(item + " ");
        }


        sortInDescending(arr);
    }

    public static int[] sortInAscending(int[] arr){
        for( int i =0; i < arr.length-1; i++){
            for(int j=0 ; j < arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        return arr;
    }

    public static int[] sortInDescending(int[] arr){
        for(int i= arr.length-1 ; i> 0; i--){
            for(int j=i; j> 0; j--){
                if(arr[j]>arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }

        return arr;
    }

}
