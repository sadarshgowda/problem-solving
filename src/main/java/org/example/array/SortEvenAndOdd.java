package org.example.array;

public class SortEvenAndOdd {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};

        int[] result = sortEvenAndOdd(arr);

        for(int item : result){
            System.out.print(item + " ");
        }

    }

    public static int[] sortEvenAndOdd(int[] nums){
        int left = 0;
        int right = nums.length -1;

        while(left<right){
            while(left != nums.length && nums[left]%2 == 0 ){
                left++;
            }

            System.out.println(left);

            while(right != 0 && nums[right]%2 != 0 ){
                right--;
            }

            if(left<right ){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            left++;
            right--;
        }
        return nums;
    }
}
