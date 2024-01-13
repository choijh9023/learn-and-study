package Loop2;

import java.util.Scanner;

public class Loop9052_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;  //총합변수 (선언을 밖에 한이유는 포문이 끝나도 그 값을 유지하기 위해)
        double avg = 0;  //평균변수 (선언을 밖에 한이유는 포문이 끝나도 그 값을 유지하기 위해)
        int count = 0;   //카운트변수 (이건 필요한건지는 모르겠다)

        for (int a = 0; a < 5; a++) { //입력 5번 받기위한 포문
            int num = sc.nextInt();

            count += 1;
            total += num;    //입력 받을때마다 그 값을 토탈 값에 넣는다

            if (count == 5) {  //이건 없어도 될거같긴한데... 어차피 5번의 조건은 포문에서
                            // 나오고 있고
                            //없어지면 밑에 평균 구하는건 내려가면 그만이고

                avg = (double)total/5; // total변수가 인트이기 떄문에 앞에 형변환을 해줘야한다.
            }


        }
        System.out.printf("총점 : %d\n", total);
        System.out.printf("평균 : %.1f", avg);
    }
}
