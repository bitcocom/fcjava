public class VDATest {
    public static void main(String[] args) {
      //Q. [정수 : int] 한 개를 저장하기위해서 [변수를 선언] 하시요.
       int v; // 변수선언->기억공간
        v=10;
        System.out.println("v = " + v); // a = 10
      //Q. 변수 a에 10을 저장하고 a에 저장된 값을 변수 b에 저장하고 변수 b에 10을 곱하여 변수 c에 저장하시요.
        int a=10; //변수초기화
        int b=a;
        int c=b*10;
        System.out.println("c = " + c);
      //Q. sum이라는 변수에 1부터 5까지의 수를 누적(accumulate)해서 출력 하시요.
        int sum=0;
        sum=sum+1; // 0+1
        sum=sum+2; // 1+2
        sum=sum+3; // 3+3
        sum=sum+4; // 6+4
        sum=sum+5; // 10+5
        System.out.println("sum = " + sum); // 15
      //Q. x=10, y=20을 저장하고 변수의 값을 서로 교환(swap)하여 출력하시요.
        int x=10;
        int y=20;
        System.out.println("x="+x+":"+"y="+y);
        // 교환(swap)
        int tmp;
        tmp=y;
        y=x;
        x=tmp;
        System.out.println("x="+x+":"+"y="+y);
    }
}
