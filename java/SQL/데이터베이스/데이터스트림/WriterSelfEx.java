package SQL.데이터베이스.데이터스트림;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterSelfEx {
    public static void main(String[] args) throws IOException {

        Writer writer = new FileWriter("C:/Temp/test3.text");

        char a = 'A';
        writer.write(a);

        char b = 'b';
        writer.write(b);

        char[] c = {'최', '문', '석'};
        writer.write(c);

        StringBuffer sb = new StringBuffer("새로운 스트링 버퍼");
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));
        System.out.println(System.identityHashCode(sb));
        sb = new StringBuffer("다시 시작 ");
        System.out.println(sb);
        System.out.println(System.identityHashCode(sb));
        StringBuilder str = new StringBuilder("나는 빌더다");
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str));
        str.append("어서오십쇼 추가한겁니다");
        System.out.println(System.identityHashCode(str));
        System.out.println(str);
        // 버퍼와 빌더의 차이는 무엇일까?


    }
}
