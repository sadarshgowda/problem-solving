package org.example.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElementRemover {

    //remove all occurrences of the specified key from the array in Java
    public static void main(String[] args) {
        int[] arr = {3,9,2,3,1,7,2,3,5};
        int key = 3;

        int[] result = removeAllOccurrencesUsingLoop(arr, key);

        for(int item : result){
            System.out.print(item + " ");
        }


        int[] result1 = removeAllOccurrencesUsingStream(arr, key);

        for(int item : result1){
            System.out.print(item + " ");
        }
    }

    public static int[] removeAllOccurrencesUsingLoop(int[] arr, int key){
        int index = 0;
        int temp;
        for(int i = 0; i< arr.length; i++){
            if(arr[i] != key){
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
            }
        }
        return Arrays.copyOf(arr, index);
    }

    public static int[] removeAllOccurrencesUsingStream(int[] arr, int key){

        List<Integer> arrayList = Arrays.stream(arr).boxed().collect(Collectors.toList());

        return  arrayList.stream()
               .filter(item -> item != key)
               .mapToInt(Integer::intValue)
               .toArray();
    }

}
