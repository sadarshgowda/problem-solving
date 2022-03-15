package org.example.array;

public class SubArraySum {
    public static void main(String[] args) {
        int[] arr = {1, 4, 0, 0, 3, 10, 5};
        int sum = 7;
        System.out.println(checkSubArray(arr, sum));

    }

    public static boolean checkSubArray(int[] arr, int sum){
        for(int i = 0; i< arr.length; i++){
            int currentSum = arr[i];
            if((i+1) == arr.length && currentSum != sum){
                return false;
            }

            for(int j = i+1 ; j< arr.length; j++){
                currentSum += arr[j];
                if(currentSum == sum){
                    return true;
                }
            }
        }
        return false;
    }

    
}
