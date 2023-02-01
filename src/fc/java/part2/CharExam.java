package fc.java.part2;

public class CharExam {
    public static void main(String[] args) {
        // Q. ‘1’+’2’+’3’+’4’+’5’=15이 나오도록 프로그래밍 하시요
        int sum=0; // '0'->48
        sum=sum+('1'-'0'); // '1'->49-'0'(48)=1
        sum=sum+('2'-'0');
        sum=sum+('3'-'0');
        sum=sum+('4'-'0');
        sum=sum+('5'-'0');
        System.out.println("sum = " + sum);// 15
        // System.out.println(); // 개행, 줄바꿈
    }
}
