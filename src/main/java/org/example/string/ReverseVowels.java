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

        int start=0;
        int end = s.length()-1;

        char temp;

        while (start<end){
            if(!set.contains(charArray[start])){
                start++;
            }

            if(!set.contains(charArray[end])){
                end--;
            }

            temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;

        }
        return String.valueOf(charArray);

    }
}
