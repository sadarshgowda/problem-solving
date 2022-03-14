package org.example.array;

public class MaxMinForm {
    public static void main(String[] args) {
        int[] arr =  {1, 2, 3, 4, 5, 6, 7};

        int[] result =  firstApproach(arr);  // 7 1 6 2 5 3 4

    }

    public static int[]  firstApproach(int[] arr){
        int[] result = new int[arr.length];
        int left = 0;
        int right = arr.length-1;
        int count = 0;
        while ((left<right)){
            result[count++] = arr[right];
            result[count++] = arr[left];
            left++;
            right--;
        }

        if(arr.length % 2 != 0){
            int mid = (arr.length-1)/2;
            result[result.length-1] = arr[mid];
        }


        return result;
    }
}
