package hackerrank;

import java.util.List;

public class BirthdayChocolate {
    static int birthday(List<Integer> s, int d, int m) {
        int r = 0;
        int sum=0;
        for(int i=0;i<m;i++){
            sum+=s.get(i);
        }
        if(sum==d) r++;
        for(int i=m;i<s.size();i++){
            sum = sum - s.get(i-m) + s.get(i);
            if(sum==d) r++;
        }
        return r;
    }
}
