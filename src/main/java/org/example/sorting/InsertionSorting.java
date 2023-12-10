package org.example.sorting;

public class InsertionSorting {

    //The Insertion Sort algorithm sorts an array by  taking one element from unsorted sub list and finds an appropriate place in the sorted sublist
    //given array, divided into two parts, sorted and unsorted sublist
    //take one variable from unsroted sublist and find appropriate place for that in sorted sublist
    public static void main(String[] args) {
        int[] arr = {7,4,10,8,3,1};

        int[] result = insertionSort(arr);
        //printing result
        for (int i = 0; i < result.length; i++){
            System.out.print(arr[i] + " ");
        }

    }


    public static int[] insertionSort(int[] arr){

        for(int i=1; i < arr.length; i++){
            int temp  = arr[i];
            int j = i-1;
            while (j>= 0 && arr[j]>temp){
                arr[j+1] = arr[j];
                j--;
            }

            arr[j+1] = temp;
        }
        return arr;
    }
}
