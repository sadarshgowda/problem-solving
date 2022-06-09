package org.example.string;

import java.util.HashMap;

public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        System.out.println("number of stones which are jewels are " + numJewelsInStones(jewels, stones));
    }

    public static int numJewelsInStones(String jewels, String stones) {
        if(jewels.isEmpty()){
            return 0;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i< stones.length(); i++){
            if(!map.containsKey(stones.charAt(i))){
                map.put(stones.charAt(i),1);
            }

            else{
                map.put(stones.charAt(i),map.get(stones.charAt(i)+1));
            }
        }

        System.out.println("map-----" + map);
        int count = 0;
        for(int i=0; i< jewels.length(); i++){
            if(map.containsKey(jewels.charAt(i))){
                count += map.get(jewels.charAt(i));
            }
        }

        System.out.println("count---" + count);
        return count;
    }
}
