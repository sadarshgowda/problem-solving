package org.example.array;

public class RemoveElements {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,9,8};
        int[] arrayWithoutEvenElement = removeEvenElement(arr);

       for(int item : arrayWithoutEvenElement){
           System.out.println(item);
       }
    }

    public static int[] removeEvenElement(int[] arr){
        int oddCount = 0;

        for(int i=0; i< arr.length;i++){
            if(arr[i]%2 != 0){
                oddCount++;
            }
        }


        int[] arrayWithoutEvenElement = new int[oddCount];

        int index =0;

        for(int j =0; j< arr.length;j++){
            if(arr[j] % 2 != 0){
                arrayWithoutEvenElement[index++] = arr[j];
            }
        }

        return arrayWithoutEvenElement;

    }
}
