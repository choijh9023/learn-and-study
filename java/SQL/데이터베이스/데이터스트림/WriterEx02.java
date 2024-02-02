package SQL.데이터베이스.데이터스트림;

import java.io.*;

public class WriterEx02 {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/Temp/실습.text");

            byte a = 5;
            byte b = 5;
            byte c = 5;
            byte d = 5;
            os.write(a);
            os.write(b);
            os.write(c);
            os.write(d);

            byte [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            os.write(arr,0, arr.length-1);
        } catch (IOException io) {

        }
        try{
            InputStream is = new FileInputStream("C:/Temp/실습.text");

            while (true) {

                int data = is.read();
                if(data == -1)break;
                System.out.println(data);
            }



        }catch (IOException io){}


    }
}
