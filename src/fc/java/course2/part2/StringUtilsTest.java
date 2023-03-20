package fc.java.course2.part2;

import fc.java.model2.Converter;
import fc.java.model2.StringUtils;

public class StringUtilsTest {
    public static void main(String[] args) {
        StringUtils stringUtils=new StringUtils();
        // 인스턴스 메서드 참조
        Converter<String, String> converter=stringUtils::reverse;
        String result=converter.convert("hello");
        System.out.println("result = " + result);
    }
    
}
