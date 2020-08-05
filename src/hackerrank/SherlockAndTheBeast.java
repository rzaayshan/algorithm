package hackerrank;

public class SherlockAndTheBeast {
    static void decentNumber(int n) {
        int i=0;
        StringBuilder res = new StringBuilder();
        while(i<=n){
            int s5=n-i;
            int s3=i;
            if(s5%3==0 && s3%5==0){
                for(int k=0;k<s5;k++)
                    res.append(5);
                for(int k=0;k<s3;k++)
                    res.append(3);
                break;
            }
            i+=5;
        }
        if(res.length()==0) res.append(-1);
        System.out.println(res);

    }
}
