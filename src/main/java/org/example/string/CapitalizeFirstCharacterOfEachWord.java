package org.example.string;

public class CapitalizeFirstCharacterOfEachWord {
    public static void main(String[] args) {
        String str = "hi my name is adarsh";
        System.out.println(capitalizeFirstCharacterOfWords(str)); //Hi My Name Is Adarsh
    }

    public static String capitalizeFirstCharacterOfWords(String str) {
        str = " " + str; //  " hi my name is adarsh";
        StringBuilder builder = new StringBuilder();

        for(int i=0 ; i< str.length(); i++){
            while (i< str.length() && str.charAt(i)!= ' '){
                builder.append(str.charAt(i));
                i++;
            }

            if(i<str.length()){
                builder.append(" ");
                builder.append(String.valueOf(str.charAt(i+1)).toUpperCase());
                i++;
            }

        }
        return builder.toString().trim();
    }
    }

