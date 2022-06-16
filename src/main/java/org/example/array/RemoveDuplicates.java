package org.example.array;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,4,5};
        int[] result = returnStringWithoutDuplicateApproach1(arr);

        for(int item : result){
            System.out.print(item +  " ");
        }
    }

    public static int[] returnStringWithoutDuplicateApproach1(int[] arr){
        int index = 0;
        for (int i =0; i < arr.length; i++){
            int j;
            for ( j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    break;
                }
            }

            if(j == i){
                arr[index++] = arr[i];
            }
        }

        return Arrays.copyOfRange(arr, 0, index);
    }

    
}
