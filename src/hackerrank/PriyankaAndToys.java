package hackerrank;

public class PriyankaAndToys {
    static int toys(int[] w) {
        int k=0;
        for(int i=0;i<w.length-1;i++){
            int min=w[i];
            while (i<w.length-1&&w[i+1]<min+4)
                i++;
            k++;
        }
        return k;


    }

    public static void main(String[] args) {
        System.out.println(toys(new int[]{1, 2, 3, 21, 7, 12, 14, 21}));
    }
}
