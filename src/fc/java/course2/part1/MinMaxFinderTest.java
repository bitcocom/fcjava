package fc.java.course2.part1;

import fc.java.model2.MinMaxFindler;

public class MinMaxFinderTest {
    public static void main(String[] args) {
        int[] arr={4,3,1,2,5};
        int min=MinMaxFindler.findMin(arr);
        int max=MinMaxFindler.findMax(arr);
        System.out.println("min = " + min); // 1
        System.out.println("max = " + max); // 9
    }
}
