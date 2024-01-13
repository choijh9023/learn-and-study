package String2;

import java.util.Scanner;

public class String9121_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String []str = {"champion","class"};
        String num = sc.next();
        char a = num.charAt(0);
        System.out.print("문자를 입력하세요. ");
        for (int i = 0; i < str.length; i++) {

            if(str[i].charAt(0)==a){
                System.out.println(str[i]);
                System.out.println(str[i+1]);
                break;
            }else{
                System.out.println("찾는 단어가 없습니다.");
                break;
            }

        }

    }
}
