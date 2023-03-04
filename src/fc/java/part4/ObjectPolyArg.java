package fc.java.part4;

import fc.java.poly.*;
public class ObjectPolyArg {
    public static void main(String[] args) {
        A a=new A();
        display(a);
        B b=new B();
        display(b);
    }
    private static void display(Object obj) { // 다형성인수 활용
        if(obj instanceof A) {
            ((A)obj).printGo();
        }else{
            ((B)obj).printGo();
        }
    }
}
