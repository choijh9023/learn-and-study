package Loop1;

import java.util.Scanner;

public class Loop9041_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 점수입력기를 넣어줄게.

        System.out.print("점수를 입력하세요. "); //점수를 입력할수있는 칸을 만들어줘.
        // 80이상이면 합격메세지를
        while (true) {
            int score = sc.nextInt(); //점수를 입력할게 이제 시작한다.

            if (!(score >= 0 && score <= 100)) {//종료문 끝
                break;
            }

            if (score >= 80) {
                System.out.println("축하합니다. 합격입니다.");
                System.out.print("점수를 입력하세요. ");
            } else {
                System.out.println("죄송합니다. 불합격입니다.");
                System.out.print("점수를 입력하세요. ");
            }
        }
    }
}

//점수를 입력받아 80점 이상이면 합격메시지
// 를 그렇지 않으면
// 불합격 메시지를 출력하는 작업을 반복하다가 0~100점 이외의 점수가 입력되면 종료하는 프로그램을 작성하시오.