package Jungol.Loop3;

import java.util.Scanner;

public class Loop553_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        char b = 'A';


        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num-i; j++) {
                System.out.print(b++);
            }System.out.println();

        }


    }}
