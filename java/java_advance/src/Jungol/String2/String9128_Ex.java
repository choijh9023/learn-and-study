package Jungol.String2;

import java.util.Scanner;

public class String9128_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []intArray = new int [2];
        int total = 0;
        double []doubleArray = new double[2];
        double total1 = 0;
        for (int i = 0; i < intArray.length; i++) {
            intArray[i]= sc.nextInt();
            total+=intArray[i];

        }
        System.out.printf("%d + %d = %d\n",intArray[0],intArray[1],total);
        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i]= sc.nextDouble();
            total1+=doubleArray[i];
        }
        System.out.printf("%.2f + %.2f = %.2f",doubleArray[0],doubleArray[1],total1);

    }
}
