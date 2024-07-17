package org.example.easy;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }

    // Time complexity: O(n)
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (var c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {return false;}
                char top = stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
