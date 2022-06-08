package org.example.string;

public class TruncateSentence {
    public static void main(String[] args) {
        String str = "Hello how are you Contestant";
        int k = 4;
        System.out.println("string is " + returnTruncateSentence(str, k));
    }

    public static String returnTruncateSentence(String str, int k){
        String[] arr = str.split(" ");
        String result = "";
        for(int i = 0; i < k; i++){
            result += arr[i];
            result += " ";
        }

        return result.trim();
    }
}
