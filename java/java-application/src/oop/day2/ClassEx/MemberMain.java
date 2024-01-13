package oop.day2.ClassEx;

import oop.day2.ClassEx.sec12.Member;

public class MemberMain {
    public static void main(String[] args) {
       //12월 18일 모닝퀴즈
       //객관식문제 출제의도는 정확히 알아야 하는 이유다.
        /*  1. 3    정답
            2. 4    정답
            3. 4    정답
            4. 3    정답
            5. 4    오답
            6. 3    오답 // 4번이 정답이다. 선언할 수 있다 오버로딩기능으로
            7. 2
    */
    //8번
        Member user1 = new Member ("홍길동","hong","90239023",33);

    //9번

     //10. 못품
        int[] array = {1,5,3,8,2};
        int a = 0;
        for (int i = 0; i < array.length; i++) {


        }System.out.println(a);
     //11. 이너포문 조건식 //array2[i].length 이렇게 만들면 된다.
        int[][]array2 = {{95,86},{83,92,96},{78,83,93,87,88}};
        int total = 0;

        int avg= 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j <array2.length-1+i ; j++) {
                      total+=array2[i][j];

            }

        }
        avg=total/10;
        System.out.printf("%d %d",total,avg);

    //12.

    }
}
