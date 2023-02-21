package fc.java.part3;

import fc.java.model.MyUtil;

public class StaticAccess {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        // MyUtil
        int sum=MyUtil.hap(a, b); // 클래스이름.호출메서드
        System.out.println(sum); // 30
    }
}
