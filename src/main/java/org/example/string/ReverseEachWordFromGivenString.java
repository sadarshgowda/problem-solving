package org.example.string;

public class ReverseEachWordFromGivenString {
    public static void main(String[] args) {
        String s = "God Ding";
        System.out.println(reverseWords(s)); //"doG gnid"
    }

    public static String reverseWords(String s) {
        char[] charArray = s.toCharArray();
        String result = "";
        for(int i =0;i<charArray.length; i++){
            int start = i;
            while( i<charArray.length && charArray[i] != ' '){
                i++;
        }
        int end =i-1;

        while(end>=start){
            result = result + charArray[end];
            end--;
        }
        if(i<charArray.length){
            result += " ";
        }

    }
        return result;
}
}
