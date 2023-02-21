import fc.java.part2.Book;

public class ArrayMake {
    public static void main(String[] args) {
        // Q. [정수 5개]를 저장 할 [배열을 생성]하시요
        int[] a=new int[5];
        // 반복문(for, while)
        for(int i=0;i<a.length;i++) {
            a[i]=10;
            System.out.println(a[i]);
        }
        float[] f=new float[5]; // 길이가 고정
        Book b1, b2, b3;
        Book[] b=new Book[3]; // 책 3권을 저장할 배열을 생성
    }
}
