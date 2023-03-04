package fc.java.part4;

import fc.java.poly.*;

public class IsNotOverride {
    public static void main(String[] args) {
        // 재정의를 안했기 때문에 -> 부모가 명령을 내리면(메세지를 보내면) 오동작을 한다.
        // [다형성을 보장하지 안음] -> 그러면 다형성을 보장할려면?(재정의를 강제로 하도록 만들어 주면 된다)
        // 추상클래스, 인터페이스 등장
        // [다형성이 보장이 된다.]
        Animal ani=new Dog();
        ani.eat(); // ->  개처럼

        ani=new Cat();
        ani.eat(); // -> 고양이처럼

    }
}
