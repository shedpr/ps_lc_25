package ArrayHashing;

import java.util.ArrayList;
import java.util.List;

public class CreateParenthesis {
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        createParenthesis(n, 0, 0, "");
        return res;
    }
    // why the fuck is ++ different than +1

    void createParenthesis(int n, int left, int right, String interim) {
        if(interim.length() == 2*n) {
            res.add(interim);
            return;
        }
        if(left < n) {
            createParenthesis(n, left+1, right, interim + "(");
        }
        if (right < left) {
            createParenthesis(n, left+1, ++right, interim + ")");
        }
    }
}
