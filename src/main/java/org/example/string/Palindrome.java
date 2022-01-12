package org.example.string;

public class Palindrome {
    public static void main(String[] args) {
        String[] words = {"abc","car","ada","racecar","cool"};
        for(String item : words){
            if(checkPalindrome(item)){
               System.out.println(String.format("%s is palndrome",item));
            }
        }
    }



    public static boolean checkPalindrome(String item){
        int left = 0;
        int right = item.length()-1;
        char[] chararray = item.toCharArray();

        while(left<right){
            if(chararray[left] != chararray[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
