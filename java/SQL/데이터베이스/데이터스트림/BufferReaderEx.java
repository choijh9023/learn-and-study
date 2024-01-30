package SQL.데이터베이스.데이터스트림;
//24년 1월 30일 버퍼리더 수업
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferReaderEx {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:/Temp/test3.text"));
        String str;
        while(true){
            str = br.readLine();
            if(str == null) break;

            System.out.println(str);

        }
    }
}
