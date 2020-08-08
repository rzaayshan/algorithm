package hackerrank;

public class SuperReducingString {
    static String superReducedString(String s) {
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                i++;
                continue;
            }
            builder.append(s.charAt(i));
        }

        boolean flag=true;

        while (flag){
            flag=false;
            for(int i=0;i<builder.length()-1;i++)
                if(builder.charAt(i)==builder.charAt(i+1)){
                    builder.delete(i,i+2);
                    flag=true;
                }
        }


        return builder.length()==0 ? "Empty String" : builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(superReducedString("baab"));
    }
}
