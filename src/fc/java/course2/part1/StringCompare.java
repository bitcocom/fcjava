package fc.java.course2.part1;

public class StringCompare {
    public static void main(String[] args) {
        String str1="Hello";
        String str2="World";
        if(str1.equals(str2)){
            System.out.println("str1==str2");
        }else{
            System.out.println("str1!=str2"); // O
        }

        String str3="apple";
        String str4="banana";

        int result=str3.compareTo(str4); // 0, 음수, 양수
        if(result==0){
            System.out.println("str3==str4");
        }else if(result<0){
            System.out.println("str3<str4");
        }else{
            System.out.println("str3>str4");
        }

    }
}
