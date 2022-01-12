package org.example.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ReverseVowels {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s){
        List<Character> vowels = Arrays.asList('a','e','i','o','u','A','E','I','O','U');

        HashSet<Character> set = new HashSet<>();
        set.addAll(vowels);

        char[] charArray = s.toCharArray();

        int left=0;
        int right = s.length()-1;
        boolean leftFlag = false;
        boolean rightFlag = false;

        char temp;

        while (left<right){
            if(set.contains(charArray[left])){
                leftFlag = true;
            }

            else{
                left++;
            }

            if(set.contains(charArray[right])){
                rightFlag=true;
            }

            else {
                right--;
            }

            if(leftFlag && rightFlag){
                temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;

                left++;
                right--;
            }

        }
        return String.valueOf(charArray);

    }
}
