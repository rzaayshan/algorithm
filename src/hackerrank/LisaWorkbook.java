package hackerrank;

import org.w3c.dom.ls.LSOutput;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LisaWorkbook {

    static class Page{
        int ch;
        int num;
        List<Integer> pr;

        public Page(int ch, int num, List<Integer> pr) {
            this.ch = ch;
            this.num = num;
            this.pr=pr;
        }

        @Override
        public String toString() {
            return String.format("Page{ch=%d, num=%d, pr=%s}", ch, num, pr);
        }
    }
    static int workbook(int n, int k, int[] a) {
        LinkedList<Page> pages = new LinkedList<Page>();
        int num=1;
        for(int i=0;i<n;i++){
            int r=a[i];
            int z=0;
            while (r>0){
                int first = (k*z++)+1;
                int last;

                if(r<k){
                    last=first+r%k-1;
                }
                else{
                    last=first+k-1;
                }
                r=r-k;
                pages.add(new Page(i+1,num++, IntStream.rangeClosed(first,last).boxed().collect(Collectors.toList())));
            }
        }
        System.out.println(pages);
        return (int) IntStream.range(0,pages.size()).filter(i->
                pages.get(i).pr.contains(i+1)).count();

    }

    public static void main(String[] args) {
        System.out.println(workbook(5,3, new int[]{4, 2, 6, 1, 10}));
    }
}
