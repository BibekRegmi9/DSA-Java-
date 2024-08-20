package recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class ValidParenthesis {

    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        generateParenthesis(result, "", 3, 3);
        System.out.println(result);

    }

    private static void generateParenthesis(List<String> result, String current, int open, int close){
        // If no more parentheses can be added, add the current string to the result
        if(open < 1 && close < 1){
            result.add(current);
        }

        // adding open parenthesis
        if(open > 0){
            generateParenthesis(result, current + "(", open-1, close);
        }

        // adding close parenthesis
        if(close > open){
            generateParenthesis(result, current + ")", open, close-1);
        }

    }
}
