public class OverloadingTest {
    public static void main(String[] args) {
       float v=add(35.6f, 56.7f);
       System.out.println("v = " + v);
       int vv=add(10,50);
        System.out.println("vv = " + vv);
    }
    // Q. 매개변수로 두개의 정수 값을 받아서 / 총합을 구하여 / 리턴 하는 / [메서드를 정의] 하세요
    public static int add(int a,int b){
        int sum=a+b;
        return sum;
    }
    // Q. 매개변수로 두개의 실수 값을 받아서 / 총합을 구하여 / 리턴 하는 / [메서드를 정의] 하세요.
    public static float add(float a,float b){
        float sum=a+b;
        return sum;
    }
}
