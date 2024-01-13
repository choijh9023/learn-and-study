package String2;

import java.util.Scanner;

public class String9125_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArray = {"champion","tel","pencil","jungol","olympiad","class","information","lesson","book","lion"};
        System.out.println(strArray[1]);
        System.out.print("문자를 입력하세요. ");
        int count = 0;
        int count1 = 0;
        String st = sc.nextLine();

        for (int j = 0; j < strArray.length; j++) {
           // boolean i = ; //특정 문자열 찾기
            if (strArray[j].contains(st)) {
                System.out.println(strArray[j]);
                count++;
            }


        }
        if (count == 0) {
            System.out.println("찾는 단어가 없습니다.");

        }
        System.out.println();
        System.out.print("문자열을 입력하세요. ");
        String str = sc.next();

        for (int j = 0; j < strArray.length; j++) {
            boolean a = strArray[j].contains(str); //특정 문자열 찾기
            if (a) {
                System.out.println(strArray[j]);
                count1++;
            }




        }
        if (count1 == 0) {
            System.out.print("찾는 단어가 없습니다.");


        }
    }
}
