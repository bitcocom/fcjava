package fc.java.part4;

import fc.java.poly.Board;

public class ObjectToString {
    public static void main(String[] args) {
        Board b=new Board();
        b.setTitle("게시글입니다.");
        //System.out.println(b.getTitle());
        System.out.println(b.toString()); //fc.java.poly.Board@7a79be86 -> 게시글입니다.
        System.out.println(b);//fc.java.poly.Board@7a79be86 -> 게시글입니다.
    }
}
