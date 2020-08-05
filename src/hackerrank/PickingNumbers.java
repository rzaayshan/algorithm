package hackerrank;

import java.util.List;


public class PickingNumbers {

    public static int pickingNumbers(List<Integer> a) {
        int[] s = a.stream().sorted().mapToInt(x->x).toArray();
        int max=0;
        for(int i=1;i<s.length;i++){
            int k=1;
            int key=s[i-1];
            while(i<s.length && (key==s[i] || key==s[i]-1)){
                k++;
                i++;

            }
            max=Math.max(max,k);
        }
        return max;
    }

}
