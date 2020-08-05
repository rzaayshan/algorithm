package hackerrank;

public class TimeConversion {

    static String timeConversion(String s){
        int n= s.length();
        String ap= s.substring(n-2);
        int h=Integer.parseInt(s.substring(0,2));
        int m=Integer.parseInt(s.substring(3,5));
        int se=Integer.parseInt(s.substring(6,n-2));

        if(ap.equals("AM")){
            if(h==12)
                h=0;
        }
        else{
            if(h!=12){
                h+=12;
                if(h==24)
                    h=0;
            }

        }

        return String.format("%02d:%02d:%02d",h,m,se);
    }

    static String timeConversion1(String s) {
        int n=s.length();
        String ap = s.substring(n-2);
        if(ap.equals("AM"))
            return s.substring(0,n-2);
        int h = Integer.parseInt(s.substring(0,2));
        StringBuilder res = new StringBuilder();
        h=h+12;
        String hs;
        if(h==24)
            hs="00";
        else if(h<10)
            hs=String.format("0%d",h);
        else
            hs=Integer.toString(h);
        res.append(hs);
        res.append(s, 2, n-2);
        return res.toString();
    }

    public static void main(String[] args) {
        String s = "assdas";
        System.out.println(timeConversion("12:00:00AM"));
    }
}
