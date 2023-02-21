package fc.java.part3;

import fc.java.model.Student;

public class StudentTest {
    public static void main(String[] args) {
        // Q. 정수 6개를 저장할 배열을 생선하세요.
        int[] arr=new int[6];
        arr[0]=10;
        arr[1]=30;
        arr[2]=67;
        arr[3]=98;
        arr[4]=55;
        arr[5]=32;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        // Q. 잘 설계된 학생(Student) 객체를 설계하고 데이터를 저장 한 후 출력하세요.
        Student vo=new Student("홍길동","컴퓨터공학과",37,"bit@empas.com",2023110,"010-1111-1111");
        System.out.println(vo.toString());
    }
}
