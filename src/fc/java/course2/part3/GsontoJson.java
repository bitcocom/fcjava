package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.model3.Member;

public class GsontoJson {
    public static void main(String[] args) {
        Member mvo=new Member("홍길동",30, "bit@empas.com");
        // JSON -> { "name" : "홍길동" , "age" : 30, "email" : "bit@empas.com" }
        //  객체생성
        Gson gson=new Gson();
        // Object(Member) -> JSON
        String json=gson.toJson(mvo);
        System.out.println("json = " + json);  // {"name":"홍길동","age":30,"email":"bit@empas.com"}
    }
}
