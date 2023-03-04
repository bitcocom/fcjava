package fc.java.part4;

import fc.java.model.*;

public class ObjectCasting {
    public static void main(String[] args) {
        // Animal-->Dog, Cat
        Animal ani=new Dog();
        ani.eat();

        ani=new Cat(); // 업케스팅(Upcasting)
        ani.eat();
        //ani.night(); // 다운케스팅(Downcasting)
        //Cat c=(Cat)ani;
        //c.night();
        ((Cat)ani).night();
    }
}
