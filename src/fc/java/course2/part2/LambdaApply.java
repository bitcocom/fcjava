package fc.java.course2.part2;

import fc.java.model2.StringOperation;

public class LambdaApply {
    public static void main(String[] args) {
        StringOperation toUpperCase= s->s.toUpperCase();
        StringOperation toLowerCase= s->s.toLowerCase();

        String input="Lambda Expressions";
        System.out.println(processString(input, toUpperCase)); // LAMBDA EXPRESSIONS
        System.out.println(processString(input, toLowerCase)); // lambda expressions
    }
    public static String processString(String input, StringOperation operation){
        return operation.apply(input);
    }
}
