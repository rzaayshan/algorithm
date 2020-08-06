package hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SherlockAndArray {
    static String balancedSums(List<Integer> a) {
        if(a.size()==1){
            return "YES";
        }
        int sum1 = 0;
        int sum2 = IntStream.range(1,a.size()).map(i->a.get(i)).sum();
        for(int i=0;i<a.size()-1;i++){
            if(sum1==sum2)
                return "YES";
            sum1+=a.get(i);
            sum2-=a.get(i+1);

        }
        return "NO";


    }

    public static void main(String[] args) {
        System.out.println(balancedSums(Arrays.asList(1)));
    }
}
