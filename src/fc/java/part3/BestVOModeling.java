package fc.java.part3;

import fc.java.model.MovieVO;

public class BestVOModeling {
    public static void main(String[] args) {
        // Q. 형태로 잘 설계된 영화(MovieVO) 객체를 설계하고 데이터를 저장 한 후 출력하세요
        MovieVO vo=new MovieVO("아바타",20221214,"제이크 설리","액션",192.0f,12);
        System.out.println(vo.toString());
        System.out.println(vo.getLevel());
    }
}
