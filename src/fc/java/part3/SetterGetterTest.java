package fc.java.part3;

import fc.java.model.PersonVO;

public class SetterGetterTest {
    public static void main(String[] args) {
        // Q. setter, getter 메서드를 통해 PersonVO객체에 이름, 나이, 전화번호를 저장하고 출력하세요
        PersonVO vo=new PersonVO();
        //vo.name="홍길동";
        vo.setName("홍길동");
        vo.setAge(50);
        vo.setPhone("010-1111-1111");
        System.out.println(vo.getName()+"\t"+vo.getAge()+"\t"+vo.getPhone());
    }
}
