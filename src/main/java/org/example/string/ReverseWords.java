package org.example.string;

public class ReverseWords {
    public static void main(String[] args) {
        String s = "Hello world";
        String reveredString = reverseWords(s);
        System.out.println("the result after reversing string : " + reveredString); //"world Hello"
    }

    public  static String reverseWords(String s){
        char[] charArray = s.toCharArray();
        int start =0;

        String result = "";
        for(int end = charArray.length-1; end>=0;end--) {

            int temp = end;

            while (end>=start && charArray[end] != ' ' ) {
                end--;
            }

            int midStart = end + 1;

            while(midStart<=temp){
                result = result + charArray[midStart];
                midStart++;
            }

            if(end>start){
                result += " ";
            }

        }
        return result;
    }
}
