package org.example.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CommonElements {
    public static void main(String[] args) {
        String[] a = {"a", "b", "c", "d", "e", "f"};
        String[] b = {"b", "d", "e", "h", "g", "c"};


        String[] result = findCommonElementsUsingNestedLoops(a, b);
        findCommonElements(a, b);

        //print the result
        for (int i = 0; i < result.length; i++) {
            System.out.println("  " + result[i]);
        }

    }

    public static String[] findCommonElementsUsingNestedLoops(String[] arr1, String[] arr2) {
        int count = 0;
        String[] result;

        // Count the number of common elements
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                }
            }
        }

        System.out.println("count is " + count);

        // Create an array to store common elements
        result = new String[count];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i].equals(arr2[j])) {
                    result[index++] = arr1[i];
                }
            }
        }

        return result;
    }


    public static void findCommonElements(String[] arr1, String[] arr2) {
        Set<String> set = new HashSet<>();
        Set<String> commonElements = new HashSet<>();

        for (String num : arr1) {
            set.add(num);
        }

        for (String num : arr2) {
            if (set.contains(num)) {
                commonElements.add(num);
            }
        }

        // Print common elements
        System.out.println("Common Elements: " + commonElements);
    }

}
