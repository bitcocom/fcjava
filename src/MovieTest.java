import fc.java.part2.Movie;

public class MovieTest {
    public static void main(String[] args) {
        // Q. 아래에 예시된 한 편의 [영화] 데이터를 저장하고 출력하시요
        Movie mv=new Movie();
        mv.mtitle="아바타";
        mv.mday="2022.12.14";
        mv.mmajor="제이크 설리";
        mv.mpart="액션";
        mv.mtime=192;
        mv.mlevel=12;
        System.out.println(mv.mtitle+"\t"+mv.mday+"\t"+mv.mmajor+"\t"+mv.mpart+"\t"+mv.mtime+"\t"+mv.mlevel);
    }
}
