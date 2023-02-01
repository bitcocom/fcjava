package fc.java.part3;

import fc.java.model.CarDTO;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        // Q. 자동차의 정보를 [키보드로부터 입력] 받아서 [다른 메서드]로 이동 해야 되는 경우를 생각해보자.
        Scanner scan=new Scanner(System.in);
        System.out.print("자동차일년번호:");
        int carSn=scan.nextInt();

        scan.nextLine();

        System.out.print("자동차이름:");
        String carName=scan.nextLine();

        System.out.print("자동차가격:");
        int carPrice=scan.nextInt();

        scan.nextLine();

        System.out.print("자동차소유자:");
        String carOwner=scan.nextLine();

        System.out.print("자동차년식:");
        int carYear=scan.nextInt();

        scan.nextLine();

        System.out.print("자동차타입:"); // G(휘발유), D(경유)
        String carType=scan.nextLine();

        //System.out.println(carSn+"\t"+carName+"\t"+carPrice+"\t"+carOwner+"\t"+carYear+"\t"+carType);
        // 자동차 데이터를 이동하기 위한 바구니가 필요하다.(DTO, VO)
        // 클래스로 CarDTO, CarVO 모델을 설계?
        // carInfoPrint(carSn, carName, carPrice, carOwner, carYear, carType);
        CarDTO car=new CarDTO();
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carType=carType;
        carInfoPrint(car);
    }
    // Q. 매개변수로 자동차의 정보를 받아서 / 출력하는 / 메서드를 정의하세요.
    public static void carInfoPrint(CarDTO car){
        System.out.println(car.carSn+"\t"+car.carName+"\t"+car.carPrice+"\t"+car.carOwner+"\t"+car.carYear+"\t"+car.carType);
    }
}
