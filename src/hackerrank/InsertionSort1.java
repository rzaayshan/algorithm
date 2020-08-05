package hackerrank;

import java.util.Arrays;

public class InsertionSort1 {
    static void print(int []a){
        Arrays.stream(a).forEach(el-> System.out.printf("%d ",el));
        System.out.println();
    }
    static void insertionSort1(int n, int[] arr) {
        int k = arr[n-1];
        int j=n-2;
        while(j>=0 && arr[j]>k){
            arr[j+1]=arr[j];
            j--;
            print(arr);
        }
        arr[j+1]=k;
        print(arr);


    }
}
