package fc.java.model;

public class MemberDTO {
    public String name;
    private int age; // 정보은닉
    public String phone;
    public void paly(){
        System.out.println("운동을 한다.");
    }
}
