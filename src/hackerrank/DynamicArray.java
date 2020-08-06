package hackerrank;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class DynamicArray {
    public static List<Integer> dynamicArray(int n, List<List<Integer>> queries) {
        LinkedList<LinkedList<Integer>> r = new LinkedList<>();
        LinkedList<Integer> result = new LinkedList<>();
        int lastAnswer =0;
        for (List<Integer> query : queries) {
            int x = query.get(1);
            int y = query.get(2);
            int k = (x ^ lastAnswer) % n;
            if (query.get(0) == 1) {
                if (k>=r.size())
                    r.add(new LinkedList<>());
                r.get(k).add(y);
            } else {
                lastAnswer = r.get(k).get(y%r.get(k).size());
                result.add(lastAnswer);
            }
        }
//        queries.forEach(q->{
//            int x=q.get(1);
//            int y=q.get(2);
//            int k;
//            if(q.get(0)==1){
//                k=(x^lastAnswer[0])%n;
//                if(r.get(k)==null)
//                    r.add(new LinkedList<>());
//                r.get(k).add(y);
//            }
//            else{
//                k=(x^lastAnswer[0])%n;
//                lastAnswer[0]=r.get(k).get(y);
//                result.add(lastAnswer[0]);
//            }
//
//        });
        return result;

    }
}
