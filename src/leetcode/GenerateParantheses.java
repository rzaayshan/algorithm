package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> ans = new ArrayList<>();
        backtracking(ans,"", 0, 0, n);
        return ans;

    }

    private void backtracking(ArrayList<String> ans, String b, int open, int close, int max) {
        if(b.length()==max*2){
            ans.add(b.toString());
            return;
        }
        if(open<max)
            backtracking(ans, b+"(",open+1, close, max);
        if(close<open)
            backtracking(ans, b+")",open, close+1, max);
    }


}
