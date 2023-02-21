package fc.java.model;

import fc.java.model.RempVO;

public class EmployeeTest {
    public static void main(String[] args) {
        //  일반사원 한명을 생성하시오.
        RempVO vo=new RempVO("홍길동",33,"010-1111-1111","2010.01.01","홍보부",true);
        System.out.println(vo);
    }
}
