package stackk;

import java.util.Stack;

public class ValidParenthesis {
    public static boolean isValidParenthesis(String input){
        if(input.isEmpty()){
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for(char ch : input.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            } else {
                // If stack is empty or mismatched closing bracket
                if(stack.isEmpty()) return false;

                char top = stack.pop();
                if((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')
                ){
                    return false;
                }

            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "({[]})]";
        boolean ans = isValidParenthesis(input);
        System.out.println(ans);
    }
}
