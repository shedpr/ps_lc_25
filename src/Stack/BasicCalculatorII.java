package Stack;

import java.util.Stack;

public class BasicCalculatorII {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        s = s.trim();
        if(s == null || s.length() == 0) {
            return 0;
        }

        int sum = 0;
        char operation = '+';
        for (int i = 0; i<s.length(); i++) {
            char ch = s.charAt(i);
            // System.out.println(ch);
            if(Character.isDigit(ch)) {
                sum = sum * 10 + ch - '0';
            }

            if(!Character.isDigit(ch) && !Character.isWhitespace(ch) /* || i == s.length() - 1*/) {
                //System.out.println(operation);
                if(operation == '+') {
                    stack.push(sum);
                }else if(operation == '-') {
                    stack.push(-sum);
                }else if(operation == '*') {
                    System.out.println(sum);
                    stack.push(stack.pop() * sum);
                }else if(operation == '/') {
                    stack.push(stack.pop() / sum);
                }
                operation = ch;
                sum =0;
            }


        }

        int result = 0;
        while (!stack.isEmpty()) {
            // System.out.println(stack.peek());
            result += stack.pop();
        }
        return result;
    }
}
