public class GuGuDanTest {
    public static void main(String[] args) {
        // Q. 이중 반복문을 이용하여 아래와 같은 구구단(9X9) 을 출력하세요
        for(int i=2;i<=9;i++){
            System.out.print(i+"단"+"\t\t");
        }
        System.out.println();
        // 2X1=2   3X1=3  4X1=4 ~ 9X1=9
        for(int i=1;i<=9;i++){
            for(int j=2;j<=9;j++){
                System.out.print(j+"X"+i+"="+(j*i)+"\t");
            }
            System.out.println();
        }
    }
}
