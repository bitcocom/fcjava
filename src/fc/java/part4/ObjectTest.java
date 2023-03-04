package fc.java.part4;

import fc.java.poly.A;

public class ObjectTest {
    public static void main(String[] args) {
        // A 객체를 Upcasting으로 생성하세요.
        A a=new A();
        a.display();
        Object obj=new A(); //  Upcasting
        ((A)obj).display(); // Downcasting
    }
}
