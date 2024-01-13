package Array2;

import java.util.Arrays;
import java.util.Scanner;

public class Array9074_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] intArray = new int[11];

        while (true) {
            int a = sc.nextInt();
            if ((a < 1) || (a > 10)) {
                break;
            }
            intArray[a]++; // 이 연산은 배열에 +1을 해준다는 연산이다.

        }
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] > 0) { // 처음엔 2번문제와 같은느낌으로  i!=0으로했더니 배열안의 인덱스값을 모두 출력했는데
                                //생각해보니 배열 안에 들어있는 값이 0일 경우를 제외하고싶으면 0보다 클경우로 조건을 걸면 되는거였다.
                                //배열을 너무 어렵게 생각하지말고 하나의 데이터로 생각하고 바라보는 관점이 필요할 것 같다.
                System.out.println(i + " : " + intArray[i] + "개");
            }

        }
    }
}









