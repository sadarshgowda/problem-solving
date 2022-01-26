package org.example.string;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 3, 7, 8};
        System.out.println(returnMissingElement(arr));
        System.out.println(returnMissingElementWithOverflow(arr));
    }

    public static int returnMissingElement(int[] arr){
        int sum =0;
        for(int item : arr){
            sum += item;
        }

        int n = arr.length+1;
        int naturalSum = (n)*(n+1)/2;

        return naturalSum-sum;
    }

    public static int returnMissingElementWithOverflow(int[] arr){
        int count = 1;
        int sum =  0;
        for(int i=0; i< arr.length;i++){
            sum += count-arr[i];
            count++;
        }
        sum += arr.length+1;
        return sum;
    }
}
