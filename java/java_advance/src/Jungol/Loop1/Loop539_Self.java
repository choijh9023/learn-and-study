package Jungol.Loop1;

import java.util.Scanner;

public class Loop539_Self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count =0; //갯수 변수 메인함수에 초기화 (평균값 연산작업을 위해)
        double avg = 0; // 실수형으로 출력하기위해 (평균값 출력하기를 위해)
        int total = 0; //토탈 변수 메인함수에 초기화 (총합 구하기 위해)
        while(true){
            int num = sc.nextInt(); // 100 이상이 나오기전까지 무한으로 입력받기위해  와일트루문 안으로 입력받기
           // count+=num; // count == count + num 이렇게 했다가 안된다는것을 이해했다.
            count ++; /* count는 갯수를 체크하는 변수이기 때문에 count +=num 이 들어오면 안된다
                            후치로 들어오는 숫자만큼 카운트만하기위해
                         **;를 붙여서 이렇게 카운트를 해줘야 한다 */
            total +=num; //total == total + num
            if(num>=100){
                break; //입력받는 도중 100이상이 입력 되면 바로 브레이크
                        // (반복작업안에서 제어작업(브레이크)을해야하기때문에 와일트루문안에 이프문 넣기)
        }


        }

        avg= (double)total/count; //정수형을 나누면 무조건 정수형이기 때문에 나누기를 진행할때 형 저체를 실수로 변환
        System.out.printf("%d\n",total);
        System.out.printf("%.1f",avg);
    }
}
