package hackerrank;

public class BubbleSort {
    static void swap(int a, int b){

    }
    static void countSwaps(int[] a) {
        int n = a.length;
        int count=0;
        boolean swapped;
        for(int i=0;i<n;i++){
            swapped = false;
            for(int j=0;j<n-i-1;j++)
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    swapped=true;
                    count++;
                }
            if(!swapped)
                break;
        }
        System.out.printf("Array is sorted in %d swaps.\n" +
                "First Element: %d\n" +
                "Last Element: %d", count, a[0], a[a.length-1]);


    }
}
