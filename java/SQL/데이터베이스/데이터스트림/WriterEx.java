package SQL.데이터베이스.데이터스트림;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterEx {
    public static void main(String[] args) throws IOException {

        Writer writer = new FileWriter("C:/Temp/test3.text");
        char a = 'A';
        writer.write(a);
        char b = 'B';
        writer.write(b);

        char [] c = {'\n','c','h','o','i','m','o','o','n','s','e','o','k'};
        writer.write(c);

        String str = "\n신세계 자바과정";
        writer.write(str);

        writer.flush();
        writer.close();

    }

}
