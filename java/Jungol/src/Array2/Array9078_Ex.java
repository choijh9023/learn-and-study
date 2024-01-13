package Array2;

import java.util.Scanner;

public class Array9078_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] intArrays = new int[3][3];
        int[][] intArrays2 = new int[3][3];
        for (int i = 0; i < intArrays.length; i++) {
            for (int j = 0; j < intArrays.length; j++) {
                intArrays[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < intArrays2.length; i++) {
            for (int j = 0; j < intArrays2.length; j++) {
                intArrays2[i][j] = sc.nextInt();
            }
        }
        int total = 0;
        System.out.println("첫 번째 배열 1행 첫 번째 배열 2행 첫 번째 배열 3행 두 번째 배열 1행 두 번째 배열 2행 두 번째 배열 3행");
        for (int i = 0; i < intArrays.length; i++) {
            for (int j = 0; j < intArrays2.length; j++) {
                total = intArrays[i][j] + intArrays2[i][j];
                System.out.printf("%d ", total);
            }
            System.out.println();
            total = 0;
        }


    }
}