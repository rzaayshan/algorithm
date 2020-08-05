package hackerrank;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class CompareTriplets {
    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        Iterator<Integer> ita = a.iterator();
        Iterator<Integer> itb = b.iterator();
        int sa,sb;
        int []score={0,0};
        List <Integer> l = new LinkedList<>();
        while(ita.hasNext() && itb.hasNext()){
            sa=ita.next();
            sb=itb.next();
            if(sa>sb)
                score[0]+=1;
            else if(sa<sb)
                score[1]+=1;
        }
        l.add(score[0]);
        l.add(score[1]);
        return l;
    }

    public static void main(String[] args) {
        System.out.println(compareTriplets(List.of(1,2,3),List.of(3,2,4)));
    }
}
