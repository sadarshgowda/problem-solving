package org.example.array;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,1,0,1,0,1,0,0};
        moveZeroToEnd(arr);
        for(int i=0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] moveZeroToEnd(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            while (arr[start]==1){
                start++;
            }

            while (arr[end]==0){
                end--;
            }

            if(start<end){
                int temp = arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
            }
        }
        return arr;
    }
}
