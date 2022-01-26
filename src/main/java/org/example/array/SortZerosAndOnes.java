package org.example.array;

public class SortZerosAndOnes {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,0,1,1,0};

        //call approachOne
        approachOne(arr);

        //call method to perform the sort i single iteration
        sortWithSingleIteration(arr);

    }

    public static int[] approachOne(int[] arr){
        //count number of zero's
        int numberOfZeros = 0;
        for(int i=0;i< arr.length;i++){
            if (arr[i] == 0) {
                numberOfZeros++;
            }
        }

        //set elemets of array to zero equivalent to count of numberOfZeros
        for(int i =0; i<numberOfZeros; i++){
            arr[i]=0;
        }

        //set remaining elements to 1
        for(int i=numberOfZeros;i< arr.length;i++){
            arr[i]=1;
        }

        return arr;
    }

    public static int[] sortWithSingleIteration(int[] arr){
        int left = 0;
        int right = arr.length-1;

        while (left<right){

            while (arr[left] ==0){
                left++;
            }

            while (arr[right] ==1){
                right--;
            }

            if(left<right){
                int temp = arr[left];
                arr[left]= arr[right];
                arr[right] = temp;
            }
        }

        return arr;
    }
}
