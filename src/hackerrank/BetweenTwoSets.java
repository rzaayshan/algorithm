package hackerrank;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class BetweenTwoSets {
    private static boolean isDivide(int i, List<Integer> b) {
        return (int)b.stream().filter(e->e%i==0).count()==b.size();
    }
    private static boolean isBeDividen(int i, List<Integer> a) {
        return (int)a.stream().filter(e->i%e==0).count()==a.size();
    }
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int bMin = b.stream().min(Comparator.comparingInt(i -> i)).get();
        int count=0;
        for(int i=2;i<=bMin;i++){
            if(isDivide(i,b) && isBeDividen(i,a)){
                    count++;
            }
        }
        return count;
    }




}
