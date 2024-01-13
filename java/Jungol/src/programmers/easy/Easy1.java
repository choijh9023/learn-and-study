package programmers.easy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Easy1 {
    public static void main(String[] args) {
        for (int arg : solution1(5,1)) {
            System.out.println(arg);
        }
    }


    static public int[] solution(int start_num, int end_num) {

        int[] answer = new int[start_num - end_num - 1];
        for (int a = 0; a < answer.length; a++) {
            answer[a] = start_num;
            start_num--;
            if (start_num == end_num) {
                break;
            }
        }

        return answer; }

    static public int[] solution1(int start, int end) {
        return IntStream.rangeClosed(-start, -end).map(i -> -i).toArray();
        //이렇게 사용을 하면 받은 정수를  rangeClosed메소드와 map 메소드를 사용해서 Array로 바로 집어 넣어서 한번에
        //적용을 할 수가 있었다
        //여기서 map( i -> -i)은 중간연산을 실행한다.
        //i라는 정수형 변수에 -1로 곱해서 -i로 만들어주는 것이다.
        //하지만 이미 rangeClosed에 들어올때 음수로 변경을 했기 때문에 다시 음수*음수를 연산해서 양수로 변환되는것이다.
        //이렇게 만든 이유는
        //rangeClosed는 (a,b) a와 b사이의값을 생성하는 메소드다.
        //하지만 우리는 내림차순으로 배열에 집어 넣어야 하고 정수가
        // 들어오는 매개변수의 위치가 문제의 요구사항에서 정해져 있기 때문에 이 방식으로 풀 수 있는 것이다.
    }
}





