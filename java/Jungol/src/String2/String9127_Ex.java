package String2;
import java.util.Arrays;
import java.util.Scanner;

public class String9127_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArray = new String[5];

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = sc.next();
        }
        Arrays.sort(strArray); //정렬해주는 메소드
        System.out.println("단어 5개를 입력하세요.");
        for (String s : strArray) {

            System.out.println(s);
        }

    }}

