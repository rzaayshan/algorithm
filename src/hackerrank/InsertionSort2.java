package hackerrank;

import java.util.Arrays;

public class InsertionSort2 {
    static void print(int []a){
        Arrays.stream(a).forEach(el-> System.out.printf("%d ",el));
        System.out.println();
    }
    static void insertionSort2(int n, int[] a) {
        for(int i=1;i<n;i++){
            int key=a[i];
            int j=i-1;
            while(j>=0 && a[j]>key){
                a[j+1]=a[j];
                j--;
            }
            a[j+1]=key;
            print(a);
        }
    }
}
