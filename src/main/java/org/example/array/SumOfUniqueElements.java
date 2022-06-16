package org.example.array;

public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] nums = {1,2,3,2};
        System.out.println("sum of unique elements " + returnSumOfUniqueElement(nums));
    }

    public static int returnSumOfUniqueElement(int[] nums){
        int sum = 0;
        int j;
        for(int i=0; i < nums.length; i++){
            for( j=0; j< nums.length; j++){
                if(i!=j && nums[j] == nums[i]){
                    break;
                }
            }

            if(j == nums.length){
                sum += nums[i];
            }
        }
        return sum;
    }
}
