package fc.java.part3;
public class PersonAccessTest {
    public static void main(String[] args) {
        // Q. Person 클래스에 이름, 나이, 전화번호를 저장하고 출력하세요.
         Person p=new Person();
         p.name="홍길동";
         p.age=1000; // ?
         p.phone="010-1111-1111";
         System.out.println(p.name+"\t"+p.age+"\t"+p.phone);
    }
}
