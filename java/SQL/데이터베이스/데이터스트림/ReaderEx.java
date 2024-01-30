package SQL.데이터베이스.데이터스트림;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderEx {
    public static void main(String[] args) throws IOException {
        Reader reader = new FileReader("C:/Temp/test3.text");
        char[] data = new char[20];

        reader.read(data);
        System.out.println(data);


      while (true) {
            int num = reader.read(data);
            if(num==-1)break;
        }
        for (char c : data) {
            System.out.println(c + " ");

        }
      /*      // or 1문자씩 읽어들이기
        Reader reader1 = new FileReader("C:/Temp/test3.txt");

        while (true) {
            int n = reader.read();
            if(n== -1) break;
            System.out.println(data);
        }*/


        }


    }




