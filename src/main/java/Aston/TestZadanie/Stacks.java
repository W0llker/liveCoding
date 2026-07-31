package Aston.TestZadanie;

import java.util.Stack;

public class Stacks {
    static void main() {
        System.out.println(stringCheck("()"));
        System.out.println(stringCheck("({[]})"));
        System.out.println(stringCheck("(]"));
        System.out.println(stringCheck("([)]"));
    }

    private static boolean stringCheck(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if ((ch == ')' && stack.peek() == '(') || (ch == ']' && stack.peek() == '[') || (ch == '}' && stack.peek() == '{')) {
                stack.pop();
            } else {
                return false;
            }
        }
        return true;
    }
}
