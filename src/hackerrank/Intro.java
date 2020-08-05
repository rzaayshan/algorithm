package hackerrank;

import java.util.stream.IntStream;

public class Intro {
    static int introTutorial(int V, int[] arr) {
        return IntStream.range(0,arr.length).filter(i->arr[i]==V).boxed().findFirst().get();
    }
}
