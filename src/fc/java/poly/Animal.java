package fc.java.poly;
// 추상클래스(불완전한 클래스)
public abstract class Animal{
       // 추상메서드
       public abstract void eat(); // 추상메서드(불완전한 메서드) : 메서드의 구현부가 없다
       // 구현메서드
       public void move(){
              System.out.println("무리를 지어서 이동한다.");
       }
}
