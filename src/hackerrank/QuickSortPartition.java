package hackerrank;

public class QuickSortPartition {
    static int[] quickSort(int[] a) {
        /*int n=a.length;
        int p=a[0];
        int[] b = new int [n];
        int[] l = new int [n];
        int[] r = new int [n];
        int j=0,k=0,i=0;
        for (int value : a) {
            if (value < p) {
                l[j++] = value;
            } else if (value > p) {
                r[k++] = value;
            }
        }
        int v=0;
        int z=0;
        while(v<j)
            b[i++]=l[v++];
        b[i++]=p;
        while(z<k)
            b[i++]=r[z++];

        return b;*/
        int n = a.length;
        int p = a[0];
        int []b = new int [n];
        int s=0,e=n-1;
        for (int value : a) {
            if (value < p)
                b[s++] = value;
            else if (value > p)
                b[e--] = value;
        }
        b[s]=p;
        return b;
    }
}
