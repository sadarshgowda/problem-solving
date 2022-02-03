package org.example.array;

public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int leftRotation = 2;
        rotateArrayLeft(arr, leftRotation);

        for(int item : arr){
            System.out.print(item);
        }
    }

    public  static int[]  rotateArrayLeft(int[] arr, int leftRotation){
        for(int i=0; i<leftRotation; i++){
            int temp = arr[0];
            for(int j=0; j < arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1]=temp;
        }

        return arr;
    }
}
