package org.example.string;

import java.util.HashSet;
import java.util.Set;

public class EqualOccurence {
    public static void main(String[] args) {
        String s = "abacbc";
        System.out.println("result of equal occurence of character in string is " + Approach1(s));

    }

    public static boolean Approach1(String str){
        int[] arr = new int[26];
        for (int i=0; i<str.length(); i++){
            arr[str.charAt(i)-97]++;
        }

        Set<Integer> set = new HashSet<>();
        for(int count : arr){
            if(count!=0){
                set.add(count);
            }
        }

        return set.size() == 1;
    }


}
