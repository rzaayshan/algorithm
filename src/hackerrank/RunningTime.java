package hackerrank;

public class RunningTime {
    static int runningTime(int[] a) {
        int shift=0;
        for(int i=0;i< a.length;i++){
            int key = a[i];
            int j = i-1;
            while(j>=0 && key<a[j]){
                a[j+1]=a[j];
                j--;
                shift++;
            }
            a[j+1]=key;
            shift++;
        }
        return shift;


    }
}
