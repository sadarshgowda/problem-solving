package org.example.array;

public class CountDifference {
    public static void main(String[] args) {
        int[] nums = {1,2,2,1};
        int k = 1;
        System.out.println("count of given difference is " + returnCountOfDifference(nums, k));
    }

    public static int returnCountOfDifference(int[] arr, int k){
        int  result = k;
        int count = 0;
        for(int i = 0 ; i< arr.length-1; i++){
            for(int j = i+1; j < arr.length; j++){
                if(Math.abs(arr[i]-arr[j]) == result ){
                    count++;
                }
            }
        }
        return count;
    }
}
