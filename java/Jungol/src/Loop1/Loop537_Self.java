package Loop1;

import java.util.Scanner;

public class Loop537_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int num = 1;
        int total = 0;

        while(num<inputNum){
            total+=num; //total = total + i
            num++; // i + 1
        }

        System.out.printf("%d", total);

    }
}
