public class ArrayTest {
    public static void main(String[] args) {
        // Q. [실수 5개]를 저장 할 [배열을 생성]하고 모든 원소에 10을 저장하고 출력하세요
        //float f1,f2,f3,f4,f5;
        float[] f=new float[5];
        f[0]=10.5f;
        f[1]=15.5f;
        f[2]=50.5f;
        f[3]=70.5f;
        f[4]=88.5f;
        for(int i=0;i<f.length;i++){
            System.out.println(f[i]);
        }
       // Q. 정수 5개를 아래처럼 [배열에 초기화] 하고 index 0번째와 index 3번째 값을 더하여 출력하세요.
        int[] a={10,20,30,40,50};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        int sum=a[0]+a[3];
        System.out.println("sum = " + sum);
        System.out.println(a.length);

        float[] b=new float[3];
        System.out.println(b[0]); // 0.0
        System.out.println(b[1]);
        System.out.println(b[2]);

        int[] c;
        c=new int[]{10,20,30,40,50};

    }
}
