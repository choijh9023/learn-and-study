package String2;

import java.util.Scanner;

public class String9126_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArray = new String[2];
        int count = 0;
        int count1 = 0;
        int a = 0;
        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = sc.next();
        }
        if (strArray[0].length() < strArray[1].length()) {   //더 작은 조건에 변수를 담는 그릇을 담아야 했다.
            a = strArray[0].length();                       //
        } else {
            a = strArray[1].length();
        }

        for (int i = 0; i < a; i++) {
            count += strArray[0].charAt(i);

            for (int j = 0; i < a; i++) {
                count1 += strArray[1].charAt(i);
            }
        }

        if (count < count1) {
            System.out.println(strArray[1] + " 가(이) 더 큽니다.");
        } else if (count > count1) {
            System.out.println(strArray[0] + " 가(이) 더 큽니다.");
        }

        if ((strArray[0].substring(0, 3)).equals(strArray[1].substring(0, 3))) {
            System.out.println("앞의 세 문자가 같습니다.");
        } else {
            System.out.println("앞의 세 문자가 같지 않습니다.");
        }


    }
}
