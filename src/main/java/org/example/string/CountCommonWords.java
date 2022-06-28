package org.example.string;

import java.util.HashMap;

public class CountCommonWords {
    public static void main(String[] args) {
        String[] words1 = {"leetcode","is","amazing","as","is"};
        String[] words2 = {"amazing","leetcode","is"};

        System.out.println("count of matching words is " + returnCommonWordsCount(words1, words2));

    }

    public static int returnCommonWordsCount(String[] words1, String[] words2){
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for(String item : words1){
            if(map1.containsKey(item)){
                map1.put(item , map1.get(item) + 1);
            }

            else {
                map1.put(item, 1);
            }
        }


        for(String item : words2){
            if(map2.containsKey(item)){
                map2.put(item , map2.get(item) + 1);
            }

            else {
                map2.put(item, 1);
            }
        }


        int count = 0;

        for(String item : words1){
            if(map1.containsKey(item) && map2.containsKey(item)){
                if(map1.get(item) == 1 && map2.get(item)==1){
                    count++;
                }
            }
        }

        return count;
    }
}
