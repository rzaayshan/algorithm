package hackerrank;

import java.util.Comparator;

public class SortingComparator {
    class Player {
        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }
    }
    class Checker implements Comparator<Player> {
        // complete this method
        public int compare(Player a, Player b) {
            return a.score>b.score ? -1 : a.score<b.score ? 1 : a.name.compareTo(b.name);
            /*if(a.score>b.score)
                return -1;
            else if(a.score<b.score)
                return 1;
            else {
                return a.name.compareTo(b.name);
            }*/


        }
    }
}
