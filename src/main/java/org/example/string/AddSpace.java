package org.example.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddSpace {
    public static void main(String[] args) {
        String  s = "EnjoyYourCoffee";
        int[] spaces = {5, 9};
        System.out.println("resultant string " + addSpaces(s, spaces)); // "Enjoy Your Coffee"
    }


    public static String addSpaces(String s, int[] spaces) {

        StringBuilder builder = new StringBuilder();

        List<Integer> spaceList =
                new ArrayList<Integer>(); //Arrays.asList(spaces)

        for(int i=0;i<spaces.length;i++) {
            spaceList.add(spaces[i]);
        }

        for(int i=0; i<s.length(); i++){
            if(spaceList.contains(i)){
                builder.append(" ");
            }
            builder.append(s.charAt(i));
        }

        return builder.toString();
    }
}
