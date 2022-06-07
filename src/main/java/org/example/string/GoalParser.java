package org.example.string;

public class GoalParser {
    public static void main(String[] args) {
        String input = "G()()()()(al)";
        System.out.println(inputParser(input));
    }

    public static String inputParser(String input){
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i<input.length(); i++){
            if(input.charAt(i) == '(' && input.charAt(i+1) == 'a'){
                builder.append("al");
            }

            else if(input.charAt(i) == '(' && input.charAt(i+1) == ')'){
                builder.append("o");
            }

            else if(input.charAt(i) == 'G') {
                builder.append("G");
            }

            System.out.println(builder);
        }
        return String.valueOf(builder);
    }
}
