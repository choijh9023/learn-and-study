package Loop3;

import java.util.Scanner;
    //정석 대로라면 띄어쓰기를 넣지 않고  3중 포문을 사용해서  처음 삼각형을 만들고
    // 풀어나가야 할 것같은데 일단 다른 풀이를 해야할 것 같아서 공백을 넣어서
    // 위 아래 삼각형을 나누어서 풀이를 했습니다.
public class Loop148_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("# ");

            }System.out.println();
            }
        for (int i =1; i<=num-1 ;i++){
            for(int j = 0; j<2*i;j++){
                System.out.printf(" ");
            }for(int j = i; j<=num-1;j++){
                System.out.printf("# ");
            }
            System.out.println();


        }

        }
    }
