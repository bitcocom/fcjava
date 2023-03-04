package fc.java.model;

public class Cat extends Animal{
    public Cat(){
        super(); // new Animal();
    }
    public void night(){
        System.out.println("밤에 눈에서 빛이난다");
    }
    // 재정의(Override)
    public void eat(){
        System.out.println("고양이처럼먹다");
    }
}
