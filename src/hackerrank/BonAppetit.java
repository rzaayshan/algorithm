package hackerrank;

import java.util.List;

public class BonAppetit {
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int result=b-(bill.stream().reduce(0, Integer::sum)-bill.get(k))/2;
        System.out.println(result==0? "Bon Appetit" : result);
    }
}
