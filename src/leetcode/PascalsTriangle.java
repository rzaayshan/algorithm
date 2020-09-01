package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        if(numRows==0)
            return new ArrayList<>();
        List<List<Integer>> r = new ArrayList<>();
        r.add(Arrays.asList(1));
        int k=0;
        while (numRows>1){
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
            numRows--;
            k++;
        }

        return r;


    }

}
