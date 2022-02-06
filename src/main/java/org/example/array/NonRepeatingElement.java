package org.example.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class NonRepeatingElement {
    public static void main(String[] args) {
        int[] arr = { 9, 4, 9, 6, 7, 4 };
        System.out.print(secondApproach(arr));

    }

    public static int firstApproach(int[] arr){
        for(int i =0; i<arr.length; i++){
            int j;
            for( j= 0;j< arr.length;j++){
                if(i != j && arr[i]==arr[j]){
                    break;
                }
            }

            if(j==arr.length){
                return arr[i];
            }
        }

        return -1;
    }

    public static int secondApproach(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }

            else{
                map.put(arr[i], 1);
            }
        }

      for(Map.Entry<Integer, Integer> item : map.entrySet()){
            if(item.getValue()==1){
                return item.getKey();
            }
        }

      return -1;
    }
}
