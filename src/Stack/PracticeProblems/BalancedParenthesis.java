package Stack.PracticeProblems;

import java.util.Stack;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String str = "[{(})]";
        char[] s = str.toCharArray();
        System.out.println(isBalanced(s));
    }

    private static boolean isBalanced(char[] s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length; i++)
        {
            if (s[i] == '{' || s[i] == '[' || s[i] == '(') {
                stack.push(s[i]);
            }
            else{
                if (stack.isEmpty()) {
                    return false;
                }
                else if(!match(stack.peek(), s[i]))
                    return false;
                else
                    stack.pop();
            }
            }
        return stack.isEmpty();
    }

    private static boolean match(char top, char ch) {
        return (top == '(' && ch == ')') || (top == '{' && ch == '}') || (top == '[' && ch == ']');
    }
}
