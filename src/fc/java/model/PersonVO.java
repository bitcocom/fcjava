package fc.java.model;

public class PersonVO {
    private String name;
    private int age;
    private String phone;
    // 생략된 생성자 메서드가 있다.=>기본생성자(default Constructor)
    public PersonVO(){
       // 객체를 생성하는 코드는 내부에서 만들어진다.
       // 객체의 초기화를 한다.
    }
    // 생성자의 오버로딩
    public PersonVO(String name, int age, String phone){
        this.name=name;
        this.age=age;
        this.phone=phone;
    }
    // setter method
    public void setName(String name){
        this.name=name;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    // getter method
    public String getName(){
        return name; // this.name
    }
    public int getAge(){
        return age; // this.age
    }
    public String getPhone(){
        return phone; // this.phone
    }
    public String toString(){
        return name+"\t"+age+"\t"+phone;
    }
}
