package fc.java.course2.part2;

import java.util.Arrays;
import java.util.function.IntSupplier;
import java.util.stream.IntStream;

public class StreamAPITest {
    public static void main(String[] args) {
        int[] numbers= {1,2,3,4,5};
       /* int even=0;
        for(int num : numbers){
            if(num%2==0){
                even+=num;
            }//
        }//*/
        //IntStream stream=Arrays.stream(numbers);
        int sumOfEvens=Arrays.stream(numbers)
                        .filter(n->n%2==0) // n->n%2==0 : 람다식
                        .sum();

        System.out.println("sumOfEvens = " + sumOfEvens); //6

        int[] evenNumbers=Arrays.stream(numbers)
                .filter(n->n%2==0)
                .toArray();
        for(int even : evenNumbers){
            System.out.println("even = " + even);
        }
    }
}
