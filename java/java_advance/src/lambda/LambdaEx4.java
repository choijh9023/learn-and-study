package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//정수배열을 받아 모든 홀수의 합을 반환하는 람다식, 결과 출력 작성
public class LambdaEx4 {

    interface ArrayOperation {
        int calculrateSum(int[] numbers);
    }

    interface FindMax {
        int getMax(List<Integer> numbers);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] arrayNums = {1,2,3,4,5,6,7,8,9};
        int arraysOdd = Arrays.stream(arrayNums).filter(number -> number %2 ==1).sum();
        System.out.println(arraysOdd);

        FindMax max = (numbers) -> {
            int maxNumber =Integer.MIN_VALUE;
            for (int number : numbers) {
                if (number>maxNumber) {
                    maxNumber = number;
                }
            }
        return maxNumber;};

        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("숫자입력");
            int n = input.nextInt();
            numberList.add(n);
        }
        int maxValue = max.getMax(numberList);
        System.out.println("Max value :" + maxValue);
    }


}
