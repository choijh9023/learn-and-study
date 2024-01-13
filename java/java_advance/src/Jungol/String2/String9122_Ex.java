package Jungol.String2;

import java.util.Scanner;

public class String9122_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArray = new String[2];

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = sc.next();

        }

        if (strArray[0].length() > strArray[1].length()) { //배열에1번쨰 인덱스에 있는 문자열 길이가 더 짧을 경우
            System.out.println(strArray[1]);
            System.out.println(strArray[0]);
        } else if (strArray[0].length() < strArray[1].length()) { //배열에0번째 인덱스에 있는 문자열 길이가 더 짧을 경우
            System.out.println(strArray[0]);
            System.out.println(strArray[1]);
        } else {
            System.out.println(strArray[0]);  //그 외에 경우는 배열에 데이터가 저장된 인덱스 순서대로 출력
            System.out.println(strArray[1]);

        }

    }
}
