public class CallByReferenceExam {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        // 배열의 총합을 구하여 출력하세요?
        int result=addArray(a); // 번지전달(Call By Reference)
        System.out.println("result = " + result);
    }
    // Q. 매개변수로 정수형 배열을 받아서 / 배열의 총합을 구하여 / 리턴 하는 / 메서드를 정의 하세요
    public static int addArray(int[] x){
        int sum=0;
        for(int i=0;i<x.length;i++){
              sum=sum+x[i]; // sum+=a[i];
        }
        return sum;
    }
}
