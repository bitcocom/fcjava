package fc.java.course2.part1;

import java.util.Random;

public class RandomAPI {
    public static void main(String[] args) {
        Random rand=new Random();
        int[] arr=new int[6];
        int i=0; // 저장위치(pos)
        while (i<6){
            int num=rand.nextInt(45)+1; // 1~45
            boolean isDuplicate=false;
            for(int j=0;j<i;j++){
                if(arr[j]==num){
                    isDuplicate=true;
                    break;
                }//
            }//
            if(!isDuplicate){
                arr[i++]=num;
            }
        }//
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
