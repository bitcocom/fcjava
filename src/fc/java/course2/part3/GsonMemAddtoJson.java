package fc.java.course2.part3;

import com.google.gson.Gson;
import fc.java.model3.Addrsss;
import fc.java.model3.Person;

public class GsonMemAddtoJson {
    public static void main(String[] args) {
        Addrsss addrsss=new Addrsss("서올","대한민국");
        Person member=new Person("홍길동", 30, "bit@empas.com", addrsss);
        
        // Person -> JSON
        Gson gson=new Gson();
        String json=gson.toJson(member);
        System.out.println("json = " + json);
    }
}
