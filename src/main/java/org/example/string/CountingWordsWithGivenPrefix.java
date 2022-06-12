package org.example.string;

public class CountingWordsWithGivenPrefix {
    public static void main(String[] arg){
        String subString = "at";

        String[] str = {"pay","attention","practice","attend"};
        System.out.println("result is " + returnCount(str,subString));
    }


    public static int returnCount(String[] str, String subString){

        int count = 0;
        for(String item : str){
            char[] arr1 = item.toCharArray();
            char[] arr2 = subString.toCharArray();

            int j;
            for(int i=0 ; i<= arr1.length- arr2.length; i++){
                int stringInitialPoint = i;
                int subStringStart = 0;
                for(j = i; j<= i+ arr2.length-1 ; j++){

                    if(arr2[subStringStart++] != arr1[stringInitialPoint++] ){
                        break;
                    }
                }

                if((j-i)==arr2.length){
                    count++;
                    break;
                }
        }
        }
        return count;
    }
}
