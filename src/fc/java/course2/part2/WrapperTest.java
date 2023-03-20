package fc.java.course2.part2;

public class WrapperTest {
    public static void main(String[] args) {
        //  정수형 변수에 10일 저장하세요.
        int a=10; // 기본자료형
        //Integer aa=new Integer(10); // 사용자정의 자료형
        Integer aa=10; // Auto-boxing
        System.out.println(aa.intValue()); // Unboxing(Integer->int)

        Integer bb=20; // Auto-boxing
        int b=bb; // Auto-Unboxing

        float f=10.5f;
        //Float ff=new Float(10.5f);
        Float ff=45.6f; // new Float(45.6f); Auto-boxing
        System.out.println(ff.floatValue());

        Float af=49.1f;
        System.out.println(af.floatValue());
        float aff=af; // af.floatValue() -> Auto-boxing
        System.out.println(aff);
    }
}
