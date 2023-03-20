package fc.java.course2.part1;

public class StringManipulation {
    public static void main(String[] args) {
        // HelloWorld 라는 문자열을 생성하세요.
        int a=10;
        String str="HelloWorld";
        System.out.println(str.charAt(1)); // 'e'
        System.out.println(str.replaceAll("o", "X")); // HellXWXrld
        System.out.println(str.length()); // 10
        System.out.println(str.toUpperCase()); // HELLOWORLD
        System.out.println(str.toLowerCase()); // helloworld
        System.out.println(str.substring(5)); // World
        System.out.println(str.substring(5,8)); // Wor
        System.out.println(str.indexOf("Wr")); // 5, -1
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
