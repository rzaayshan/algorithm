package cracking;

import java.util.Arrays;

public class Permutation {

    static boolean isPer(String a, String b){
        return Arrays.equals(a.chars().sorted().toArray(), b.chars().sorted().toArray());
    }

    public static void main(String[] args) {
        System.out.println(isPer("apple","elpap"));

    }
}
