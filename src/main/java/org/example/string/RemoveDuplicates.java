package org.example.string;

import java.util.HashMap;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        System.out.println("resultant string is " + returnStringWithoutDuplicateApproach1(str));
    }

    public static String returnStringWithoutDuplicateApproach1(String str){
        char[] charArray = str.toCharArray();
        int index = 0;
        String result = "";
        int j;
        for(int i = 0; i < str.length(); i++){
            System.out.println("i " + i);
            for(j =0 ; j < i; j++){
                System.out.println("j " + j);
                if( charArray[i]==charArray[j]){
                    break;
                }
            }

            if(j == i){
                result += charArray[i];
            }
        }
       return result;
    }
}
