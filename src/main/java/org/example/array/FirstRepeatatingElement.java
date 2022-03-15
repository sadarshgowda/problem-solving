package org.example.array;

public class FirstRepeatatingElement {
    public static void main(String[] args) {
        int[] arr = {1,5,3,4,3,5,6};
        System.out.println("first non repetitive element is " + approach1(arr));
    }

    public static int approach1(int[] arr){
        for(int i=0; i < arr.length; i++){
            for(int j =0; j < arr.length; j++){
                if(i!=j && (arr[i]==arr[j])){
                    return arr[i];
                }
            }
        }

        return -1;
    }
}
