package org.example.string;

public class RemoveSpaces {
    public static void main(String[] args) {
        char str[] = "g eeks for ge eeks ".toCharArray();
        System.out.println(removeSpacesApproach1(str));
        //System.out.println(String.valueOf(str).subSequence(0, i));

    }

    static String removeSpacesApproach1(char []str)
    {
       int count = 0;
       for(int i=0; i< str.length; i++){
           if(str[i] != ' '){
               str[count] = str[i];
               count++;
           }
       }
       return String.valueOf(str).trim();
    }
}
