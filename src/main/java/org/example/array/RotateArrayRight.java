package org.example.array;

public class RotateArrayRight {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int rightRotation = 2;
        rotateArrayRight(arr, rightRotation);

        for(int item : arr){
            System.out.print(item);
        }
    }

    public  static int[]  rotateArrayRight(int[] arr, int rightRotation){
        for(int i=0; i<rightRotation; i++){
            int temp = arr[arr.length-1];
            for(int j=arr.length-1; j > 0; j--){
                arr[j] = arr[j-1];
            }
            arr[0]=temp;
        }

        return arr;
    }
}
