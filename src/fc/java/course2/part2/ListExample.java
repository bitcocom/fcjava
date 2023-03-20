package fc.java.course2.part2;

import java.util.ArrayList;

public class ListExample {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>(); // String[]
        list.add("apple"); // new String("apple")
        list.add("banana");
        list.add("cherry");
        list.add("banana");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(list.size()-1));

        list.remove(0);
        list.set(1,"orange");

        for(String str : list){
            System.out.println(str);
        }
   }
}
