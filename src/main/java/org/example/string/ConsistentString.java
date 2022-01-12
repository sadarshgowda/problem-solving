package org.example.string;

import java.util.HashSet;
import java.util.Set;

public class ConsistentString {
    public static void main(String[] args) {
        String allowed = "ab";
       String[] words = {"ad","bd","aaab","baa","badab"};
       System.out.println(checkIfStringIsConsistent(allowed,words));
    }

    public static int  checkIfStringIsConsistent(String allowed, String[] words ){
        Set<Character> consistent = new HashSet<>();
        for(int i =0; i< allowed.length(); i++){
            consistent.add(allowed.charAt(i));
        }

        int count = 0;

        for(int i=0;i<words.length;i++){
            boolean flag = true;
            String temp = words[i];
            for(int j =0; j <temp.length(); j++){
                if(!consistent.contains(temp.charAt(j))){
                    flag = false;
                }
            }
            if(flag){
                count++;
            }
        }
        return count;
    }
}
