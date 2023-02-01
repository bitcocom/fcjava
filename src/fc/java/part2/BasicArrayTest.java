package fc.java.part2;

public class BasicArrayTest {
    public static void main(String[] args) {
        // Q. 실수 3개를 저장 할 배열을 생성하고 값을 저장하고 출력(기본배열)
        float[] f={24.5f, 45.6f, 77.65f};
        System.out.println(f[0]);
        System.out.println(f[1]);
        System.out.println(f[2]);
        // Q. [책] 3권을 저장 할 [배열을 생성]하고 책3권의 데이터를 저장하고 출력하세요.
        Book[] b=new Book[3]; //  객체배열
        b[0]=new Book();
        b[0].title="자바";
        b[0].price=30000;
        b[0].company="한빛";
        b[0].author="박매일";
        b[0].page=500;
        b[0].isbn="11889900";
        //System.out.println(b[0].title+"\t"+b[0].price+"\t"+b[0].company+"\t"+b[0].author+"\t"+b[0].page+"\t"+b[0].isbn
        b[1]=new Book();
        b[1].title="오라클";
        b[1].price=30000;
        b[1].company="한빛";
        b[1].author="박매일";
        b[1].page=500;
        b[1].isbn="11889900";
        //System.out.println(b[1].title+"\t"+b[1].price+"\t"+b[1].company+"\t"+b[1].author+"\t"+b[1].page+"\t"+b[1].isbn);

        b[2]=new Book();
        b[2].title="인공지능";
        b[2].price=30000;
        b[2].company="한빛";
        b[2].author="박매일";
        b[2].page=500;
        b[2].isbn="11889900";
        //System.out.println(b[2].title+"\t"+b[2].price+"\t"+b[2].company+"\t"+b[2].author+"\t"+b[2].page+"\t"+b[2].isbn);
        for(int i=0;i<b.length;i++){
            System.out.println(b[i].title+"\t"+b[i].price+"\t"+b[i].company+"\t"+b[i].author+"\t"+b[i].page+"\t"+b[i].isbn);
        }
    }
}
