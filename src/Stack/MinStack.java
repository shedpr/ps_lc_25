package Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinStack {
    Stack<Integer> st;
    List<Integer> minList;

    public MinStack() {
         st = new Stack();
         minList = new ArrayList<>();
         minList.add(Integer.MAX_VALUE);
    }

    public void push(int val) {
        st.push(val);
        if (val <= minList.get(minList.size() -1)) {
            minList.add(val);
        }
    }

    public void pop() {
        int temp = st.pop();
        if (temp == minList.get(minList.size() -1)) {
            minList.remove(minList.size()-1);
        }
    }

    public int top() {
       return st.peek();
    }

    public int getMin() {
        return  minList.get(minList.size() - 1);
    }
}
