package hackerrank;

public class LilyHomework {
    static int lilysHomework(int[] arr) {
        int n = arr.length;
        int min,j;
        int c=0;
        int swap;
        for(int i=0;i<n-1;i++){
            min=i;
            j=i+1;
            while (j<n){
                if(arr[min]>arr[j])
                    min=j;
                j++;
            }
            if(i!=min){
                swap=arr[min];
                arr[min]=arr[i];
                arr[i]=swap;
                c++;
            }

        }
        return c;


    }

}
