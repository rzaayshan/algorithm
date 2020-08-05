package hackerrank;

public class CountingSort2 {
    static int max(int []a){
        int max = a[0];
        for (int value : a) {
            max = Math.max(max, value);
        }
        return max;
    }
    static int[] countingSort(int[] a) {
        int l = max(a);
        int[] c = new int[l+1];
        int[] sorted = new int[a.length];
        int j=0;
        for (int value : a) {
            c[value]++;
        }
        for(int i=0;i<c.length;i++){
            while(c[i]>0){
                sorted[j++]=i;
                c[i]--;
            }
        }
        return sorted;
    }
}
