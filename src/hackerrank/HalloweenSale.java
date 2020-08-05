package hackerrank;

import org.w3c.dom.ls.LSOutput;

public class HalloweenSale {
    static int howManyGames(int p, int d, int m, int s) {
       int mon=p;
       int i=1;
       while(true){
           if(mon>=s)
               return i-1;
           p-=d;
           if(p<=m)
               break;
           mon+=p;
           i++;

       }
       i+=(s-mon)/m;
       return i;
    }

    public static void main(String[] args) {

        System.out.println(howManyGames(100, 1, 1, 99));
        System.out.println(howManyGames(100, 19, 1, 180));

    }

}
