package Array2;

import java.util.Scanner;

public class Array9075_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []intArray = new int [10];

        while(true){
            int num = sc.nextInt();
            if(num == 0) break;

            num %= 10; // 1의 자리수 출력 하는 조건

            intArray[num]++;

        }
        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i]!=0){
                System.out.print(i+ " : " + intArray[i]+"개");
                System.out.println();

            }
        }

        /*for (int i = 0; i < intArray.length; i++) {
            intArray[i] = sc.nextInt();
            if(sc.nextInt()==0){
                break;
            }
        }*/


    }
}
