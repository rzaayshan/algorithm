package hackerrank;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BigSorting {
    static String[] bigSorting(String[] unsorted) {
        return (String[]) Arrays.stream(unsorted).sorted().toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(bigSorting(new String[]{"31415926535897932384626433832795", "1", "5", "10", "13"})));
    }
}
