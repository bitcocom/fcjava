package fc.java.course2.part2;

import fc.java.model2.Pair;

import java.util.*;

public class PairGenericTest {
    public static void main(String[] args) {
        Pair<String, Integer> pair=new Pair<>("hello", 1);
        System.out.println(pair.getKey()); // hello
        System.out.println(pair.getValue()); // 1
        // 검색을 빠르게 할수있는 자료구조(HashMap, Hashtable)
        Map<String, Integer> maps=new HashMap<>();
        maps.put("kor", 60);
        maps.put("eng", 80);
        maps.put("math", 70);

        System.out.println(maps.get("kor")); // 60
        System.out.println(maps.get("eng")); // 80
        System.out.println(maps.get("math")); // 70
    }
}
