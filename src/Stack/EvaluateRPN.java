package Stack;

import java.util.Stack;

public class EvaluateRPN {
    Stack<Integer> stack = new Stack<>();

    public int evalRPN(String[] tokens) {
        for (String token : tokens) {
            if (token.equals("+") || token.equals("-") ||
                    token.equals("*") || token.equals("/")) {
                int val1 = stack.pop();
                int val2 = stack.pop();
                int interim = 0;
                switch (token) {
                    case "+":
                        interim = val2 + val1;
                        break;
                    case "-":
                        interim = val2 - val1;
                        break;
                    case "*":
                        interim = val2 * val1;
                        break;
                    case "/":
                        interim = val2 / val1;
                        break;
                }
                stack.add(interim);
            } else {
                stack.add(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
