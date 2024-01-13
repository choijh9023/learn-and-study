package Array1;

import java.util.Scanner;

public class Array9070_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] intArray = new int[10];
        int max = 0;

        for (int i = 0; i < 10; i++) {
            intArray[i] = sc.nextInt();  //입력완료
        }

        for (int i = 1; i < 10; i++) {
            if (intArray[i-1] >= intArray[i]) {
                max = intArray[i-1];
            }else if(intArray[i-1] < intArray[i]){
                max = intArray[i];
            }



        }System.out.println(max);

    }
}

