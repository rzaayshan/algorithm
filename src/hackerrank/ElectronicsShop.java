package hackerrank;

import java.util.Arrays;

public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max=-1;
        for(int el : keyboards){
            for(int el2 : drives){
                int sum=el+el2;
                if(sum>max && sum<=b)
                    max=sum;
            }
        }
        return max;


    }
}
