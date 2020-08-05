package hackerrank;

import java.util.Comparator;

public class TaumBday {


    static class Present implements Comparable<Present> {
        long count;
        long cost;
        Present(int count, int cost){
            this.count=count;
            this.cost=cost;
        }

        @Override
        public int compareTo(Present o) {
            return Long.compare(this.cost,o.cost);
        }

        @Override
        public String toString() {
            return String.format("Present{count=%d, cost=%d}", count, cost);
        }
    }

    public static long taumBday(int b, int w, int bc, int wc, int z) {
        Present pb = new Present(b,bc);
        Present pw = new Present(w,wc);
        if(pb.compareTo(pw)==0)
            return b*bc+w*wc;
        Present min = pb.compareTo(pw)<0?pb:pw;
        Present max = pb.compareTo(pw)>0?pb:pw;
        System.out.println(min);
        System.out.println(max);
        return max.count*Math.min(max.cost,(min.cost+z))+
                min.count*min.cost;
    }

    public static void main(String[] args) {
        System.out.println(taumBday(27984, 1402,
                619246, 615589, 247954));
        System.out.println(27984L*619246L+1402*615589);
        //System.out.println(27984*(615589+247954)+1402*615589);
    }

//    18192035842
//    1012166658
}
