package hackerrank;

public class GameOfStones {
    static String gameOfStones(int n) {
        int i=1;
        while (n>1){
            if(n==10)
                n-=3;
            else if(n>=5)
                n-=5;
            else if(n>=3)
                n-=3;
            else
                n-=2;

            i++;
        }

        return (i&1)==0? "First":"Second";
    }

    public static void main(String[] args) {

        System.out.println(gameOfStones(55));
    }
}
