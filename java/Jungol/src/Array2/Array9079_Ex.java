package Array2;

import java.util.Scanner;

public class Array9079_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][]intArrays = new int[4][4];  //이중배열 3,3 으로 문제가 나왔지만 4,4로 처음에 시작
       int total = 0;
       int total1 = 0;
       int total2 = 0;
       int sum = 0;
        for (int i = 0; i < intArrays.length-1; i++) {
            for(int j = 0; j <intArrays.length-1;j++){
                intArrays[i][j]=sc.nextInt();
            }
        }
        for (int i = 0; i <= intArrays.length-1; i++) {
            for (int j = 0; j <= intArrays.length-2; j++) {  // -1을 -2로 바꾸니까 해결이 되었다.
                    sum+=intArrays[i][j];
                   total +=intArrays[i][j];
                if((j==2)&&(i==0)){
                    intArrays[0][3]=total;
                    total=0;
                }
                if((j==2)&&(i==1)){
                    intArrays[1][3]=total;
                    total=0;
                }
                if((j==2)&&(i==2)){
                    intArrays[2][3]=total;
                    total=0;
                }
                if(i==3){
                    intArrays[3][0]=intArrays[0][0]+intArrays[1][0]+intArrays[2][0];
                    intArrays[3][1]=intArrays[0][1]+intArrays[1][1]+intArrays[2][1];
                    intArrays[3][2]=intArrays[0][2]+intArrays[1][2]+intArrays[2][2];
                }

            }


        }
        intArrays[3][3]=intArrays[0][3]+intArrays[1][3]+intArrays[2][3];

        System.out.println(    "1번째 학생의 점수 2번째 학생의 점수 3번째 학생의 점수      국어 영어 수학 총점");
        System.out.printf(" 1번%4d%4d%4d%4d\n",intArrays[0][0],intArrays[0][1],intArrays[0][2],intArrays[0][3]);
        System.out.printf(" 2번%4d%4d%4d%4d\n",intArrays[1][0],intArrays[1][1],intArrays[1][2],intArrays[1][3]);
        System.out.printf(" 3번%4d%4d%4d%4d\n",intArrays[2][0],intArrays[2][1],intArrays[2][2],intArrays[2][3]);
        System.out.printf("합계%4d%4d%4d%4d\n",intArrays[3][0],intArrays[3][1],intArrays[3][2],intArrays[3][3]);
    }
}
