package inter;

import javax.crypto.spec.PSource;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorVsArrayList {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(25);
        v.add(30);
        System.out.println(v.capacity());
        Enumeration<Integer> e = v.elements();
        Iterator<Integer> i = v.iterator();
        while (e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
        while (i.hasNext()){
            int c = i.next();
            System.out.println(c);
            if(c==10)
                i.remove();
        }

        System.out.println(v);
    }
}
