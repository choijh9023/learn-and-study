package stream.section2;

import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

//#### 배열로 부터 스트림 얻기 : java.util.Arrays 클래스를 이용하면 다양한 종류의 배열로부터 스트림을 얻어 낼 수 있다.
public class ArrayStreamEx {
    static int total =0;
    static int total1 = 0;
    public static void main(String[] args) throws Exception {
        // 스트링 배열 선언
        String[] strings = {"초코파이", "몽쉘통통", "가나파이", "람다"};
        //1.string 스트림 객체를 얻어, strings의 객체값을 출력하세요.
        Stream<String> stm = Arrays.stream(strings);
        stm.forEach(System.out::println);

        //2. Integer스트림 객체 얻기
        int[] scores = {90, 80, 70, 60, 50, 80, 88};
        //Integer 스트림 객체를 얻어, scores의 각 요소값의 총합, 평균, 해당 요소의 개수를 각각 출력하세요
        Stream<Integer> integerStream = Arrays.stream(scores).boxed();
        int sum = integerStream.mapToInt(Integer::intValue).sum();
        System.out.println("총합 =" + sum);
        Stream<Integer> integerStream1 = Arrays.stream(scores).boxed();
        double avg = integerStream1.mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println("평균 =" + avg);
        Stream<Integer> integerStream2 = Arrays.stream(scores).boxed();
        long count = integerStream2.count();
        System.out.println("해당요소 개수 =" + count);

        //3. 특정범위의 숫자 스트림 얻기(IntStream 또는 LongStream의 적정 메소드 range(),rangedClosed())
        IntStream stream = IntStream.range(1, 101); // range 끝을 포함 안한다
        IntStream stream1 = IntStream.rangeClosed(1, 100); //range는 끝을 포함 한다
            //range는 (a,b) 면 a부터 b까지 더한다 +1씩 // b가 되기 직전까지만 // a <= i < b
            // rangeClosed(a,b)면 a부터 b까지 더한다 +1씩 // b를 포함해서 b가 될때까지 a<= i <=b
        stream.forEach(number -> total += number);
        System.out.println("range의 사용 ="+total);
        stream1.forEach(number -> total1+=number);
        System.out.println("rangeclosed의 사용 =" + total1);

        int row =3;
        int column =5;
        StringBuilder sb = new StringBuilder(); // 스트링 빌더는 그 값을 힙영역에서 새로 저장하는것이 아니라 위로 덮어서 저장한다.

        IntStream.range(0,column).forEach(i -> sb.append("*")); // colum 개수만큼 * 만들기 sb = *****
        IntStream.range(0,row).forEach(i -> System.out.println(sb)); // row만큼 sb == ***** 찍기


        //4.파일로 부터 스트림 얻기
        //io는 input output 의 약자다
        //n이 붙으면 네트워크다.
        //java.nio.Files 의 lines() 이용하면, 텍스트 파일의 행 단위 스트림을 얻을 수 있다.
        Path path = Paths.get(ArrayStreamEx.class.getResource("productlist.txt").toURI());
        Stream<String> filestream = Files.lines(path, Charset.defaultCharset());
        filestream.forEach(line -> System.out.println(line));
        filestream.close();

    }
}
