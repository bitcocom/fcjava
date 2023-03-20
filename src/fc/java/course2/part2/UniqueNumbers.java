package fc.java.course2.part2;

import java.util.HashSet;
import java.util.Set;

public class UniqueNumbers {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,2,4,6,7,1,3};

        Set<Integer> uniqueNums=new HashSet<>();
        for(int number : nums){
            uniqueNums.add(number);
        }

        System.out.println("Unique numbers....");
        for(int number : uniqueNums){
            System.out.println(number);
        }
    }
}
