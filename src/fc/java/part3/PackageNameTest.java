package fc.java.part3;
//import java.lang.*; // default package
import java.util.*;
import fc.java.model.*;
public class PackageNameTest {
    public static void main(String[] args) {
        // Q. 지금까지 자바에서 제공해주어서 사용해본 클래스들의 이름을 적어보자?
        String str="홍길동";
        Scanner scan=new Scanner(System.in);
        System.out.println("Hello World");
        // Q. 우리가 직접 만들어서 사용해 본 클래스들의 이름을 적어보자
        CarDTO car=new CarDTO();
        car.carSn=1110;
        CarDAO dao=new CarDAO();

    }

}
