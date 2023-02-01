package fc.java.part2;

import java.util.Scanner;

public class ScannerExam {
    public static void main(String[] args) {
        // 도서정보 입력받기
        Scanner scan=new Scanner(System.in);
        System.out.print("제목:");
        String title=scan.nextLine();
        System.out.println("title = " + title);

        System.out.print("가격:");
        int price=scan.nextInt(); // 30000_|
        System.out.println("price = " + price);

        scan.nextLine();

        System.out.print("출판사:");
        String company=scan.nextLine();
        System.out.println("company = " + company);

        System.out.print("저자:");
        String author=scan.nextLine();
        System.out.println("author = " + author);

        System.out.print("페이지수:");
        int page=scan.nextInt(); // 700_|
        System.out.println("page = " + page);

        scan.nextLine();

        System.out.print("ISBN:");
        String isbn=scan.nextLine();
        System.out.println("isbn = " + isbn);

        scan.close();
    }
}
