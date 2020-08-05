package hackerrank;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GridChallange {
    static char at(int i, int j, String[] grid){
        return grid[i].charAt(j);
    }
    static String gridChallenge(String[] grid) {
        for(int i=0;i<grid.length;i++){
            grid[i]= Stream.of(grid[i].split("")).sorted().collect(Collectors.joining());
        }
        for(int j=0;j<grid[0].length();j++)
            for(int i=0;i<grid.length-1;i++){
                if (at(i, j, grid) > at(i+1, j, grid))
                    return "NO";
            }

        return "YES";

    }

    public static void main(String[] args) {
        System.out.println(gridChallenge(new String[] {"ebacd", "fghij", "olmkn"}));
    }
}
