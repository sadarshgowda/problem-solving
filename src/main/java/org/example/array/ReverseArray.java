package org.example.array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        reverseArray(arr);

        for (int item : arr){
            System.out.print(item);
        }
    }

    public static int[] reverseArray(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return arr;
    }
}
