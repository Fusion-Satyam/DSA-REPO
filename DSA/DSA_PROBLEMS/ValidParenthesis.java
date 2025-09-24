package DSA_PROBLEMS;

import java.util.Stack;

public class ValidParenthesis {
    public boolean isValid(String s) {
        Stack <Character> stack = new Stack<>();

       for(char c : s.toCharArray()){
            if(c=='('){
                stack.push(')');
            }
    }
    public static void main(String[] args) {
        ValidParenthesis vp = new ValidParenthesis();
        String s = "{[]}";
        System.out.println(vp.isValid(s));
    }
}
