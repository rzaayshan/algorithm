package inter;

public class Median {
    static double find(int [] a, int [] b){
        int med1 = (a.length-1)/2;
        int med2 = (b.length-1)/2;

        if((a.length+b.length)%2==0){
            return (double)(a[med1]+b[med2])/2;
        }

        else return Math.max(a[med1], b[med2]);
    }
    public static void main(String[] args) {
        int []arr1 = new int []{1, 3, 5};
        int []arr2 = new int []{2, 4, 6,7};
        System.out.println(find(arr1, arr2));

        //1 2 3 4 5 6 7

    }
}
