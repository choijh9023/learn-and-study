package Array1;

import java.util.Scanner;

public class Array9073_Ex {
    public static void main(String[] args) {

        int []intArray = {95,75,85,100,50};
        int num = 4;
        int temp;
        for(int i=4; i>0; i--){
            //버블정렬 이해하기 //  한번 다시 풀어볼 것
            for(int j=0; j<i; j++){

                if(intArray[j]>intArray[j+1]){
                    temp = intArray[j];
                    intArray[j] = intArray[j+1];
                    intArray[j+1] = temp;
                }
            }
        }
        for (int i = 0; i < intArray.length ; i++) {
            System.out.print(intArray[i]+" ");

        }

    }
}
