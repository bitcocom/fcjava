package fc.java.course2.part2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamExample {
    public static boolean isEven(int number){
        return number%2==0;
    }

    public static void main(String[] args) {
        List<Integer> numbers= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        Predicate<Integer> isEven=n->n%2==0;
        int sumOfSquares=numbers.stream()
                .filter(StreamExample::isEven) // n->n%2==0 isEven.test()
                .sorted()
                .map(n->n*n)
                .reduce(0, Integer::sum);
        System.out.println("sumOfSquares = " + sumOfSquares); // 220
        
    }
}
