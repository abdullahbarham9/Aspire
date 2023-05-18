package assignment5;

import java.util.Deque;
import java.util.LinkedList;

public class ParenthesisValidator {


    public static boolean isValid(String data) {
        if(data==null){
            System.out.println("Error: data is null");
            return false;
        }
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < data.length(); i++) {
            char ch = data.charAt(i);
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(isValid("(()))")); // Output: false
        System.out.println(isValid("((()))")); // Output: true
    }
}
