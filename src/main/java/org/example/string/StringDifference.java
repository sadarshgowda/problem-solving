package org.example.string;

public class StringDifference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println("additional character is " + findTheDifference(s, t));

    }

    public static char findTheDifference(String s, String t) {
        int sum =0;
        for(int i=0; i <s.length(); i++){
            sum += s.charAt(i);
        }


        for(int i=0; i <t.length(); i++){
            sum -= t.charAt(i);
        }

        return (char) Math.abs(sum);
    }
}
