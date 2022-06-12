package org.example.string;

public class SubStringCheck {
    public static void main(String[] args) {
        String str = "attention";
        String subString = "a";
        System.out.println("result is " + checkSubStringInGivenString(str,subString));
    }

    public static boolean checkSubStringInGivenString(String str, String subString){
        char[] arr1 = str.toCharArray();
        char[] arr2 = subString.toCharArray();

        int count = 0;
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
                return true;
            }
        }
        return false;
    }
}
