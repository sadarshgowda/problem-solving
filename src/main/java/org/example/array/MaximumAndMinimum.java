package org.example.array;

public class MaximumAndMinimum {
    public static void main(String[] args) {
        int[] arr = {1,5,4,8,9,4,5,6,3};

        System.out.println("maximum value is " + findMaximum(arr));
        System.out.println("minimum value is " + findMinimum(arr));
        System.out.println("second maximum  value is " + secondMaximum(arr));
        System.out.println("second minimum  value is " + secondMinimum(arr));
    }

    public static int findMaximum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i =0; i< arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    public static int findMinimum(int[] arr){
        int min = Integer.MAX_VALUE;
        for(int i =0; i< arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }

    public static int secondMaximum(int[] arr){
        int firstMaximum, secondMaximum;
        firstMaximum=secondMaximum= Integer.MIN_VALUE;

        for(int i=0; i< arr.length; i++){
            if(arr[i]>firstMaximum){
                int temp = firstMaximum;
                firstMaximum = arr[i];
                secondMaximum = temp;
            }
            else if(arr[i]>secondMaximum && arr[i]!=firstMaximum){
                secondMaximum = arr[i];
            }
        }
        return secondMaximum;
    }

    public static int secondMinimum(int[] arr){
        int firstMinimum, secondMinimum;  //{1,5,4,8,9,4,5,6,3}
        firstMinimum=secondMinimum= Integer.MAX_VALUE;

        for(int i=0; i< arr.length; i++){
            if(arr[i]<firstMinimum){
                int temp = firstMinimum;
                firstMinimum = arr[i];
                secondMinimum = temp;
            }
            else if(arr[i]<secondMinimum && arr[i]!=firstMinimum){
                secondMinimum = arr[i];
            }
        }
        return secondMinimum;
    }

}
