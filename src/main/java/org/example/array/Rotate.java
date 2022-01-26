package org.example.array;

public class Rotate {
    public static void main(String[] args) {
        int k = 3;
        int[] nums ={1,2,3,4,5,6,7};
        k = k % nums.length;
        reverse(nums, 0, nums.length-1);  //reverse all elements
        reverse(nums, 0, k-1); //reverse first group (start =0 , end = k-1)
        reverse(nums, k, nums.length-1); //reverse second group (start =k , end = nums.length-1)
    }

    public static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }

    }
}
