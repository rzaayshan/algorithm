package hackerrank;

import java.util.stream.IntStream;

public class FizzBuzz {
    public static void fizzBuzz(int n) {
        IntStream.rangeClosed(0,n).forEach(i->{
            if(i%15==0)
                System.out.println("FizzBuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        });

    }
}
