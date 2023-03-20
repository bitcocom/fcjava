package fc.java.course2.part1;

import com.google.gson.Gson;
import fc.java.model2.Person;

import java.util.ArrayList;

public class GsonFromAPI {
    public static void main(String[] args) {
        String json="{\"name\":\"John\",\"age\":30}"; // JSON->Person
        Gson gson=new Gson();
        Person p=gson.fromJson(json, Person.class);
        System.out.println(p.getName()); // John
        System.out.println(p.getAge());  // 30
        System.out.println(p.toString());
    }
}
