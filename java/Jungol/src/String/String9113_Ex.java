package String;

import java.util.Arrays;

public class String9113_Ex {
    public static void main(String[] args) {
        String [] str = new String[26]; //넌센스 문제인가 싶었다.
        str[0]="우리나라 대한민국!";       // 출력 문자열은 "우리나라 대한민국"을 해야하고
        System.out.println(str[0]);     //문자열 길이는 26으로 해줘야했다. 그래서 문자열 배열 길이는 26으로 만들고
        System.out.printf("위 문자열의 길이는 %s입니다.",str.length); // 0번쨰인덱스 자리에 출력문자열을 집어넣었다.
    }
}
