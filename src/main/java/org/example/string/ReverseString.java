package org.example.string;

public class ReverseString {
    public static void main(String[] args) {
        String str = "Adarsh";
         System.out.println( "the reversed string is " + reverseEachCharacter(str));
    }

    public static String reverseEachCharacter(String str){
        char[] arr = str.toCharArray();
        int start = 0;
        int end = str.length()-1;

        while (start<end){
            char temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;

            start++;
            end--;
        }


        return String.valueOf(arr);
    }
}
