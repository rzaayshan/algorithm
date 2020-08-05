package hackerrank;

import java.util.LinkedList;

public class StrongPassword {
    static class Pass{
        LinkedList<String> num=new LinkedList<>();
        LinkedList<String> low=new LinkedList<>();
        LinkedList<String> up=new LinkedList<>();
        LinkedList<String> spec=new LinkedList<>();
    }

    static int minimumNumber(int n, String password) {
        int l=password.length();
        String numbers = "0123456789";
        String lower_case = "abcdefghijklmnopqrstuvwxyz";
        String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String special_characters = "!@#$%^&*()-+";
        Pass pass = new Pass();
        int i=0;
        int req=l<6?6-password.length():0;
        password.chars().mapToObj(p->(char)p).map(p->String.valueOf(p))
                .forEach(p->{
            if(numbers.contains(p))
                pass.num.add(p);
            else if(lower_case.contains(p))
                pass.low.add(p);
            else if(upper_case.contains(p))
                pass.up.add(p);
            else if(special_characters.contains(p))
                pass.spec.add(p);
        });
        if(pass.num.size()==0)
            i++;
        if(pass.low.size()==0)
            i++;
        if(pass.up.size()==0)
            i++;
        if(pass.spec.size()==0)
            i++;
        if(req<i)
            req=i;

        return req;
    }

    public static void main(String[] args) {
        System.out.println(minimumNumber(3,"E!%Z@"));
    }
}
