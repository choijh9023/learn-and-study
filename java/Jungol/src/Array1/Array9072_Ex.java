package Array1;

import java.util.Scanner;

public class Array9072_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []intArray = new int[10];
        int total = 0;
        double avg = 0;
        for (int i = 0; i < 10; i++) {
            intArray[i]= sc.nextInt();
            total+=intArray[i];

        }
            avg=total/10.0;
        System.out.printf("총점 = %d\n",total);
        System.out.printf("평균 = %.1f",avg);

    }
}
