package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PascalsTriangleII {
    public List<Integer> getRow(int rowIndex) {
        if(rowIndex==0)
            return Arrays.asList(1);
        List<List<Integer>> r = new ArrayList<>();
        r.add(Arrays.asList(1));
        int k=0;
        while (rowIndex>0){
            List<Integer> l = new ArrayList<>();
            for(int i=0;i<r.get(k).size()+1;i++){
                if(i==0)
                    l.add(r.get(k).get(i));
                else if(i==r.get(k).size())
                    l.add(r.get(k).get(i-1));
                else
                    l.add(r.get(k).get(i-1)+r.get(k).get(i));
            }
            r.add(l);
            rowIndex--;
            k++;
        }

        return r.get(r.size()-1);


    }
}
