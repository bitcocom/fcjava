package fc.java.course2.part1;
// import java.lang.*;
public class HelloWorldString {
    public static void main(String[] args) {
        String str=new String("HelloWorld"); // Heap
        System.out.println(str.toString());

        String str1="HelloWorld"; // Literal Pool
        System.out.println(str1.toString());
    }
}
