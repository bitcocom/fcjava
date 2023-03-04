package fc.java.part4;

public class EmployeeTest {
    public static void main(String[] args) {
        // [일반사원] 한명의 객체를 생성하고 데이터를 저장후 출력을 하세요.
        RempVO vo=new RempVO("홍길동",35,"010-1111-1111","2022-11-10","기획부",false);
        // 출력
        //System.out.println(vo.name+"\t"+vo.age+"\t"+vo.phone+"\t"+vo.empDate+"\t"+vo.dept+"\t"+vo.marriage);
        System.out.println(vo.toString());
    }
}
