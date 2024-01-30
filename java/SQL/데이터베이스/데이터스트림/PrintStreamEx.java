package SQL.데이터베이스.데이터스트림;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamEx {
    public static void main(String[] args)throws Exception {
        // printf() : fotmat string 형식화된 문자열을 출력
        // File0utStream에 보조로 PrintStream을 연결하여 print(), println(), printf()로 문자열 출력
        // Stream을 출력문에 사용한것이다.
        FileOutputStream fs = new FileOutputStream("printStream.text");
        PrintStream ps = new PrintStream(fs);
        ps.print("hi~");
        ps.print("오늘은 강사님이 시키는 게 너무 많아서 힘들어");
        ps.printf("%d빨리 되었으면 좋겠어",6);
        ps.flush();
        ps.close();
    }
}
