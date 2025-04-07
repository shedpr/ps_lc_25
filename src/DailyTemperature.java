import java.util.Deque;
import java.util.LinkedList;

public class DailyTemperature {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> stack = new LinkedList<>();
        int[] resArr = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int top = stack.peek();
                resArr[top] = i - top;
                stack.pop();
            }
            stack.push(i);
        }
        return resArr;
    }
}
