package Jungol.Loop3;

import java.util.Scanner;

public class Loop634_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =0;i<num;i++){
            for(int j =0;j<=i;j++){ // 조건식에 num이 들어오면 첫줄부터 별이 계속 찍히기 때문에
                System.out.printf("*"); // 0값인 i가 들어와야 하고 그후 부터 i는 1부터 차근차근 올라가기 때문에
            }                               // 출력조건 완성
            System.out.println();
        }

    }
}
