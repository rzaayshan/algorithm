package hackerrank;

import java.util.*;

public class FullCountingSort {
    static void countSort(List<List<String>> a) {
        /*int n=a.size();
        HashMap<String, String> map = new HashMap<>();
        for(int i=0;i<n/2;i++){
            List<String> el = a.get(i);
            if(map.containsKey(el.get(0)))
                map.put(el.get(0),String.format("%s %s",map.get(el.get(0)),"-"));
            else
                map.put(el.get(0),"-");
        }
        for(int i=n/2;i<n;i++){
            List<String> el = a.get(i);
            if(map.containsKey(el.get(0)))
                map.put(el.get(0),String.format("%s %s",map.get(el.get(0)),el.get(1)));
            else
                map.put(el.get(0),el.get(1));
        }
        for(Map.Entry<String,String> e : map.entrySet()){
            System.out.printf("%s ",e.getValue());
        }*/

//        long n=a.size();
//        HashMap<String, List<String>> map = new HashMap<>();
//        for(int i=0;i<n/2;i++){
//            List<String> el = a.get(i);
//            if(map.containsKey(el.get(0)))
//                map.get(el.get(0)).add("-");
//            else{
//                LinkedList <String> l = new LinkedList<>();
//                l.add("-");
//                map.put(el.get(0),l);
//            }
//        }
//        for(long i = n /2; i<n; i++){
//            List<String> el = a.get((int) i);
//            if(map.containsKey(el.get(0)))
//                map.get(el.get(0)).add(el.get(1));
//            else{
//                LinkedList <String> l = new LinkedList<>();
//                l.add(el.get(1));
//                map.put(el.get(0),l);
//            }
//        }
//
//        StringBuilder result = new StringBuilder();
//        for(Map.Entry<String,List<String>> e : map.entrySet()){
//            for (String s : e.getValue()) result.append(String.format("%s ",s));
//        }
//        System.out.println(result);
        int n=a.size();
        StringBuilder [] el = new StringBuilder[n];
        for(int i=0;i<n/2;i++){
            List<String> l = a.get(i);
            el[Integer.parseInt(l.get(0))].append(String.format("%s ","-"));
        }
        for(int i=n/2;i<n;i++){
            List<String> l = a.get(i);
            el[Integer.parseInt(l.get(0))].append(String.format("%s ",l.get(1)));
        }
        StringBuilder el2 = new StringBuilder();
        for(int i=0;i<n;i++)
            el2.append(el[i]);

        System.out.println(el2.toString());





    }
}
