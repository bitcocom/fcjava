public class SwitchCaseTest {
    public static void main(String[] args) {
        // Q. switch ~ case 문을 활용하여 요일에 해당하는 운동을 출력하세요
        String day="Friday"; // 야구하기
        switch(day){
            case "Sunday" :
                System.out.println("야구하기");
                break;
            case "Monday" :
                System.out.println("농구하기");
                break;
            case "Tuesday" :
            case "Wednesday" :
                System.out.println("수영하기");
                break;
            default:
                System.out.println("휴식");
        }
    }

}
