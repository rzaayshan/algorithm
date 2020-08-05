package hackerrank;

public class ASCIIPAsha {
    public static boolean isTwoDigit(int a){
        return (a>=65 && a<=90) || (a>=97 && a<100) || a==32;
    }
    public static String decode(String encoded) {
        StringBuilder c = new StringBuilder();
        StringBuilder result = new StringBuilder();
        for(int i=encoded.length()-1;i>1;){
            c.delete(0,c.length());
            c.append(encoded.charAt(i));
            c.append(encoded.charAt(--i));
            int num = Integer.parseInt(c.toString());

            if(isTwoDigit(num)) {
                result.append((char) num);
            }
            else {
                c.append(encoded.charAt(--i));
                result.append((char)Integer.parseInt(c.toString()));
            }
            i--;

        }
        return result.toString();

    }

    public static void main(String[] args) {
        System.out.println(decode("23511011501782351112179911801562340161171141148"));
    }
}
