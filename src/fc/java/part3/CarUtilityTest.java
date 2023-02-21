package fc.java.part3;

import fc.java.model.CarDTO;
import fc.java.model.CarUtility;

public class CarUtilityTest {
    public static void main(String[] args) {
        // Q. Car 정보를 출력하는 동작을 가지고있는 Utility클래스를 설계하세요.
        int carSn=1110;
        String carName="BMW828i";
        int carPrice=90000000;
        String carOwner="홍길동";
        int carYear=2015;
        String carType="G"; // 'G'->char
        // 데이터를 하나로 묶는다(이동)
        CarDTO car=new CarDTO();
        car.carSn=carSn;
        car.carName=carName;
        car.carPrice=carPrice;
        car.carOwner=carOwner;
        car.carYear=carYear;
        car.carType=carType;
        //carPrint(car);
        CarUtility carUtil=new CarUtility();
        carUtil.carPrint(car);
    }

}
