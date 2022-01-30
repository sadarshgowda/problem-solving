package org.example.string;

import java.util.ArrayList;
import java.util.List;

public class AddSpace {
    public static void main(String[] args) {
        String  s = "EnjoyYourCoffee";
        int[] spaces = {5, 9};
        System.out.println("resultant string " + addSpaces(s, spaces)); // "Enjoy Your Coffee"
    }


    public static String addSpaces(String s, int[] spaces) {
        char[] charArray = s.toCharArray();


        List<Integer> spaceList =
                new ArrayList<Integer>();

        for(int i=0;i<spaces.length;i++) {
            spaceList.add(spaces[i]);

        }
        String result = "";
        for(int i=0; i<charArray.length; i++){
            if(spaceList.contains(i)){
                result = result + " ";
            }
            result = result + charArray[i];

        }

        return result;
    }
}
