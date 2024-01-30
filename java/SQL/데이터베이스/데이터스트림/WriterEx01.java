package SQL.데이터베이스.데이터스트림;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
// 24녀 1월 30일 데이터스트림 수업
// 디렉토리는 꼭 있어야 한다.
// 스트림을 사용할때는 항상 예외처리를해줘야한다.
public class WriterEx01 {

    public static void main(String[] args) {

        try {// c:// temp/test1.text 파일에 10 20 30  데이터를 쓰자
            OutputStream os = new FileOutputStream("C:/Temp/test.text"); // 여기에 출력을 할것이다.
            byte a = 10;
            byte b = 20 ;
            byte c = 30;
            os.write(a);
            os.write(b);
            os.write(c);


            /**
             * 배열로 생성
             */
            byte[] d = {10,20,30,40,50}; // 바이트여서 아스키코드로 적으면 메모장에서도 정상적으로 읽힌다.
            os.write(d,0,d.length);

            os.flush(); // 버퍼 스트림
            os.close(); // 스트림을 사용하면 항상 닫아줘야한다.

        }catch(IOException io){

        }

    }

}
